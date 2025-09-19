package programs.tree;

public class DistanceBetweenTwoNodesBinarySearchTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(12);
        root.right.left = new TreeNode(9);
        root.right.right = new TreeNode(21);
        root.right.right.left = new TreeNode(19);
        root.right.right.right = new TreeNode(25);

        int a = 1, b = 25;
        System.out.println(distanceBetweenTwoKeys(root, a, b));
    }

    private static int distanceBetweenTwoKeys(TreeNode treeNode, int a, int b) {
        if(treeNode == null)
            return 0;

        if(treeNode.data > a && treeNode.data > b)
            return distanceBetweenTwoKeys(treeNode.left, a, b);

        if(treeNode.data < a && treeNode.data < b)
            return distanceBetweenTwoKeys(treeNode.right, a, b);

        return distanceFromRoot(treeNode, a) + distanceFromRoot(treeNode, b);
    }

    private static int distanceFromRoot(TreeNode treeNode, int a) {
        if(treeNode.data == a)
            return 0;
        else if(treeNode.data > a)
            return 1 + distanceFromRoot(treeNode.left, a);
        return 1 + distanceFromRoot(treeNode.right, a);
    }
}
