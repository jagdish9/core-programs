package programs.company.optimumforpaypalclient;

public class BinarySearchTreeTraversal {

    static BstNode prev = null;

    public static void main(String[] args) {
       /* BstNode root = new BstNode(50);
        root.left = new BstNode(30);
        root.right = new BstNode(70);
        root.left.left = new BstNode(20);
        root.left.right = new BstNode(40);
        root.right.left = new BstNode(60);
        root.right.right = new BstNode(80);*/

        BstNode root = new BstNode(50);
        insert(root, 30);
        insert(root, 70);
        insert(root, 20);
        insert(root, 40);
        insert(root, 60);
        insert(root, 80);
        System.out.println("Pre Order");
        preOrder(root);

        System.out.println("\nIn Order");
        inOrder(root);

        System.out.println("\nPost Order");
        postOrder(root);

        System.out.println("\n"+isBst(root));
    }

    private static boolean isBst(BstNode root) {
        if(root == null)
            return true;

        if(!isBst(root.left))
            return false;

        if(prev != null && root.data <= prev.data)
            return false;

        prev = root;

        return isBst(root.right);
    }

    private static void postOrder(BstNode root) {
        if(root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }

    private static void inOrder(BstNode root) {
        if(root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    private static void preOrder(BstNode root) {
        if(root != null) {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    private static BstNode insert(BstNode root, int value) {
        if(root == null)
            return new BstNode(value);

        if(value < root.data)
            root.left = insert(root.left, value);
        else if(value > root.data)
            root.right = insert(root.right, value);

        return root;
    }
}

class BstNode {
    int data;
    BstNode left, right;

    public BstNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}