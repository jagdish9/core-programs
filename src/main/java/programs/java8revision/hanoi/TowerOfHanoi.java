package programs.java8revision.hanoi;

public class TowerOfHanoi {
    public static void main(String[] args) {
        int n = 3;
        solveHanoi(n, 'A', 'B', 'C');
    }

    private static void solveHanoi(int n, char source, char auxiliary, char destination) {

        //Base case
        if(n == 1) {
            System.out.println("Move disk 1 from "+ source + " to "+ destination);
            return;
        }

        //Step1: Move n-1 disk from source to auxiliary
        solveHanoi(n-1, source, destination, auxiliary);

        //Step2: Move nth disk to destination
        System.out.println("Move disk "+ n + " from "+source + " to "+destination);

        //Step3" Move n-1 disk from auxiliary to destination
        solveHanoi(n-1, auxiliary, source, destination);
    }
}
