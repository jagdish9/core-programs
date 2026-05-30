package programs.company.kpmg;

import java.util.ArrayList;
import java.util.List;

public class PathSum2 {
    public static void main(String[] args) {
        KpmgTreeNode root = new KpmgTreeNode(5);
        root.left = new KpmgTreeNode(4);
        root.right = new KpmgTreeNode(8);
        root.left.left = new KpmgTreeNode(11);
        root.left.left.left = new KpmgTreeNode(7);
        root.left.left.right = new KpmgTreeNode(2);

        PathSum2 pathSum2 = new PathSum2();
        int targetSum = 22;
        List<List<Integer>> result = pathSum2.pathSum(root, targetSum);
        System.out.println(result);
    }

    public List<List<Integer>> pathSum(KpmgTreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();

        if(root == null) {
            return result;
        }

        return pathSumListByDfs(root, result, targetSum);
    }

    public List<List<Integer>> pathSumListByDfs(KpmgTreeNode node,
                                                List<List<Integer>> result, int targetSum) {
        if(node == null) {
            return result;
        }
        List<Integer> subList = new ArrayList<>();
        findNodeList(node, targetSum, result, subList, 0);
        return result;
    }

    public void findNodeList(KpmgTreeNode node, int targetSum,
                             List<List<Integer>> result, List<Integer> subList, int sum) {
        if(node == null) {
            return;
        }

        sum += node.data;

        subList.add(node.data);

        if(node.left == null && node.right == null) {
            if(sum == targetSum) {
                result.add(new ArrayList<>(subList));
            }
        }

        findNodeList(node.left, targetSum, result, subList, sum);
        findNodeList(node.right, targetSum, result, subList, sum);
        subList.remove(subList.size()-1);
    }
}
