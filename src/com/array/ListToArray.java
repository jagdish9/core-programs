package com.array;

import java.util.ArrayList;
import java.util.List;

public class ListToArray {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Convert List to String array
        String[] fruitArray = new String[fruits.size()];
        fruitArray = fruits.toArray(fruitArray);

        // Print the array elements
        for (String fruit : fruitArray) {
            System.out.println(fruit);
        }
    }
}
