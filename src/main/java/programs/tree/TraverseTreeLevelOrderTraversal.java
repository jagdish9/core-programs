package programs.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TraverseTreeLevelOrderTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(9);
        root.right = new TreeNode(12);
        root.left.left = new TreeNode(14);
        root.left.right = new TreeNode(19);
        root.right.left = new TreeNode(23);
        root.right.left.left = new TreeNode(34);

        List<List<Integer>> levelOrder = getLevelOrder(root);
        printLevelOrder(levelOrder);
    }

    private static void printLevelOrder(List<List<Integer>> levelOrder) {
        for(List<Integer> list : levelOrder) {
            System.out.println(list);
        }
    }

    private static List<List<Integer>> getLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if(root == null)
            return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            int size = queue.size();

            List<Integer> levelList = new ArrayList<>();

            for(int i = 0; i < size; i++) {
                TreeNode node = queue.poll();

                if(node != null)
                    levelList.add(node.data);

                if(node != null && node.left != null)
                    queue.add(node.left);

                if(node != null && node.right != null)
                    queue.add(node.right);
            }

            result.add(levelList);
        }

        return result;
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
