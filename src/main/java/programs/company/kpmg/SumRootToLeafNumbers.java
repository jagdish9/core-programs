package programs.company.kpmg;

public class SumRootToLeafNumbers {
    public static void main(String[] args) {
        KpmgTreeNode root = new KpmgTreeNode(1);
        root.left = new KpmgTreeNode(2);
        root.right = new KpmgTreeNode(3);

        SumRootToLeafNumbers sumRootToLeafNumbers = new SumRootToLeafNumbers();
        int totalSum = sumRootToLeafNumbers.sumNumbers(root);
        System.out.println(totalSum);
    }

    public int sumNumbers(KpmgTreeNode root) {
        int totalSum = 0;
        if(root == null) {
            return 0;
        }
        return totalSum(root, totalSum, "");
    }

    public int totalSum(KpmgTreeNode node, int totalSum, String sum) {
        if(node == null) {
            return 0;
        }

        sum +=  node.data;

        if(node.left == null && node.right == null) {
            int intSum = Integer.parseInt(sum);
            totalSum += intSum;
            return totalSum;
        }

        return totalSum(node.left, totalSum, sum) + totalSum(node.right, totalSum, sum);
    }
}
