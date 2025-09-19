package programs.tree;

public class CheckBalancedTree {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(10);
        treeNode.left = new TreeNode(20);
        treeNode.right = new TreeNode(30);
        treeNode.right.left = new TreeNode(15);
        //treeNode.right.left.left = new TreeNode(18);
        treeNode.left.left = new TreeNode(40);
        treeNode.left.right = new TreeNode(60);

        boolean balancedTree = treeIsBalanced(treeNode);
        System.out.println(balancedTree);
    }

    private static boolean treeIsBalanced(TreeNode treeNode) {
        if(treeNode == null)
            return true;

        int lHeight = heightOfTree(treeNode.left);
        int rHeight = heightOfTree(treeNode.right);

        if(Math.abs(lHeight - rHeight) > 1)
            return false;

        return treeIsBalanced(treeNode.left) && treeIsBalanced(treeNode.right);
    }

    private static int heightOfTree(TreeNode node) {
        //base case
        if(node == null)
            return 0;

        return 1 + Math.max(heightOfTree(node.left), heightOfTree(node.right));
    }
}
