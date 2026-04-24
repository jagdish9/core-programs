package programs.ds;

import java.util.HashMap;
import java.util.Map;

public class ConstructTreeFromInAndPost {
    int postIndex;

    public static void main(String[] args) {
        int[] postOrder = {9, 15, 7, 20, 3};
        int[] inOrder = {9, 3, 15, 20, 7};

        ConstructTreeFromInAndPost tree = new ConstructTreeFromInAndPost();
        TreeNode2 root = tree.buildTree(postOrder, inOrder);
        System.out.println(root);
        tree.printInOrder(root);
    }

    private void printInOrder(TreeNode2 root) {
        TreeNode2 tmp = root;
        if(tmp != null) {
            System.out.print(tmp.val + " ");
            printInOrder(tmp.left);
            printInOrder(tmp.right);
        }
    }

    private TreeNode2 buildTree(int[] postOrder, int[] inOrder) {
        postIndex = postOrder.length - 1;
        Map<Integer, Integer> inMap = new HashMap<>();

        for(int i = 0; i < inOrder.length; i++) {
            inMap.put(inOrder[i], i);
        }

        return treeHelper(postOrder, 0, inOrder.length - 1, inMap);
    }

    private TreeNode2 treeHelper(int[] postOrder, int startIndex, int endIndex, Map<Integer, Integer> inMap) {
        if(startIndex > endIndex)
            return null;

        int rootVal = postOrder[postIndex];
        postIndex--;
        TreeNode2 root = new TreeNode2(rootVal);

        int inIndex = inMap.get(rootVal);

        root.right = treeHelper(postOrder, inIndex + 1, endIndex, inMap);
        root.left = treeHelper(postOrder, startIndex, inIndex - 1, inMap);

        return root;
    }
}

class TreeNode2 {
    int val;
    TreeNode2 left, right;

    public TreeNode2(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
