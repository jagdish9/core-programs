package com.gradle;

public class CheckSubModulePath {
    public static void main(String[] args) {
        String subModulePath = "kotlin-test-junit";
        System.out.println(subModulePath);
        int firstHyphenIndex = 6;
        subModulePath = subModulePath.substring(0, firstHyphenIndex) + '.'
                + subModulePath.substring(firstHyphenIndex + 1);
        System.out.println(subModulePath);
    }
}
