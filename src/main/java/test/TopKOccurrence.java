package test;

import java.util.*;
import java.util.stream.Collectors;

public class TopKOccurrence {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 3};
        int k = 2;

        Map<Integer, Integer> map = new HashMap<>();
        int occured = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                if(!map.containsKey(arr[i]) && arr[i] == arr[j]) {
                    occured++;
                }
            }
            if(!map.containsKey(arr[i])) {
                map.put(arr[i], occured);
                occured = 0;
            }
        }

        List<Integer> output = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey,
                        Map.Entry::getValue,
                        (o, n) -> o,
                        LinkedHashMap::new))
                .entrySet().stream()
                .limit(k)
                .map(m -> m.getKey())
                .toList();

        List<Integer> topKOccurrence = Arrays.stream(arr)
                .boxed()
                        .collect(Collectors.groupingBy(a -> a, Collectors.counting()))
                                .entrySet()
                                        .stream()
                                                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                                                        .collect(Collectors.toMap(Map.Entry::getKey,
                                                                Map.Entry::getValue,
                                                                (o, n) -> o,
                                                                LinkedHashMap::new))
                                                                .entrySet()
                                                                        .stream()
                                                                                .limit(k)
                                                                                        .map(m -> m.getKey())
                                                                                                .toList();


        System.out.println(output);
        System.out.println(topKOccurrence);
    }
}

/*
-----
User
    username, userid
        user having duplicate userids

        select username, userid from User group by userid having count(*) > 1;

-----

minimum heap
maxmium heap

TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
}

root data < left root data
        root data > right root data

checkTreeIBST(TrreNode rootNode) {

}

inOrderTraversal(TreeNode node, int rootData) {
    inOrderTraversal(node.left, rootData);
    int data = node.data;
    inOrderTraversal(node.right, rootData);
}

root left right
left root right
left right root

*/












