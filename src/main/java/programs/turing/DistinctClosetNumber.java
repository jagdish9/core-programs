package programs.turing;

public class DistinctClosetNumber {
    public static void main(String[] args) {
        int[] testArray = {5, 4, 3, 2};
        int closetNumber = getDistinctClosetNumber(testArray);
        System.out.println(closetNumber);
    }

    private static int getDistinctClosetNumber(int[] numbers) {
        int sortedDistance = 0;

        for(int i = 0; i < numbers.length; i++) {
            for(int j = i+1; j < numbers.length; j++) {
                if(numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }


        return sortedDistance;
    }
}
