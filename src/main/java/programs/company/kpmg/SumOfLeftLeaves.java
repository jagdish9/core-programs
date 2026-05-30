package programs.company.kpmg;

public class SumOfLeftLeaves {
    public static void main(String[] args) {
        KpmgTreeNode root = new KpmgTreeNode(3);
        root.left = new KpmgTreeNode(9);
        root.right = new KpmgTreeNode(20);
        root.right.left = new KpmgTreeNode(15);
        root.right.right = new KpmgTreeNode(7);

        SumOfLeftLeaves sumOfLeftLeaves = new SumOfLeftLeaves();
        int sum = sumOfLeftLeaves.sumOfLeftLeaves(root);
        System.out.println(sum);
    }

    public int sumOfLeftLeaves(KpmgTreeNode root) {
        if(root == null) {
            return 0;
        }
        return findLeftSum(root, false);
    }

    public int findLeftSum(KpmgTreeNode node, boolean left) {
        if(node == null) {
            return 0;
        }

        if(node.left == null && node.right == null && left) {
            return node.data;
        }

        return findLeftSum(node.left, true)
                + findLeftSum(node.right, false);
    }
}
