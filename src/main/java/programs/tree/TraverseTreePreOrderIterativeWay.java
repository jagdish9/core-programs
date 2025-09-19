package programs.tree;

import java.util.Stack;

public class TraverseTreePreOrderIterativeWay {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        treeNode.left.left = new TreeNode(4);
        treeNode.left.right = new TreeNode(5);
        treeNode.left.right.left = new TreeNode(6);
        treeNode.left.right.right = new TreeNode(7);

        preOrderRecursiveWay(treeNode);

        System.out.println();

        preOrderIterativeWay(treeNode);
    }

    private static void preOrderIterativeWay(TreeNode treeNode) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode currNode = treeNode;

        stack.add(currNode);

        while(!stack.isEmpty()) {
            currNode = stack.pop();
            System.out.print(currNode.data + " ");

            if(currNode.right != null) {
                stack.push(currNode.right);
            }

            if(currNode.left != null) {
                stack.push(currNode.left);
            }
        }
    }

    private static void preOrderRecursiveWay(TreeNode treeNode) {
        if(treeNode != null) {
            System.out.print(treeNode.data + " ");
            preOrderRecursiveWay(treeNode.left);
            preOrderRecursiveWay(treeNode.right);
        }
    }
}
