package com.spyak;

public class IndexOfCheck {
    public static void main(String[] args) {
        String gavId = "tomcat-native/1:1.2.36-1.el9/aarch64";
        int slashCount = getSlashNumbers(gavId);
        if (slashCount > 0) {
            int firstSlashIndex = gavId.indexOf('/');
            int lastSlashIndex = gavId.lastIndexOf('/');
//            if(gavId.contains("/1:")) {
//                gavId = gavId.substring(0, firstSlashIndex) + "-" + gavId.substring(firstSlashIndex + 3, lastSlashIndex) + "." + gavId.substring(lastSlashIndex + 1);
//            }
//            else {
                gavId = gavId.substring(0, firstSlashIndex) + "-" + gavId.substring(firstSlashIndex + 1, lastSlashIndex) + "." + gavId.substring(lastSlashIndex + 1);
            //}
            System.out.println(gavId);
        }
    }

    public static int getSlashNumbers(String artifact) {
        int slashCount = 0;
        for(int i = 0; i < artifact.length(); i++) {
            if(artifact.charAt(i) == '/') {
                slashCount++;
            }
        }
        return slashCount;
    }
}
