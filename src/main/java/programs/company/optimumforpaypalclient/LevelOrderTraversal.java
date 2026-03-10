package programs.company.optimumforpaypalclient;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LevelOrderTraversal {
    public static void main(String[] args) {
        BstNode root = new BstNode(50);
        insert(root, 30);
        insert(root, 70);
        insert(root, 20);
        insert(root, 40);
        insert(root, 60);
        insert(root, 80);

        traverseLevelOrder(root);
        System.out.println("\n------------\n");
        traverseLevelOrderInSeparateLine(root);
    }

    private static void traverseLevelOrderInSeparateLine(BstNode root) {
        Queue<BstNode> queue = new LinkedList<>();

        queue.add(root);

        while(!queue.isEmpty()) {
            int size = queue.size();

            for(int i = 0; i < size; i++) {
                BstNode tmpNode = queue.poll();

                System.out.print(tmpNode.data + " ");

                if(tmpNode.left != null)
                    queue.add(tmpNode.left);
                if(tmpNode.right != null)
                    queue.add(tmpNode.right);
            }

            System.out.println();
        }
    }

    private static void traverseLevelOrder(BstNode root) {
        Queue<BstNode> queue = new LinkedList<>();

        queue.add(root);

        while(!queue.isEmpty()) {
            BstNode tmpNode = queue.poll();

            System.out.print(tmpNode.data + " ");

            if(tmpNode.left != null)
                queue.add(tmpNode.left);

            if(tmpNode.right != null)
                queue.add(tmpNode.right);
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

/*
        50
       /  \
      30   70
     / \    /  \
    20  40  60  80
 */