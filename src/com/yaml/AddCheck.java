package com.yaml;

public class AddCheck {

    public static void main(String[] args) {
        int a = 927+528+367+185+14+2+11+2+9+14+15+10+33+3+3+7+3+4+1+7+7+8+12+474+5+8+3+9+20+12+24+4891;
        System.out.println(a);

        String s = "3.4.200.v20130326-1255";
        String[] s2 = s.split(".v");
        System.out.println("v"+s2[1].split("-")[0]);

        String s1 = "org.apache.hbase:hbase-protocol:1.2.0-cdh5.11.0";
        String[] gavAttribute  = s1.split(":");
        String groupId = gavAttribute[0];
        String artifactId = gavAttribute[1];
        String version = gavAttribute[2];
        String[] versionAttribute = version.split("-cdh");
        String newGav = groupId + ":" + artifactId + ":" + versionAttribute[0];
        System.out.println(newGav);

        String ver = "2.9.4.redhat-1";
        System.out.println(ver.split(".redhat")[0]);
        String ver1 = "2.0.0.Final-redhat-00001";
        System.out.println(ver1.split("-redhat")[0]);

        String s3 = "4.2.12.fuse-7_10_1-00006-redhat-00001";
        System.out.println(s3.split(".fuse")[0]);

        String s4 = "2.4.1-jbossorg-1";
        System.out.println(s4.split("-jbossorg")[0]);

        String s5 = "2.6.0-mr1-cdh5.13.0";
        System.out.println(s5.split("-mr1")[0]);

        String s6 = "0.98.3-hadoop3";
        System.out.println(s6.split("-hadoop")[0]);
    }
}
