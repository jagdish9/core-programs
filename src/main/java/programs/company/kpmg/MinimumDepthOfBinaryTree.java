package programs.company.kpmg;

import java.util.LinkedList;
import java.util.Queue;

public class MinimumDepthOfBinaryTree {
    public static void main(String[] args) {
        KpmgTreeNode root = new KpmgTreeNode(1);
        root.left = new KpmgTreeNode(2);
        root.right = new KpmgTreeNode(3);
        root.left.left = new KpmgTreeNode(4);

        MinimumDepthOfBinaryTree m = new MinimumDepthOfBinaryTree();
        int minDepthCount = m.getMinDepthOfBinaryTree(root);
        System.out.println(minDepthCount);
    }

    private int getMinDepthOfBinaryTree(KpmgTreeNode root) {
        if(root == null)
            return 0;

        Queue<KpmgTreeNode> queue = new LinkedList<>();
        int maxDepth = 1;

        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();

            for(int i = 0; i < size; i++) {
                KpmgTreeNode current = queue.poll();

                if(current != null && (current.left == null || current.right == null)) {
                    return maxDepth;
                }

                if(current.left != null) {
                    queue.add(current.left);
                }

                if(current.right != null) {
                    queue.add(current.right);
                }
            }

            maxDepth++;
        }

        return -1;
    }
}
