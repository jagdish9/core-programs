package programs.tree;

import java.util.LinkedList;
import java.util.Queue;

public class GetHeightOfBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(9);
        root.right = new TreeNode(12);
        root.left.left = new TreeNode(14);
        root.left.right = new TreeNode(19);
        root.right.left = new TreeNode(23);
        root.right.left.left = new TreeNode(34);

        int height = getHeightOfBinaryTree(root);
        System.out.println(height);
    }

    private static int getHeightOfBinaryTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null)
            return 0;

        int level = 0;

        queue.add(root);

        while(!queue.isEmpty()) {
            int size = queue.size();

            for(int i = 0; i < size; i++) {
                TreeNode node = queue.poll();

                if (node != null && node.left != null)
                    queue.add(node.left);

                if (node != null && node.right != null)
                    queue.add(node.right);
            }
            level++;
        }

        return level;
    }
}

/*
     10
    /  \
   9    12
  / \    /
 14  19  23
        /
        34
 */
