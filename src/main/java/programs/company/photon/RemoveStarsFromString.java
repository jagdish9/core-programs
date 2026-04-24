package programs.company.photon;

public class RemoveStarsFromString {
    public static void main(String[] args) {
        String input = "leetc**de*";

        String output = getStringAfterRemovalOfStar(input);
        System.out.println(output);
    }

    private static String getStringAfterRemovalOfStar(String input) {
        StringBuilder output = new StringBuilder();

        for(char c : input.toCharArray()) {
            if(c == '*') {
                if(!output.isEmpty())
                    output.deleteCharAt(output.length() - 1);
            } else {
                output.append(c);
            }
        }
        return output.toString();
    }
}

/*
You want to process * from left to right, where each * removes the closest character on its left.
 */
