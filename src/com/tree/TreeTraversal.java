package com.tree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeTraversal {

    public void preOrder(TreeNode root) {
        if(root != null) {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public void InOrder(TreeNode root) {
        if(root != null) {
            InOrder(root.left);
            System.out.print(root.data + " ");
            InOrder(root.right);
        }
    }

    public void postOrder(TreeNode root) {
        if(root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }

    public void levelOrderTraversal(TreeNode root) {
        if(root == null)
            return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            TreeNode node = queue.remove();
            System.out.print(node.data + " ");

            if(node.left != null) {
                queue.add(node.left);
            }

            if(node.right != null) {
                queue.add(node.right);
            }
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        root.left.left.left = new TreeNode(8);

        root.right.left.left = new TreeNode(9);
        root.right.left.right = new TreeNode(10);

        TreeTraversal treeTraversal = new TreeTraversal();
        treeTraversal.preOrder(root);
        System.out.println("\n-----------");
        treeTraversal.InOrder(root);
        System.out.println("\n-----------");
        treeTraversal.postOrder(root);
        System.out.println("\n-----------");
        treeTraversal.levelOrderTraversal(root);
    }
}
