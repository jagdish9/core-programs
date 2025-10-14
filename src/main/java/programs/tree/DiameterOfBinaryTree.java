package programs.tree;

public class DiameterOfBinaryTree {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(5);
        treeNode.left = new TreeNode(8);
        treeNode.right = new TreeNode(6);
        treeNode.left.left = new TreeNode(3);
        treeNode.left.right = new TreeNode(7);
        treeNode.right.left = new TreeNode(9);
        treeNode.right.left.left = new TreeNode(11);

        int diameter = getDiameterOfTree(treeNode);
        System.out.println(diameter);
    }

    private static int getDiameterOfTree(TreeNode treeNode) {
        if(treeNode == null)
            return 0;

        int lHeight = getHeight(treeNode.left);
        int rHeight = getHeight(treeNode.left);

        int lDiameter = getDiameterOfTree(treeNode.left);
        int rDiameter = getDiameterOfTree(treeNode.right);

        return Math.max(lHeight + rHeight, Math.max(lDiameter, rDiameter));
    }

    private static int getHeight(TreeNode treeNode) {
        if(treeNode == null)
            return 0;

        return 1 + Math.max(getHeight(treeNode.left), getHeight(treeNode.right));
    }
}
