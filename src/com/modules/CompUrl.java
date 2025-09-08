package com.modules;

public class CompUrl {
    public static void main(String[] args) {
        String compUrl = "https://gitbox.apache.org/repos/asf?p=sling-org-apache-sling-feature.git";
        if(compUrl != null && compUrl.contains(".apache.") && compUrl.contains(".git") && compUrl.contains("p=")) {
            int indexOf = compUrl.indexOf(".git");
            compUrl = compUrl.substring(0, indexOf);
            String[] urlAttributes = compUrl.split("p=");
            compUrl = "https://github.com/apache/" + urlAttributes[1];
            System.out.println(compUrl);
        }
    }
}
