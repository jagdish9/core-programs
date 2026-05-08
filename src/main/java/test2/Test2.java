package test2;

public class Test2 {

    public static void main(String[] arg) {
        int[] arr = {5, 6, 7, 8, 9, 10};
        int search = 9;

        int index = getIndex(arr, search);
        System.out.println(index);
    }

    private static int getIndex(int[] arr, int search) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == search)
                return i;
        }

        return -1;
    }
}
