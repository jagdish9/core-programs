package programs.java8revision.array;

public class FindSecondLargestLinearWay {
    public static void main(String[] args) {
        //int[] arr = {10,30,50,60,20};
        int[] arr = {50,30,10,60,20};

        Integer largest = null;
        Integer secondLargest = null;

        for(int num : arr) {
            if(largest == null || num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num != largest && secondLargest == null) {
                secondLargest = num;
            }
        }

        System.out.println(secondLargest);
    }
}
