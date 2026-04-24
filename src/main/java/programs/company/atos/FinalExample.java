package programs.company.atos;

public final class FinalExample {

    public final int ax = 25;

    public final int add(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {
        FinalExample fex = new FinalExample();
        //fex.ax = 29; // can not assign value to final variable

        System.out.println(fex.add(4, 5));
    }
}

/*public final class FinalExample1 {

    public final int ax = 25;

    public final int add(int a, int b) {
        return a+b;
    }
}*/

/*class FinalChild extends FinalExample1 {

}*/ // can not inherit final class

/*class FinalChild1 extends FinalExample {

    *//*@Override
    public int add(int a, int b) {
        return a + b;
    }*//* // can not override final method

    public void show() {
        System.out.println();
    }

}*/
