package programs.to2array;

public class SearchElementInMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int element = 10;
        boolean index = getElementIndex(arr, element);

        System.out.println(index);
    }

    private static boolean getElementIndex(int[][] arr, int element) {
        int rows = arr.length;
        int cols = arr[0].length;

        for(int r = 0; r < rows; r++) {
            for(int c = 0; c < cols; c++) {
                if(element == arr[r][c]) {
                    return true;
                }
            }
        }

        return false;
    }
}
