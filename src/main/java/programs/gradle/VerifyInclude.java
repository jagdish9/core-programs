package programs.gradle;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VerifyInclude {
    public static void main(String[] args) {
       /* String filePath = "C:\\Softwares\\work\\task_details\\daily task\\17-June-2025\\settings.gradle";
        Set<String> includeList = getSubcomponents(new File(filePath));
        System.out.println(includeList);*/
        /*String s1 = ":concurrent:concurrent:1.3.4";
        System.out.println(s1.substring(1));*/

        String s0 = "v3.1.0";
        System.out.println(s0.substring(1));

        String s01 = "com.oracle";
        System.out.println(s01);
        String s2 = "2018.12.13";
        String[] versionAttributes = s2.split("\\.");
        String secondAttribute = versionAttributes[1];
        int versionSecondAttribute = Integer.parseInt(secondAttribute);
        int digitCount = (int)Math.floor(Math.log10(versionSecondAttribute) + 1);
        System.out.println(digitCount);
        if(digitCount == 1 && !secondAttribute.startsWith("0")) {
            versionAttributes[1] = 0+secondAttribute;
            StringBuilder correctVersion = new StringBuilder();
            for(String correctedVersion : versionAttributes) {
                correctVersion.append(correctedVersion).append(".");
            }
            System.out.println(correctVersion.deleteCharAt(correctVersion.length() - 1));
        } else {
            System.out.println(s2);
        }
    }

    public static Set<String> getSubcomponents(File settingsFile) {
        Set<String> includeLines = new HashSet<>();
        Set<String> finalIncludeText = new HashSet<>();
        StringBuilder gitText = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(settingsFile))) {
            String curLine;
            while ((curLine = bufferedReader.readLine()) != null) {
                gitText.append(curLine).append("\n");
            }
        }
        catch (IOException ioe) {
            System.out.append("Error while reading gradle file");
        }
        String[] texts = gitText.toString().split("\n");
        List<String> includeText = getIncludeText(gitText.toString(), "include\\s+\\'?\\\"?:?\\w*(-|_|:)?\\w*\\'?\\\"?.*");
        if(!includeText.isEmpty()) for(String text : includeText) {
            if(text.startsWith("include ") || text.contains("include ")) {
                includeLines.add(text);
            }
        }

        if(includeLines.isEmpty()) for(String text : texts) {
            if(text.startsWith("include ") || text.contains("include")) {
                text = text.replace("\"","")
                        .replace("'", "")
                        .replace("(","")
                        .replace(")", "").trim();
                includeLines.add(text);
            }
        }

        boolean endsWithComma = false;
        if(!includeText.isEmpty()) {
            String textFirstLine = includeText.get(0);
            if (textFirstLine.startsWith("include ") && textFirstLine.endsWith(",")) {
                endsWithComma = true;
            }
        }

        if(endsWithComma) for(String text : texts) {
            if(text.endsWith(",")) {
                includeLines.add(text);
            }
        }

        for(String text : includeLines) {
            if(text.startsWith("//") || text.startsWith("*") || text.startsWith("/*")) continue;
            text = text.replace("\"","")
                    .replace("'", "")
                    .replace("(","")
                    .replace(")", "")
                    .replace(",", "")
                    .replace("include", "")
                    .replace(" ", "")
                    .replace(":", "/").trim();
            finalIncludeText.add(text);
        }
        return finalIncludeText;
    }

    public static List<String> getIncludeText(String gitLicenseText, String regexPattern) {
        Pattern licensePattern = Pattern.compile(regexPattern, Pattern.CASE_INSENSITIVE);
        Matcher matcher = licensePattern.matcher(gitLicenseText);
        List<String> includeLines = new ArrayList<>();
        while(matcher.find()){
            String group = matcher.group();
            includeLines.add(group);
        }
        return includeLines;
    }
}
