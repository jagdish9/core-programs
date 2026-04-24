package programs.company.coderbyte;

public class QuestionMarks {
    public static void main(String[] args) {
        //String s = "aa6?9";
        String s = "acc?7??sss?3rr1??????5";
        //String s = "arrb6???4xxbl5???eee5";
        String output = questionsMarks(s);
        System.out.print(output);
    }

    public static String questionsMarks(String str) {
        // code goes here
        char[] ch = str.toCharArray();
        String output = "false";

        for(int i = 0; i < ch.length; i++) {
            if(Character.isDigit(ch[i])) {
                int a = Integer.parseInt(String.valueOf(ch[i]));
                int j = i + 1;
                int qCount = 0;
                while(!Character.isDigit(ch[j])) {
                    if(ch[j] == '?') {
                        qCount++;
                    }
                    j++;
                }
                int b = Integer.parseInt(String.valueOf(ch[j]));
                if(qCount == 3 && (a+b) == 10) {
                    output = "true";
                }
                i = j +1;
            }
        }
        return output;
    }

}
