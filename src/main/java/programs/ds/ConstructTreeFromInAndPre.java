package programs.ds;

import java.util.HashMap;
import java.util.Map;

public class ConstructTreeFromInAndPre {
    int preIndex = 0;

    public static void main(String[] args) {
        int[] preOrder = {3, 9, 20, 15, 7};
        int[] inOrder = {9, 3, 15, 20, 7};

        ConstructTreeFromInAndPre tree = new ConstructTreeFromInAndPre();

        TreeNode root = tree.buildTree(preOrder, inOrder);
        System.out.println(root);
        tree.printInOrder(root);
    }

    private void printInOrder(TreeNode root) {
        TreeNode tmp = root;
        if(tmp != null) {
            System.out.print(tmp.val + " ");
            printInOrder(tmp.left);
            printInOrder(tmp.right);
        }
    }

    private TreeNode buildTree(int[] preOrder, int[] inOrder) {
        Map<Integer, Integer> inMap = new HashMap<>();

        for(int i = 0; i < inOrder.length; i++) {
            inMap.put(inOrder[i], i);
        }

        return treeHelper(preOrder, 0, inOrder.length - 1, inMap);
    }

    private TreeNode treeHelper(int[] preOrder, int startIndex, int endIndex, Map<Integer, Integer> inMap) {
        if(startIndex > endIndex)
            return null;

        int rootVal = preOrder[preIndex];
        preIndex++;
        TreeNode root = new TreeNode(rootVal);

        int inIndex = inMap.get(rootVal);
        root.left = treeHelper(preOrder, startIndex, inIndex -1, inMap);
        root.right = treeHelper(preOrder, inIndex + 1, endIndex, inMap);

        return root;
    }
}

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
