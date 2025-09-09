package programs.array;

public class MaximumProductSubArrayReturnSubArray {
    public static void main(String[] args) {
        int[] arr = {-2, 6, -3, -10, 0, 2};
        //int[] arr = {-1, -3, -10, 0, 6};
        //int[] arr = {2, 3, 4};
        MaximumProductSubArrayReturnSubArray maximumProductSubArrayReturnSubArray = new MaximumProductSubArrayReturnSubArray();
        String maxProductSubArray = maximumProductSubArrayReturnSubArray.getMaxProductSubArray(arr);
        System.out.println(maxProductSubArray);
    }

    private String getMaxProductSubArray(int[] arr) {
        int arrLen = arr.length;
        int maxProd = arr[0];
        int startIndex = 0;
        int endIndex = 0;
        for(int i = 0; i < arrLen; i++) {
            int mul = 1;
            for(int j = i; j < arrLen; j++) {
                mul = mul * arr[j];

                // updating result every time
                // to keep track of the maximum product
                if(mul > maxProd) {
                    maxProd = mul;
                    startIndex = i;
                    endIndex = j;
                }
            }
        }

        String subArray = "";
        for(int k = startIndex; k <= endIndex; k++) {
            subArray += String.valueOf(arr[k]) + ",";
        }

        return subArray.substring(0, subArray.length()-1);
    }
}
