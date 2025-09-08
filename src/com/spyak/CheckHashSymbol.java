package com.spyak;

public class CheckHashSymbol {

    public static void main(String[] args) {
        String sourceUrl = "https://github.com/rails/rails/tree/v6.1.7.10/actionmailer";
        String toplevelSourceUrl = null;
        int slashIndex = 0;
        if (sourceUrl.contains("github.com")) {
            if(sourceUrl.contains("/rel/")){
                slashIndex = getSlashIndexForToplevel(sourceUrl);
            }
            else {
                slashIndex = getSlashIndex(sourceUrl);
            }
        }

        if (slashIndex != 0) {
            toplevelSourceUrl = sourceUrl.substring(0, slashIndex);
        }

        if(toplevelSourceUrl == null) {
            toplevelSourceUrl = sourceUrl;
        }

        System.out.println(sourceUrl);
        System.out.println(toplevelSourceUrl);
    }

    public static int getSlashIndexForToplevel(String sourceUrl) {
        int count = 0;
        int slashIndex = 0;
        for(int i = 0; i < sourceUrl.length(); i++) {
            if(sourceUrl.charAt(i) == '/') {
                count++;
                if(count == 8) {
                    slashIndex = i;
                }
            }
        }
        return slashIndex;
    }

    public static int getSlashIndex(String sourceUrl) {
        int count = 0;
        int slashIndex = 0;
        for(int i = 0; i < sourceUrl.length(); i++) {
            if(sourceUrl.charAt(i) == '/') {
                count++;
                if(count == 7) {
                    slashIndex = i;
                }
            }
        }
        return slashIndex;
    }
}
