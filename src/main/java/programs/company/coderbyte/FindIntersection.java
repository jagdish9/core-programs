package programs.company.coderbyte;

public class FindIntersection {
    public static void main(String[] args) {
        String[] strArr = new String[] {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"};
        String output = getIntersection(strArr);
        System.out.println(output);
    }

    public static String getIntersection(String[] strArr) {
        // code goes here
        String first = strArr[0].replaceAll(" ", "");
        String second = strArr[1].replaceAll(" ", "");

        String[] ch1 = first.split(",");
        String[] ch2 = second.split(",");

        StringBuilder builder = new StringBuilder();

        int i = 0;
        int j = 0;

        while (i < ch1.length && j < ch2.length) {
            int a = Integer.parseInt(ch1[i]);
            int b = Integer.parseInt(ch2[j]);

            if (a == b) {
                builder.append(a).append(",");
                i++;
                j++;
            } else if (a < b) {
                i++;
            } else {
                j++;
            }
        }

        builder.deleteCharAt(builder.toString().length() - 1);
        return builder.toString();
    }

}