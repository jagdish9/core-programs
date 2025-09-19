package programs.tree;

public class DistanceBetweenTwoNodes {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        treeNode.left.left = new TreeNode(4);
        treeNode.left.right = new TreeNode(5);
        treeNode.right.left = new TreeNode(6);
        treeNode.right.right = new TreeNode(7);

        int a = 2;
        int b = 3;

        System.out.println(findDist(treeNode, a, b));
    }

    private static int findDist(TreeNode treeNode, int a, int b) {
        int[] distance1 = {-1};
        int[] distance2 = {-1};
        int[] distance = {0};

        TreeNode lca = findLcaAndDistance(treeNode, a, b, distance1, distance2, distance, 1);

        if(distance1[0] != -1 && distance2[0] != -1) {
            return distance[0];
        }

        if(distance1[0] != -1) {
            distance[0] = findLevel(lca, b, 0);
            return distance[0];
        }

        if(distance2[0] != -1) {
            distance[0] = findLevel(lca, a, 0);
            return distance[0];
        }

        return -1;
    }

    private static int findLevel(TreeNode treeNode, int k, int level) {
        if(treeNode == null) return -1;

        if(treeNode.data == k) return level;

        int leftLevel = findLevel(treeNode.left, k, level + 1);

        if(leftLevel != -1) {
            return leftLevel;
        } else {
            return findLevel(treeNode.right, k, level + 1);
        }
    }

    private static TreeNode findLcaAndDistance(TreeNode treeNode, int a, int b,
                                               int[] distance1, int[] distance2, int[] distance, int level) {
        if(treeNode == null)
            return null;

        if(treeNode.data == a) {
            distance1[0] = level;
            return treeNode;
        }

        if(treeNode.data == b) {
            distance2[0] = level;
            return treeNode;
        }

        TreeNode left = findLcaAndDistance(treeNode.left, a, b, distance1, distance2, distance, level + 1);
        TreeNode right = findLcaAndDistance(treeNode.right, a, b, distance1, distance2, distance, level + 1);

        if(left != null && right != null) {
            distance[0] = distance1[0] + distance2[0] - 2 * level;
        }

        if(left != null) {
            return left;
        } else {
            return right;
        }
    }
}
