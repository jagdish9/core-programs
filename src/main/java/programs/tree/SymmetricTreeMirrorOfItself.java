package programs.tree;

public class SymmetricTreeMirrorOfItself {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(2);
        treeNode.left.left = new TreeNode(3);
        treeNode.left.right = new TreeNode(4);
        treeNode.right.left = new TreeNode(4);
        treeNode.right.right = new TreeNode(3);

        boolean mirror = isTreeMirrorItself(treeNode);
        System.out.println(mirror);
    }

    private static boolean isTreeMirrorItself(TreeNode treeNode) {
        //If tree is empty, it's symmetric
        if(treeNode == null)
            return true;

        return checkLeftAndRightTree(treeNode.left, treeNode.right);
    }

    private static boolean checkLeftAndRightTree(TreeNode left, TreeNode right) {
        if(left == null && right == null)
            return true;

        if(left == null || right == null)
            return false;

        return (left.data == right.data) && checkLeftAndRightTree(left.left, right.right) &&
                checkLeftAndRightTree(left.right, right.left);
    }
}
