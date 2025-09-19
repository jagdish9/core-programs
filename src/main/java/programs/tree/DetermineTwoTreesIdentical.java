package programs.tree;

public class DetermineTwoTreesIdentical {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(50);
        treeNode.left = new TreeNode(40);
        treeNode.right = new TreeNode(60);
        treeNode.left.left = new TreeNode(70);
        treeNode.right.right = new TreeNode(30);

        TreeNode treeNode2 = new TreeNode(50);
        treeNode2.left = new TreeNode(40);
        treeNode2.right = new TreeNode(60);
        treeNode2.left.left = new TreeNode(70);
        treeNode2.right.right = new TreeNode(30);

        boolean identical = isTreeIdentical(treeNode, treeNode2);
        System.out.println(identical);
    }

    private static boolean isTreeIdentical(TreeNode treeNode, TreeNode treeNode2) {
        if(treeNode == null && treeNode2 == null)
            return true;

        if(treeNode == null || treeNode2 == null)
            return false;

        return (treeNode.data == treeNode2.data) &&
                isTreeIdentical(treeNode.left, treeNode2.left) &&
                isTreeIdentical(treeNode.right, treeNode2.right);
    }
}
