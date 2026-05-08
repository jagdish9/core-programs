package programs.hackerrank;

import java.util.*;

public class FileRename {
    public static void main(String[] args) {
        List<String> input = Arrays.asList(
                "file", "file", "image", "file(1)", "file"
        );

        List<String> result = getRenameList(input);
        System.out.println(result);
    }

    private static List<String> getRenameList(List<String> input) {
        Map<String, Integer> map = new HashMap<>();
        List<String> result = new ArrayList<>();

        for(String fileName : input) {
            if(!map.containsKey(fileName)) {
                result.add(fileName);
                map.put(fileName, 1);
            } else {
                int k = map.get(fileName);
                String newName = fileName + "(" + k + ")";

                //find next available name
              /*  while(map.containsKey(newName)) {
                    k++;
                    newName = fileName + "(" + k + ")";
                }*/

                result.add(newName);

                //update map
                map.put(fileName, k+1);
                map.put(newName, 1);
            }
        }

        return result;
    }
}

/*
The “File Renaming” problem on HackerRank is a classic string/hashmap problem where you ensure all file names
are unique by appending a suffix like (k) when duplicates appear.
 */