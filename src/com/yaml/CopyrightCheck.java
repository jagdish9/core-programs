package com.yaml;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CopyrightCheck {

    public static void main(String[] args) {
        String copyrightPattern = "\\d{4}\\s?(,|\\s)?(\\d{4})?.*";
        String copyrightDigitPattern = "(\\d{4}|\\d{2})\\s?(\\s)?(\\d{4}|\\d{2})?";
        String copyrightDigitAndCharPattern = "<?~?Copyright\\s?(\\(c\\)|\\(C\\))?\\s?.*([\\d]{4})(,| |-|\\s)*\\s?([\\d]{4}|[\\d]{2})?.*";
        String copyrightReservedPattern = "(All Rights Reserved|All rights reserved|all rights reserved).?";

        String REGEX = "^[0-9]*$";
        String s2 = "Copyright 2014 - Present Rafael Winterhalter\n" +
                "Copyright, 2017, by [Samuel G. D. Williams](http://www.codeotaku.com/samuel-williams).\n" +
                "Copyright &#169; 2019 Eclipse Foundation. All rights reserved.\n" +
                "Copyright (c) 2002-2020 \"Neo4j,\n" +
                "copyright: '© 2020 Denis Pushkarev (zloirock.ru)'\n" +
                "Copyright:: (C) 2000  Information-technology Promotion Agency, Japan\n" +
                "Copyright 2013-present, Facebook, Inc." +
                " * All rights reserved.\n" +
                "Copyright (c) 2014-present Sebastian McKenzie and other contributors\n" +
                "<Copyright>Copyright © Rich Hickey and contributors 2023</Copyright>\n" +
                "Copyright (c) 2017. Amazon.com, Inc. or its affiliates. All Rights Reserved.\n" +
                ";; Copyright (c) Stuart Sierra, 2012. All rights reserved.\n" +
                "Copyright (c) 2012-20 Bozhidar Batsov\n" +
                "Copyright 2015 the original author or authors.\n" +
                "\"Copyright 2015-2025 the original author or authors. " +
                " * " +
                " * All rights reserved.\n" +
                "Copyright © 2015-2021 the original authors.\n" +
                "__/ __// _ | / /  / _ |    (c) 2007-2013, LAMP/EPFL             **\n" +
                "\"Copyright (c) 1998-2004, Drew Davidson and Luke Blanshard" +
                "//  All rights reserved.\n" +
                "Copyright (c) 2018 Sven Sauleau <sven@sauleau.com>\n" +
                "Copyright (c) 2019 Elan Shanker, Paul Miller (https://paulmillr.com)\n" +
                "Copyright 2011-2025 GatlingCorp (https://gatling.io)\n" +
                "<copyright-range>${project.inceptionYear}-2022</copyright-range>\n" +
                "Copyright (c) 2017-2022 the original author or authors.";
        String s1 = "<![CDATA[Copyright (c) 2020, ${current.year} Eclipse Foundation.\n" +
                "<p>&quot;Copyright &copy; 2018, 2020 Eclipse Foundation. This software or\n" +
                "Copyright (c) 1997, 2020 Oracle and/or its affiliates. All rights reserved.\n" +
                "Copyright (c) 1997, 2021 Oracle and/or its affiliates. All rights reserved.\n" +
                "Copyright (c) 2004, 2020 Oracle and/or its affiliates. All rights reserved.\n" +
                "Copyright (c) 2012, 2020 Oracle and/or its affiliates. All rights reserved.\n" +
                "Copyright (c) 2012, 2021 Oracle and/or its affiliates. All rights reserved.\n" +
                "Copyright (c) 2021 Oracle and/or its affiliates. All rights reserved.";
        String[] copyrights = s1.split("\n");
        Map<String, Integer> copyrightData = new HashMap<>();
        for(String copyright : copyrights) {
            Pattern copyrightFullPattern = Pattern.compile(copyrightPattern, Pattern.CASE_INSENSITIVE | Pattern.DOTALL);
            Matcher copyrightFullPatternMatcher = copyrightFullPattern.matcher(copyright);
            while (copyrightFullPatternMatcher.find()) {
                String copyData = copyrightFullPatternMatcher.group();
                Pattern copyDigitPattern = null;
                Matcher copyDigitPatternMatcher = null;
                if(Character.isDigit(copyData.charAt(0))) {
                    copyDigitPattern = Pattern.compile(copyrightDigitAndCharPattern, Pattern.CASE_INSENSITIVE | Pattern.DOTALL);
                    copyDigitPatternMatcher = copyDigitPattern.matcher(copyright);
                    if(copyDigitPatternMatcher.find())
                        copyData = copyDigitPatternMatcher.group();
                }
                copyDigitPattern = Pattern.compile(copyrightDigitPattern, Pattern.CASE_INSENSITIVE | Pattern.DOTALL);
                copyDigitPatternMatcher = copyDigitPattern.matcher(copyData);
                int latestDate = 0;
                while (copyDigitPatternMatcher.find()) {
                    String copyDigitData = copyDigitPatternMatcher.group();
                    copyData = copyData.replace(copyDigitData, "").trim();
                    copyData = copyData.replace("(c)", "").trim();
                    copyData = copyData.replace("(C)", "").trim();
                    copyData = copyData.replace("©", "").trim();
                    copyData = copyData.replace("*", "").trim();
                    copyData = copyData.replace("//", "").trim();
                    copyData = copyData.replace("<Copyright>", "")
                            .replace("</Copyright>", "")
                            .replace("Copyright", "")
                            .replace("copyright", "")
                            .replace("-present", "")
                            .replace("- present", "")
                            .replace("-Present", "")
                            .replace("- Present", "")
                            .replace("-- license", "")
                            .replace("<br/>", "")
                            .replace("-[yyyy]", "")
                            .replace("-current", "")
                            .replace("-${currentYear}", "")
                            .replace("- today", "")
                            .replace("&#9;", "")
                            .replace("&amp;#9;", "")
                            .replace("'", "")
                            .replace("\"", "")
                            .replace("&copy;", "")
                            .replace("-${}", "");
                    copyData = copyData.trim();
                    if(copyData.startsWith("-")) {
                        copyData = copyData.substring(1);
                        copyData = copyData.trim();
                    }
                    while(copyData.startsWith(",")) {
                        copyData = copyData.substring(1);
                        copyData = copyData.trim();
                    }
                    while(copyData.startsWith(".")) {
                        copyData = copyData.substring(1);
                        copyData = copyData.trim();
                    }
                    while(copyData.startsWith("@")) {
                        copyData = copyData.substring(1);
                        copyData = copyData.trim();
                    }
                    if(copyData.startsWith("-")) {
                        copyData = copyData.substring(1);
                        copyData = copyData.trim();
                    }
                    while(copyData.endsWith(",")) {
                        copyData = copyData.substring(0, copyData.length() - 1);
                        copyData = copyData.trim();
                    }
                    if(copyData.contains("<") && copyData.contains(">")) {
                        String[] mailAttributes = copyData.split("<");
                        copyData = mailAttributes[0];
                    }
                    if(copyData.contains("(") && copyData.contains(")")) {
                        String[] mailAttributes = copyData.split("\\(");
                        copyData = mailAttributes[0];
                    }
                    copyData = copyData.trim();
                    while(copyData.startsWith(":")) {
                        copyData = copyData.substring(1);
                        copyData = copyData.trim();
                    }
                    copyDigitData = copyDigitData.replace(",", "")
                            .replace(" ", "")
                            .replace("-", "");
                    Pattern PATTERN = Pattern.compile(REGEX);
                    Matcher matcher = PATTERN.matcher(copyDigitData);
                    boolean onlyDigit = matcher.matches();
                    /*if((onlyDigit) && Integer.parseInt(copyDigitData) > latestDate) {
                        latestDate = Integer.parseInt(copyDigitData);
                    }*/
                    if(onlyDigit && ((latestDate == 0) || (Integer.parseInt(copyDigitData) < latestDate))) {
                        latestDate = Integer.parseInt(copyDigitData);
                    }
                }
                //if(latestDate > 0 && !copyData.isEmpty()) {
                if(!copyData.isEmpty()) {
                    boolean add = true;
                    /*if(copyrightData.get(copyData) != null) {
                        int dateFromMap = copyrightData.get(copyData);
                        *//*if (dateFromMap > latestDate) {
                            add = false;
                        }*//*
                        if (dateFromMap < latestDate) {
                            add = false;
                        }
                    }*/
                    copyData = copyData.replaceAll(Pattern.compile(copyrightReservedPattern).pattern(), "");
                    if(copyData.contains("[") && copyData.contains("]")) {
                        copyData = copyData.replace("[", "")
                                .replace("]", "");
                    }
                    copyData = copyData.trim();
                    while(copyData.startsWith("-")) {
                        copyData = copyData.substring(1);
                        copyData = copyData.trim();
                    }
                    while(copyData.startsWith(",")) {
                        copyData = copyData.substring(1);
                        copyData = copyData.trim();
                    }
                    while(copyData.startsWith(".")) {
                        copyData = copyData.substring(1);
                        copyData = copyData.trim();
                    }
                    while(copyData.startsWith("-")) {
                        copyData = copyData.substring(1);
                        copyData = copyData.trim();
                    }
                    while(copyData.startsWith(",")) {
                        copyData = copyData.substring(1);
                        copyData = copyData.trim();
                    }
                    while(copyData.startsWith(".")) {
                        copyData = copyData.substring(1);
                        copyData = copyData.trim();
                    }
                    while(copyData.endsWith(",")) {
                        copyData = copyData.substring(0, copyData.length() - 1);
                        copyData = copyData.trim();
                    }
                    copyData = copyData.trim();
                    if(copyrightData.get(copyData) != null) {
                        int dateFromMap = copyrightData.get(copyData);
                        if (dateFromMap < latestDate) {
                            add = false;
                        }
                    }
                    if(add) {
                        copyrightData.put(copyData, latestDate);
                    }
                }
            }
        }
        System.out.println(copyrightData);
        Map.Entry<String, Integer> actualValue = copyrightData.entrySet()
                .stream()
                .findFirst()
                .get();
        System.out.println(actualValue.getKey());
        System.out.println(actualValue.getValue());
    }
}
