package programs.tree;

public class CheckChildrenSumPropertyInBinaryTree {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(10);
        treeNode.left = new TreeNode(8);
        treeNode.right = new TreeNode(2);
        treeNode.left.left = new TreeNode(3);
        treeNode.left.right = new TreeNode(5);
        treeNode.right.left = new TreeNode(2);

        boolean childrenSumToParent = isChildrenSumToRoot(treeNode);
        System.out.println(childrenSumToParent);
    }

    private static boolean isChildrenSumToRoot(TreeNode treeNode) {
        if(treeNode == null || (treeNode.left == null && treeNode.right == null))
            return true;

        int sum = 0;

        if(treeNode.left != null)
            sum += treeNode.left.data;

        if(treeNode.right != null)
            sum += treeNode.right.data;

        return (treeNode.data == sum) && isChildrenSumToRoot(treeNode.left)
                && isChildrenSumToRoot(treeNode.right);
    }
}

/*
       10
      /  \
     8    2
    / \   /
   3   5  2
*/
