package programs.company.kpmg;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePath {
    public static void main(String[] args) {
        KpmgTreeNode root = new KpmgTreeNode(1);
        root.left = new KpmgTreeNode(2);
        root.right = new KpmgTreeNode(3);
        root.left.left = new KpmgTreeNode(4);

        BinaryTreePath binaryTreePath = new BinaryTreePath();
        List<String> list = binaryTreePath.getPathList(root);
        list.forEach(System.out::println);
    }

    private List<String> getPathList(KpmgTreeNode root) {
        List<String> result = new ArrayList<>();

        if(root == null) {
            return result;
        }

        pathByDfs(root, "", result);

        return result;
    }

    private void pathByDfs(KpmgTreeNode node, String path, List<String> result) {

        if(node == null) {
            return;
        }

        if(path.isEmpty()) {
            path = String.valueOf(node.data);
        } else {
            path += "->" + node.data;
        }

        if(node.left == null && node.right == null) {
            result.add(path);
            return;
        }

        pathByDfs(node.left, path, result);
        pathByDfs(node.right, path, result);
    }
}
