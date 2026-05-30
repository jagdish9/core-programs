package programs.company.zopsmart;

public class ProductOfArrayExceptIndexItself {
    public static void main(String[] args) {
        int[] arr = {5, 3, 6, 8, 10};
        int[] output = new int[arr.length];
        int k = 0;

        for(int i = 0; i < arr.length; i++) {
            int product = 1;
            for(int j = 0; j < arr.length; j++) {
                if(i != j) {
                    product *= arr[j];
                }
            }
            output[k++] = product;
        }

        for(int i = 0; i < output.length; i++) {
            System.out.print(output[i] + " ");
        }
    }
}

/*
Given an array of integers, how would you write a Java function to create a
new array such that each element at
 index i of the new array is the product of all the numbers
  in the original array except the one at i?
*/