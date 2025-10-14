package programs.tree;

public class BinaryTreeSubTreeOfAnotherTree {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(26);
        treeNode.left = new TreeNode(10);
        treeNode.right = new TreeNode(3);
        treeNode.left.left = new TreeNode(4);
        treeNode.left.right = new TreeNode(6);
        treeNode.left.left.right = new TreeNode(30);

        TreeNode subTreeNode = new TreeNode(10);
        subTreeNode.left = new TreeNode(4);
        subTreeNode.right = new TreeNode(6);
        subTreeNode.left.right = new TreeNode(30);
        
        boolean subTree = isSubTreeOfAnotherTree(treeNode, subTreeNode);
        System.out.println(subTree);
    }

    private static boolean isSubTreeOfAnotherTree(TreeNode treeNode, TreeNode subTreeNode) {
        if(subTreeNode == null)
            return true;
        if(treeNode == null)
            return false;

        if(isTreeIdentical(treeNode, subTreeNode))
            return true;

        return isSubTreeOfAnotherTree(treeNode.left, subTreeNode) ||
                isSubTreeOfAnotherTree(treeNode.right, subTreeNode);
    }

    private static boolean isTreeIdentical(TreeNode treeNode, TreeNode subTreeNode) {
        if(treeNode == null && subTreeNode == null)
            return true;
        if(treeNode == null || subTreeNode == null)
            return false;

        return (treeNode.data == subTreeNode.data) &&
                isTreeIdentical(treeNode.left, subTreeNode.left) &&
                isTreeIdentical(treeNode.right, subTreeNode.right);
    }
}
