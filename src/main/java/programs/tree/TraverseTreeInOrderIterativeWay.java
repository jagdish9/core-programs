package programs.tree;

import java.util.Stack;

public class TraverseTreeInOrderIterativeWay {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        treeNode.left.left = new TreeNode(4);
        treeNode.left.right = new TreeNode(5);
        treeNode.left.right.left = new TreeNode(6);
        treeNode.left.right.right = new TreeNode(7);

        InOrderRecursiveWay(treeNode);

        System.out.println();

        inOrderTraversalIterativeWay(treeNode);
    }

    private static void inOrderTraversalIterativeWay(TreeNode treeNode) {
        Stack<TreeNode> stack = new Stack<>();

        TreeNode currNode = treeNode;

        while(true) {
            if(currNode != null) {
                stack.push(currNode);
                currNode = currNode.left;
            } else {
                if(stack.isEmpty())
                    break;

                currNode = stack.peek();
                System.out.print(currNode.data + " ");
                stack.pop();

                currNode = currNode.right;
            }
        }
    }

    private static void InOrderRecursiveWay(TreeNode treeNode) {
        if(treeNode != null) {
            InOrderRecursiveWay(treeNode.left);
            System.out.print(treeNode.data + " ");
            InOrderRecursiveWay(treeNode.right);
        }
    }
}
