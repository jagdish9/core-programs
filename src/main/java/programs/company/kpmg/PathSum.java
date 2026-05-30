package programs.company.kpmg;

import java.util.ArrayList;
import java.util.List;

public class PathSum {
    public static void main(String[] args) {
       /* KpmgTreeNode root = new KpmgTreeNode(1);
        root.left = new KpmgTreeNode(2);
        root.right = new KpmgTreeNode(3);
        root.left.left = new KpmgTreeNode(4);*/

        KpmgTreeNode root = new KpmgTreeNode(5);
        root.left = new KpmgTreeNode(4);
        root.right = new KpmgTreeNode(8);
        root.left.left = new KpmgTreeNode(11);
        root.left.left.left = new KpmgTreeNode(7);
        root.left.left.right = new KpmgTreeNode(2);

        PathSum pathSum = new PathSum();
        int targetSum = 22;
        boolean present = pathSum.hasPathSum(root, targetSum);
        System.out.print(present);
    }

    public boolean hasPathSum(KpmgTreeNode root, int targetSum) {
        if(root == null) {
            return false;
        }

        return pathSumByDfs(root, 0, targetSum);
    }

    public boolean pathSumByDfs(KpmgTreeNode node, int sum, int targetSum) {
        if(node == null) {
            return false;
        }

        if(sum == 0) {
            sum = node.data;
        } else {
            sum += node.data;
        }

        if(node.left == null && node.right == null) {
            if(sum == targetSum) {
                return true;
            }
        }

        return pathSumByDfs(node.left, sum, targetSum) || pathSumByDfs(node.right, sum, targetSum);
    }
}
