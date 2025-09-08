package com.hackerrank;

public class SavePrisoners {
    public static void main(String[] args) {
        int n = 5;
        int m = 2;
        int s = 1;

        int warnPrisoner = (s + m - 1) % n;
        if(warnPrisoner == 0)
            warnPrisoner = n;

    }
}
