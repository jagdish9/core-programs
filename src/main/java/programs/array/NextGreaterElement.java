package programs.array;

public class NextGreaterElement {

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4};
        //int[] arr = {6, 8, 0, 1, 3};
        int len = arr.length;
        int[] output = new int[len];

        int k = 0;
        for(int i = 0; i < len; i++) {
            int element = arr[i];
            boolean found = false;
            for(int j = i + 1; j < len; j++) {
                if(arr[j] > element) {
                    output[k] = arr[j];
                    k++;
                    found = true;
                    break;
                }
            }
            if(!found) {
                output[k] = -1;
                k++;
            }
        }


        for(int i = 0; i < len; i++) {
            System.out.print(output[i] + " ");
        }
    }
}
