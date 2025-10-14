package programs.tree;

import java.util.ArrayList;
import java.util.List;

public class CheckTreeIsBST {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(2);
        treeNode.left = new TreeNode(1);
        treeNode.right = new TreeNode(3);
        treeNode.right.right = new TreeNode(5);

        boolean treeIsBST = isTreeBST(treeNode);
        System.out.println(treeIsBST);
    }

    private static boolean isTreeBST(TreeNode treeNode) {
        List<Integer> output = new ArrayList<>();
        traverseNode(treeNode, output);

        return isTreeSorted(output);
    }

    private static boolean isTreeSorted(List<Integer> output) {
        for(int i = 0; i < output.size() - 1; i++) {
            if(output.get(i) > output.get(i+1)) {
                return false;
            }
        }
        return true;
    }

    // InOrder
    private static void traverseNode(TreeNode treeNode, List<Integer> output) {
        if(treeNode != null) {
            traverseNode(treeNode.left, output);
            output.add(treeNode.data);
            traverseNode(treeNode.right, output);
        }
    }
}
