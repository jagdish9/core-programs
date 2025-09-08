package com.basic;

public class LongArrayExample {
    public static void main(String[] args) {
        // Declare and create a long array with a size of 5
        long[] myLongArray = new long[5];

        // Assign values to elements of the array
        myLongArray[0] = 123456789012345L; // Note the 'L' suffix for long literals
        myLongArray[1] = 987654321098765L;
        myLongArray[2] = 555555555555555L;
        myLongArray[3] = 111111111111111L;
        myLongArray[4] = 222222222222222L;

        // Print the elements of the array
        System.out.println("Elements of myLongArray:");
        for (int i = 0; i < myLongArray.length; i++) {
            System.out.println("Element at index " + i + ": " + myLongArray[i]);
        }
    }
}
