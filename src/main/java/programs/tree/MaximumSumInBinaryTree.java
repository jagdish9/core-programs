package programs.tree;

public class MaximumSumInBinaryTree {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(10);
        treeNode.left = new TreeNode(30);
        treeNode.right = new TreeNode(15);
        treeNode.left.left = new TreeNode(20);
        treeNode.left.right = new TreeNode(5);

        int maxSum = getMaximumSum(treeNode);
        System.out.println(maxSum);
    }

    private static int getMaximumSum(TreeNode treeNode) {
        if(treeNode == null)
            return 0;

        int maxSum = Integer.MIN_VALUE;

        findMaxSum(treeNode, 0, maxSum);

        return maxSum;
    }

    private static void findMaxSum(TreeNode treeNode, int currentMaximum, int maxSum) {
        if(treeNode == null)
            return;

        currentMaximum += treeNode.data;

        if(treeNode.left == null && treeNode.right == null) {
            if(currentMaximum > maxSum) {
                maxSum = currentMaximum;
            }
        }

        findMaxSum(treeNode.left, currentMaximum, maxSum);
        findMaxSum(treeNode.right, currentMaximum, maxSum);
    }
}
