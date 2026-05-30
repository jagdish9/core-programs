package programs.company.kpmg;

import java.util.Stack;

public class MaximumDepthOfBinaryTree {
    public static void main(String[] args) {
        KpmgTreeNode root = new KpmgTreeNode(1);
        root.left = new KpmgTreeNode(2);
        root.right = new KpmgTreeNode(3);
        root.left.left = new KpmgTreeNode(4);

        MaximumDepthOfBinaryTree m = new MaximumDepthOfBinaryTree();
        int maxDepthCount = m.getMaxDepthCountUsingDfsWithRecursion(root);
        System.out.println(maxDepthCount);

        int depthCount = m.getMaxDepthCountUsingDfsWithCustomStack(root);
        System.out.println(depthCount);
    }

    private int getMaxDepthCountUsingDfsWithCustomStack(KpmgTreeNode root) {
        if(root == null) {
            return 0;
        }

        Stack<Pair> stack = new Stack<>();

        //Start with root at depth 1
        stack.push(new Pair(root, 1));

        int maxDepth = 0;

        while (!stack.isEmpty()) {
            Pair current = stack.pop();

            KpmgTreeNode node = current.node;
            int depth = current.depth;

            maxDepth = Math.max(depth, maxDepth);

            if(node.left != null) {
                stack.push(new Pair(node.left, depth + 1));
            }

            if(node.right != null) {
                stack.push(new Pair(node.right, depth + 1));
            }
        }

        return maxDepth;
    }

    private int getMaxDepthCountUsingDfsWithRecursion(KpmgTreeNode root) {
        if(root == null) {
            return 0;
        }

        int leftCount = getMaxDepthCountUsingDfsWithRecursion(root.left);

        int rightCount = getMaxDepthCountUsingDfsWithRecursion(root.right);

        return 1 + Math.max(leftCount, rightCount);
    }
}

class Pair {
    KpmgTreeNode node;
    int depth;

    public Pair(KpmgTreeNode node, int depth) {
        this.node = node;
        this.depth = depth;
    }
}
