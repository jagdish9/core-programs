package programs.gradle;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public static void main(String[] args) {
        String artifact = "kotlin-test-junit";
        String[] elements = artifact.split("-");
        int combinationLength = 3;

        List<List<String>> combinations = generateCombinations(elements, combinationLength);

        for (List<String> combination : combinations) {
            System.out.println(combination);
            StringBuilder subArtifact = new StringBuilder();
            for (String element : combination) {
                subArtifact.append(element).append("-");
            }
            if(subArtifact.toString().endsWith("-")) {
                subArtifact.deleteCharAt(subArtifact.length() - 1);
            }
            System.out.println(subArtifact);
            int firstHyphenIndex = subArtifact.indexOf("-");
            subArtifact.setCharAt(firstHyphenIndex, '.');
            System.out.println(subArtifact);
        }
    }

    public static List<List<String>> generateCombinations(String[] elements, int combinationLength) {
        List<List<String>> combinations = new ArrayList<>();
        generateCombinationsHelper(elements, combinationLength, 0, new ArrayList<>(), combinations);
        return combinations;
    }

    private static void generateCombinationsHelper(String[] elements, int combinationLength, int startIndex, List<String> currentCombination, List<List<String>> combinations) {
        if (currentCombination.size() == combinationLength) {
            combinations.add(new ArrayList<>(currentCombination));
            return;
        }

        for (int i = startIndex; i < elements.length; i++) {
            currentCombination.add(elements[i]);
            generateCombinationsHelper(elements, combinationLength, i + 1, currentCombination, combinations);
            currentCombination.remove(currentCombination.size() - 1);
        }
    }
}
