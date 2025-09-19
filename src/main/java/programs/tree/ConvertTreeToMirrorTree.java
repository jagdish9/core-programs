package programs.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ConvertTreeToMirrorTree {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        treeNode.left.left = new TreeNode(4);
        treeNode.left.right = new TreeNode(5);

        List<Integer> list = printTreeInLevelOrder(treeNode);
        System.out.println(list);
        System.out.println();

        mirror(treeNode);
        list = printTreeInLevelOrder(treeNode);
        System.out.println(list);
    }

    private static List<Integer> printTreeInLevelOrder(TreeNode treeNode) {
        List<Integer> output = new ArrayList<>();

        if(treeNode == null)
            return output;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(treeNode);

        while(!queue.isEmpty()) {
            int size = queue.size();

            for(int i = 0; i < size; i++) {
                TreeNode node = queue.poll();

                if(node != null)
                    output.add(node.data);

                if(node != null && node.left != null)
                    queue.add(node.left);

                if(node != null && node.right != null)
                    queue.add(node.right);
            }
        }

        return output;
    }

    private static void mirror(TreeNode treeNode) {
        if(treeNode == null)
            return;

        mirror(treeNode.left);
        mirror(treeNode.right);

        TreeNode node = treeNode.left;
        treeNode.left = treeNode.right;
        treeNode.right = node;
    }
}
