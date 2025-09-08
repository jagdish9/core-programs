package com.gradle;

import java.util.HashSet;
import java.util.Set;

public class CheckCompUrl {
    public static void main(String[] args) {
        System.out.println(formNpmSourceUrl("https://github.com/emotion-js/emotion", ":@emotion/core:10.0.35"));

        String compUrl = "https://github.com/emotion-js/emotion.git";
        if(compUrl != null && compUrl.endsWith(".git")) {
            String[] compUrlAttributes = compUrl.split("\\.git");
            compUrl = compUrlAttributes[0];
            System.out.println(compUrl);
        }

        String artifactVersion = "4.10.5-oracle-00001";
        String[] versionAttribute = artifactVersion.split("-oracle-");
        artifactVersion = versionAttribute[0];
        System.out.println(artifactVersion);

        /*String license = "MIT*";
        if(license.endsWith("*"))
            license = license.substring(0, license.length()-1);
        System.out.println(license);*/

        Set<String> originalLicenses = new HashSet<>();
        String license = "MIT OR CC0-1.0";
        if(license.contains(" OR ")) {
            String[] allLicenses = license.split(" OR ");
            for(String eachLicense : allLicenses) {
                originalLicenses.add(eachLicense.trim());
            }
        }
        System.out.println(originalLicenses);

        String purl = "pkg:npm/@babel/plugin-transform-modules-systemjs@7.12.13";
        System.out.println(purl);
        int atIndex = purl.indexOf("@");
        purl = purl.substring(0, atIndex) + "%40" + purl.substring(atIndex + 1);
        System.out.println(purl);
    }

    public static String formNpmSourceUrl(String compUrl, String gavId) {
        String sourceUrl = null;
        if(gavId.startsWith(":@emotion/")) {
            if(compUrl.contains("github.com")) {
                sourceUrl = compUrl + "/tree/" + gavId.substring(1).replace(":", "@");
            }
        }
        return sourceUrl;
    }
}
