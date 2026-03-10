package programs.company.altimetrik;

public class CheckTreeIsBST {
    public static void main(String[] args) {
        BSTTreeNode root = new BSTTreeNode(5);
        root.left = new BSTTreeNode(3);
        root.right = new BSTTreeNode(8);
        root.left.left = new BSTTreeNode(2);
        root.left.right = new BSTTreeNode(4);
        root.right.left = new BSTTreeNode(7);

        boolean bst = checkBST(root);

        System.out.println(bst);
    }

    private static boolean checkBST(BSTTreeNode root) {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private static boolean validate(BSTTreeNode root, long min, long max) {
        if(root == null)
            return true;

        if(root.data <= min || root.data >= max)
            return false;

        return validate(root.left, min, root.data) &&
                validate(root.right, root.data, max);
    }
}

class BSTTreeNode {
    int data;
    BSTTreeNode left;
    BSTTreeNode right;

    public BSTTreeNode(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
