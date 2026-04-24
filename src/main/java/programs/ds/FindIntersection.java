package programs.ds;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {
    public static void main(String[] args) {
        String str1 = "1, 3, 4, 7, 13";
        String str2 = "1, 2, 4, 13, 15";
        String[] input = {str1, str2};
        List<String> result = getIntersectionValue(input);
        System.out.println(result);
    }

    private static List<String> getIntersectionValue(String[] input) {
        String[] str1 = input[0].split(",");
        String[] str2 = input[1].split(",");

        int i = 0;
        int j = 0;
        List<String> result = new ArrayList<>();

        while(i < str1.length && j < str2.length) {
            int a = Integer.parseInt(str1[i].trim());
            int b = Integer.parseInt(str2[j].trim());

            if(a == b) {
                result.add(String.valueOf(a));
                i++;
                j++;
            } else if(a < b) {
                i++;
            } else {
                j++;
            }
        }

        return result;
    }
}
