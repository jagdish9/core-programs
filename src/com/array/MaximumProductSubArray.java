package com.array;

public class MaximumProductSubArray {
    public static void main(String[] args) {
        int[] arr = {-2, 6, -3, -10, 0, 2};
        //int[] arr = {-1, -3, -10, 0, 6};
        //int[] arr = {2, 3, 4};
        MaximumProductSubArray maximumProductSubArray = new MaximumProductSubArray();
        System.out.println(maximumProductSubArray.getMaxProduct(arr));
    }

    private int getMaxProduct(int[] arr) {
        int arrLen = arr.length;
        int maxProd = arr[0];
        for(int i = 0; i < arrLen; i++) {
            int mul = 1;
            for(int j = i; j < arrLen; j++) {
                mul = mul * arr[j];

                // updating result every time
                // to keep track of the maximum product
                //maxProd = Math.max(maxProd, mul);
                if(mul > maxProd) {
                    maxProd = mul;
                }
            }
        }
        return maxProd;
    }
}
