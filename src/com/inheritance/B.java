package com.inheritance;

public class B extends A{
    public B(String s) {
        super(s); // without super keyword, it will give compilation error
        System.out.print("B");
    }

    public static void main(String[] args) {
        new B("C");
        System.out.println();
    }
}
