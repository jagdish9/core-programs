package com.spyak;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TrimCheck {

    public static void main(String[] args) {
        String s1 = "    copyright (C) 2012 Stephen Dolan ";
        System.out.println(s1);
        System.out.println(s1.trim());

        String copyrightRegexPattern = "(C|c)opyright\\s?(\\(c\\)|\\(C\\))\\s?[\\d, -]+.*<->(C|c)opyright\\s?(\\(c\\)|\\(C\\))?\\s?([\\d]{4})?(,|->|-|\\s)*\\s?([\\d]{4}).*<->(C|c)opyright\\s?(\\(c\\)|\\(C\\))?\\s?(\\d{4})?(,|-)\\$\\{.*\\}.*<->(C|c)opyright\\s?(\\(c\\)|\\(C\\))?\\s?(\\d{4})?(,|-)\\$.*<->Copyright\\s?\\(c\\)\\s?\\d{4}\\s?(,|-|\\s)?(\\d{4})?\\s?[a-zA-Z_0-9 ,.@$-_<>].*<->Copyright\\s?(\\(c\\)|\\(C\\))?\\s?([\\d]{4})(,| |-|\\s)*\\s?([\\d]{4})?[a-zA-Z_0-9 ,.@$-_<>].*<->(C|c)opyright\\s?(\\(c\\)|\\(C\\))?\\s?(\\d{4})?(,|-)\\$\\{.*\\}.*";

        String text = "MIT License\n" +
                "\n" +
                "Copyright (c) 2018 Berry Schoenmakers\n" +
                "\n" +
                "Permission is hereby granted, free of charge, to any person obtaining a copy\n" +
                "of this software and associated documentation files (the \"Software\"), to deal\n" +
                "in the Software without restriction, including without limitation the rights\n" +
                "to use, copy, modify, merge, publish, distribute, sublicense, and/or sell\n" +
                "copies of the Software, and to permit persons to whom the Software is\n" +
                "furnished to do so, subject to the following conditions:\n" +
                "\n" +
                "The above copyright notice and this permission notice shall be included in all\n" +
                "copies or substantial portions of the Software.\n" +
                "\n" +
                "THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n" +
                "IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n" +
                "FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n" +
                "AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n" +
                "LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,\n" +
                "OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE\n" +
                "SOFTWARE.\n";
        getCopyrightMatchedText(text, copyrightRegexPattern);
    }

    public static Set<String> getCopyrightMatchedText(String text, String copyrightRegexPattern) {
        Set<String> copyrightSets = new HashSet<>();
        String[] copyrightPatterns = copyrightRegexPattern.split("<->");
        for(String copyrightPattern : copyrightPatterns) {
            Pattern licensePattern = Pattern.compile(copyrightPattern, Pattern.CASE_INSENSITIVE);
            Matcher matcher = licensePattern.matcher(text);
            while(matcher.find()){
                copyrightSets.add(matcher.group().trim());
            }
        }
        return copyrightSets;
    }
}
