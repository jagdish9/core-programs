package programs.company.nablepre;

public class RemoveDuplicateUsingBruteForce {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 5, 5, 6};

        for(int i = 0; i < arr.length; i++) {

            boolean duplicate = false;
            for(int j = 0; j < i; j++) {
                if(arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }
            }

            if(!duplicate) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

/*
Time Complexity: O(n)
Space Complexity: O(n)

when interviewer says no extra space allowed
 */
