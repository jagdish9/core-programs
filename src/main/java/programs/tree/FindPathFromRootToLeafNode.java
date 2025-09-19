package programs.tree;

import java.util.*;

public class FindPathFromRootToLeafNode {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        treeNode.left.left = new TreeNode(4);
        treeNode.left.right = new TreeNode(5);
        treeNode.left.right.left = new TreeNode(6);
        treeNode.left.right.right = new TreeNode(7);
        List<Integer> path = findPathFromRootToLeaf(treeNode, 7);
        System.out.println(path);

    }

    private static List<Integer> findPathFromRootToLeaf(TreeNode treeNode, int leafNodeData) {
        List<Integer> arr = new ArrayList<>();

        if(treeNode == null) {
            return arr;
        }

        getFullPath(treeNode, arr, leafNodeData);

        return arr;
    }

    private static boolean getFullPath(TreeNode treeNode, List<Integer> arr, int leafNodeData) {
        if(treeNode == null)
            return false;

        arr.add(treeNode.data);

        if(treeNode.data == leafNodeData)
            return true;

        if(getFullPath(treeNode.left, arr, leafNodeData) || getFullPath(treeNode.right, arr, leafNodeData))
            return true;

        // if the target value not found, backtrack
        arr.remove(arr.size() - 1);

        return false;
    }
}
