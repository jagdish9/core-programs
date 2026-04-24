package programs.validate;

public class StrongPassword {
    public static void main(String[] args) {
        //String password = "2bbbb";
        //String password = "Ab1";
        String password = "#HackerRank";

        int minimumSteps = minimumNumber(password.length(), password);
        System.out.print(minimumSteps);
    }

    private static int minimumNumber(int len, String password) {
        char[] chars = password.toCharArray();

        //boolean inputLen = len >= 6;
        boolean hasDigit = false;
        boolean hasLower = false;
        boolean hasUpper = false;
        boolean hasSpecial = false;

        String specialChars = "!@#$%^&*()-+";

        for(char c : chars) {
            if(Character.isDigit(c)) hasDigit = true;
            else if(Character.isLowerCase(c)) hasLower = true;
            else if(Character.isUpperCase(c)) hasUpper = true;
            else if(specialChars.contains(String.valueOf(c))) hasSpecial = true;
        }

        int missing = 0;
        //if(!inputLen) missing++;
        if(!hasDigit) missing++;
        if(!hasLower) missing++;
        if(!hasUpper) missing++;
        if(!hasSpecial) missing++;

        return Math.max(missing, 6 - len);
        //return missing;
    }
}

/*
Its length is at least 6.
It contains at least one digit.
It contains at least one lowercase English character.
It contains at least one uppercase English character.
It contains at least one special character. The special characters are: !@#$%^&*()-+
 */