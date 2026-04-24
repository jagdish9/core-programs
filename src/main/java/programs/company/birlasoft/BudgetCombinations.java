package programs.company.birlasoft;

import java.util.*;
import java.util.stream.Collectors;

public class BudgetCombinations {
    public static void main(String[] args) {
        BudgetCombinations bc = new BudgetCombinations();
        String[] items = {"Sauce1", "Cheese1", "Potato Patty3", "Wheat Bread1", "Bean Patty2"};
        int[] prices = {1, 1, 3, 1, 2};

        List<List<String>> combinations = Arrays.asList(
                Arrays.asList("Cheese1", "Potato Patty3", "Wheat Bread1", "Bean Patty2"),
                Arrays.asList("Sauce1", "Cheese1", "Potato Patty3", "Wheat Bread1"),
                Arrays.asList("Sauce1", "Cheese1", "Wheat Bread1", "Bean Patty2"),
                Arrays.asList("Potato Patty3", "Wheat Bread1", "Bean Patty"),
                Arrays.asList("Cheese1", "Wheat Bread1", "Bean Patty2"));

        int budget = 10;

        Map<String, Integer> map = new HashMap<>();
        int i = 0;
        for(String item : items) {
            map.put(item, prices[i]);
            i++;
        }

        List<List<String>> output = bc.getBudgetCombination(combinations, map, budget);

        System.out.println(output);

        List<List<String>> output2 = bc.getBudgetCombinationUsingStream(combinations, map, budget);

        System.out.println(output2);

        List<List<String>> output3 = bc.getBudgetCombinationUsingStreamOptimizedVersion(combinations, map, budget);

        System.out.println(output3);
    }

    //Cleaner & Optimized Version (Avoid double stream)
    private List<List<String>> getBudgetCombinationUsingStreamOptimizedVersion(List<List<String>> combinations, Map<String, Integer> map, int budget) {

        return combinations.stream()
                .filter(combination -> {
                    int totalCost = 0;

                    for(String item : combination) {
                        Integer price = map.get(item);
                        if(price == null)
                            return false;
                        totalCost += price;
                        if(totalCost > budget)
                            return false;
                    }

                    return totalCost >= 0 && totalCost <= budget;
                })
                .collect(Collectors.toList());
    }

    //Here iterating thrice over combination, we can use optimized version
    private List<List<String>> getBudgetCombinationUsingStream(List<List<String>> combinations, Map<String, Integer> map, int budget) {
        List<List<String>> result = combinations.stream()
                .filter(combination -> {
                    int totalCost = combination.stream()
                            .filter(k -> map.containsKey(k))
                            .mapToInt(k -> map.get(k))
                            .sum();
                    return totalCost <= budget
                            && combination.stream().allMatch(k -> map.containsKey(k));
                })
                .collect(Collectors.toList());
        return result;
    }

    private List<List<String>> getBudgetCombination(List<List<String>> combinations,
                                                    Map<String, Integer> map, int budget) {
        List<List<String>> output = new ArrayList<>();
        for(List<String> combination : combinations) {
            int itemCount = 0;
            int itemPriceCost = 0;
            for(String eachItem : combination) {
                Integer price = map.get(eachItem);
                if(price == null)
                    break;
                itemCount++;
                itemPriceCost += price;
                if(itemPriceCost > budget)
                    break;
            }
            if(itemPriceCost <= budget && itemCount == combination.size()) {
                output.add(combination);
            }
        }
        return output;
    }
}

// Customer can buy with budget, he can buy combinations only, he can not individual items.
//Show all those combinations.
//Budget can be changed
