package programs.modules;

import java.io.File;

public class SplitHyphenCheck {

    public static void main(String[] args) {
        String version = "1.14.3-x86_64-linux";
        System.out.println(version.split("-")[0]);

        System.out.println(System.getProperty("file.separator"));
        System.out.println(File.separator);

        String s3 = "b3c47ece6a9f5767dff4d88de2de948a6506979e        refs/tags/cpan_path/PHRED/Apache-DBI-1.12.tar.gz\n" +
                "b3c47ece6a9f5767dff4d88de2de948a6506979e        refs/tags/cpan_version/1.12\n" +
                "b3c47ece6a9f5767dff4d88de2de948a6506979e        refs/tags/gitpan_version/1.12\n";
        String[] lines = s3.split("\n");
        for(String line : lines) {
            String[] commits = line.split("\\s");
            System.out.println(commits[0].trim());
        }

        String s4 = "CVE-2024-6197,CVSS:3.1/AV:N/AC:L/PR:N/UI:N/S:U/C:N/I:N/A:H\n" +
                "CVE-2024-6874,CVSS:3.1/AV:N/AC:L/PR:L/UI:N/S:U/C:L/I:N/A:N\n" +
                "CVE-2024-7264,CVSS:3.1/AV:N/AC:L/PR:N/UI:R/S:U/C:N/I:N/A:H\n" +
                "CVE-2024-9681,CVSS:3.1/AV:N/AC:H/PR:N/UI:N/S:U/C:N/I:H/A:L";
        String[] cveData = s4.split("\n");
        for(String cve : cveData) {
            String[] cveAttributes = cve.split("/");
            String[] cveIdWithScore = cveAttributes[0].split(",");
            System.out.println(cveIdWithScore[0].trim()+" -> "+cveIdWithScore[1].trim().replace("CVSS:", ""));
        }
    }
}
