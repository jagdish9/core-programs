package programs.company.photon;

public class ProductExceptSelf {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        //int[] arr = {-1,1,0,-3,3};

        int[] output = getProductOfArray(arr);

        for(int i = 0; i < output.length; i++) {
            System.out.print(output[i] + " ");
        }
    }

    private static int[] getProductOfArray(int[] arr) {
        int len = arr.length;
        int[] output = new int[len];

        output[0] = 1; //left product
        for(int i = 1; i < len; i++) {
            output[i] = output[i-1] * arr[i-1];
        }

        int right = 1; // right product
        for(int i = len - 1; i >= 0; i--) {
            output[i] = output[i] * right;
            right = right * arr[i];
        }

        return output;
    }
}
