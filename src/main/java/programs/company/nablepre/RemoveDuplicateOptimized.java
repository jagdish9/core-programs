package programs.company.nablepre;

public class RemoveDuplicateOptimized {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 5, 5, 6};

        int j = 0;

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }

        for(int k = 0; k <= j; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}

/*
Time Complexity: O(n)
Space Complexity: O(1)
 */