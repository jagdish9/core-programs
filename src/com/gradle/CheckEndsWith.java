package com.gradle;

public class CheckEndsWith {
    public static void main(String[] args) {
        String artifactNameWithPath = "/libraries/kotlin-test-junit";
        String lastSubArtifact = artifactNameWithPath;
        if(artifactNameWithPath.contains("-")) {
            int firstHyphenIndex = artifactNameWithPath.lastIndexOf("-");
            lastSubArtifact = artifactNameWithPath.substring(0, firstHyphenIndex) + '.'
                    + artifactNameWithPath.substring(firstHyphenIndex + 1);
        }
        System.out.println(lastSubArtifact);
    }
}
