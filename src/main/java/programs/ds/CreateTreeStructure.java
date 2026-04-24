package programs.ds;

import java.util.HashMap;
import java.util.Map;

public class CreateTreeStructure {
    public static void main(String[] args) {
        String input = "[(1,2), (2,4), (5,7), (7,2), (9,5)]";

        boolean output = canCreateTree(input);
        System.out.println(output);
    }

    private static boolean canCreateTree(String input) {
        input = input.replaceAll("[^0-9, ]", "");
        Map<Integer, Integer> childParent = new HashMap<>();
        Map<Integer, Integer> parentCount = new HashMap<>();

        for(String eachNode : input.split(", ")) {
            String[] nodeValues = eachNode.split(",");
            int child = Integer.parseInt(nodeValues[0].trim());
            int parent = Integer.parseInt(nodeValues[1].trim());

            if(childParent.containsKey(child))
                return false;

            childParent.put(child, parent);

            parentCount.put(parent, parentCount.getOrDefault(parent, 0) + 1);

            if(parentCount.get(parent) > 2)
                return false;
        }

        return true;
    }
}
