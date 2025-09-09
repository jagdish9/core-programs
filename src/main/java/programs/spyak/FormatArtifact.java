package programs.spyak;

public class FormatArtifact {

    public static void main(String[] args) {
        String[] data = {"python-wsgiref/0.1.2-4/all",
        "quartz/1.8.4-5.el5sat/noarch",
                "rh-java-common-ecj/1:4.4.2-2.1.el6/noarch",
                "org.eclipse.birt.chart.device.swt/2.6.1.v20100812",
                "org.eclipse.birt.chart.engine.extension/2.6.0.v20100601",
                "org.eclipse.birt.core/2.6.0.v20100526",
                "icu4j/1:4.0.1-3.3.el6/x86_64",
                "jakarta-commons-dbcp/1.2.2-108.4.10/noarch",
                "jakarta-commons-logging/1.0.4-326.1.1/noarch",
                "java-1_8_0-openj9-headless/1.8.0.242-1.39/s390x",
                "java-1.8.0-openjdk-portable-devel/1:1.8.0.352.b08-1.fc38.1/x86_64",
                "javax.servlet.jsp/2.0.0.v200806031607",
                "jetty-http/9.2.1-2.fc21/noarch",
                "jline/0.9.94-lp151.3.1/noarch",
                "jna/3.4.0-1.1.2/noarch",
                "jraduget/kaleido-repository:feb03b518041ee81e779ac6d34239d7f250c8c53",
                "apache-commons-daemon/1.0.15-lp152.3.9/x86_64",
                "apache-commons-el/1.0-42.module_f32+6163+c0e6dcb2/noarch",
                "apache-commons-lang3/3.11-1.module_f34+10775+1e739c8d/noarch",
                "libservlet2.2-java/3.3-2/all",
                "openjdk-8-jre-headless/8u242-b08-1~deb9u1/mipsel",
                "openjdk-8-jre-headless/8u352-ga-1~20.04/i386",
                "openplanets/plato:v4.alpha",
                "OpenRefine/OpenRefine:3.4-beta2",
                "twall/jna:3.0.7",
                "xerces-j2/2.11.0-3.3.1/noarch",
                "zlib1g/1:1.2.11.dfsg-2+deb11u1/amd64",
                "zookeeper/3.3.5+dfsg1-1ubuntu1/all",
                "kafka-kit/0.10.2.2-1.1/x86_64",
                "lib-saxon-java/6.4.4-1/all",
                "libc3p0-java/0.9.1.2-7/all",
                "libclassworlds-java/1.0.1-1.1/all",
                "libcommons-beanutils-java/1.8.0~beta-1/all",
                "libcommons-collections-java/2.1.1-3/all",
                "libdnsjava-java/2.1.5-0.1/all",
                "libeclipse-jdt-apt-pluggable-core-java/1.2.100+eclipse4.8-1/all",
                "libhsqldb-java/2.2.9+dfsg-4ubuntu1/all",
                "libidn11-java/1.30-1/all",
                "libjackson-json-java/1.5.3+dfsg1-1/all",
                "libjaxp1.2-java/1.2.01-3/all",
                "libjersey1-core-java/1.19.1-1/all",
                "liblog4j1.2-java/1.2.15-4/all",
                "libpng/v1.6.37",
                "libservlet2.3-java/4.0-10/all",
                "libxalan2-java/2.0.1-1/all",
                "maven30-joda-time/2.2-3.tzdata2013c.6.el6/noarch",
                "ecj/4.4.0-2.3/noarch",
                "eclipse-birt/2.6.0-1.1.el6/i686",
                "excalibur-avalon-framework-api/4.3.1-14.1.3/noarch",
                "expat/1.95.5",
                "glassfish-annotation-api/1.2-7.fc21/noarch",
                "glassfish-mail/1:2.1.1-b31-2/all",
                "glassfish-servlet-api/3.1.0-18.module_f30+8484+fc0ca30b/noarch",
                "h2/1.4.192-2.fc26/noarch",
                "hsqldb/2.4.1-2.104/noarch"};

        for (String orgGavId : data) {
           /* orgGavId = orgGavId.replace(".el6", "").replace(".el7", "")
                    .replace(".el8", "").replace(".el9", "");*/
            String endText = null;
            boolean rpmArtifact = false;
            if(orgGavId.endsWith("/all")) {
                orgGavId = orgGavId.replace("/all", "");
                endText = ".all";
                rpmArtifact = true;
            } else if(orgGavId.endsWith("/noarch")) {
                orgGavId = orgGavId.replace("/noarch", "");
                endText = ".noarch";
                rpmArtifact = true;
            } else if(orgGavId.endsWith("/amd64")) {
                orgGavId = orgGavId.replace("/amd64", "");
                endText = ".amd64";
                rpmArtifact = true;
            } else if (orgGavId.endsWith("/x86_64")) {
                orgGavId = orgGavId.replace("/x86_64", "");
                endText = ".x86_64";
                rpmArtifact = true;
            } else if (orgGavId.endsWith("/mipsel")) {
                orgGavId = orgGavId.replace("/mipsel", "");
                endText = ".mipsel";
                rpmArtifact = true;
            } else if (orgGavId.endsWith("/i386")) {
                orgGavId = orgGavId.replace("/i386", "");
                endText = ".i386";
                rpmArtifact = true;
            }
            else if (orgGavId.endsWith("/s390x")) {
                orgGavId = orgGavId.replace("/s390x", "");
                endText = ".s390x";
                rpmArtifact = true;
            }
            if(rpmArtifact) {
                if (orgGavId.contains("/") && orgGavId.contains(":")) {
                    String[] gavData = orgGavId.split(":");
                    String artifactName = gavData[0].replace("/", "-");
                    String version = gavData[1];
                    System.out.println(artifactName + "-" + version + endText);
                } else if (orgGavId.contains("/")) {
                    String[] gavData = orgGavId.split("/");
                    String artifactName = gavData[0];
                    String version = gavData[1];
                    System.out.println(artifactName + "-" + version + endText);
                }
            }
            else {
                System.out.println(orgGavId);
            }
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
