package com.array;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCheck {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);

        //arr.forEach(n -> System.out.println(n));

        List<Integer> arr2 = new ArrayList<>();
        arr2.add(60);
        arr2.add(70);
        arr2.add(80);
        arr2.add(90);
        arr2.add(100);

        List<List<Integer>> arr3 = new ArrayList<>();
        arr3.add(arr);
        arr3.add(arr2);

        arr3.forEach(data -> {
            data.forEach(n -> {
                System.out.print(n + " ");
            });
            System.out.println();
        });

        /*arr3.stream().flatMap(List::stream)
        .forEach(n -> System.out.println(n + " "));*/

        int[][] input = new int[2][5];
        int i = 0;
        for(List<Integer> data : arr3) {
            int j = 0;
            for(Integer eachData : data) {
                input[i][j] = eachData;
                j++;
            }
            i++;
        }

        int[][] grid = new int[4][4];
        System.out.println();

        for(int x = 0; x < 2; x++) {
            for (int y = 0; y < 5; y++) {
                System.out.print(input[x][y] + " ");
            }
            System.out.println();
        }
    }
}
