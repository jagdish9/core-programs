package programs.tree;

public class TraverseTreePostOrderIterativeWay {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        treeNode.left.left = new TreeNode(4);
        treeNode.left.right = new TreeNode(5);
        treeNode.left.right.left = new TreeNode(6);
        treeNode.left.right.right = new TreeNode(7);

        postOrderRecusriveWay(treeNode);
    }

    private static void postOrderRecusriveWay(TreeNode treeNode) {
        if(treeNode != null) {
            postOrderRecusriveWay(treeNode.left);
            postOrderRecusriveWay(treeNode.right);
            System.out.print(treeNode.data + " ");
        }
    }
}
