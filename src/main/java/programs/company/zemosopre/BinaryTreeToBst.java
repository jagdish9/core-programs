package programs.company.zemosopre;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class BinaryTreeToBst {

    static class BstNode {
        int data;
        BstNode left, right;

        public BstNode(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static void main(String[] args) {
        BstNode root = new BstNode(10);
        root.left = new BstNode(2);
        root.right = new BstNode(7);
        root.left.left = new BstNode(8);
        root.left.right = new BstNode(4);

        List<Integer> ls = new ArrayList<>();
        traverseInorder(root, ls);

        Collections.sort(ls);

        arrayToBst(root, ls.iterator());

        printInorder(root);
    }

    private static void printInorder(BstNode root) {
        if(root != null) {
            printInorder(root.left);
            System.out.print(root.data + " ");
            printInorder(root.right);
        }
    }

    private static void arrayToBst(BstNode root, Iterator<Integer> iterator) {
        if(root == null)
            return;

        arrayToBst(root.left, iterator);
        root.data = iterator.next();
        arrayToBst(root.right, iterator);
    }

    private static void traverseInorder(BstNode root, List<Integer> ls) {
        if(root != null) {
            traverseInorder(root.left, ls);
            ls.add(root.data);
            traverseInorder(root.right, ls);
        }
    }
}
