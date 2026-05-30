package programs.hackerranktest;

public class TypeCounter {
    public static void main(String[] args) {
        typeCounter("793572417 kqnosslqbfvvicxv uzruraetg 890472625.408307062 hfpn 911001199 618858820 245168157.842939383 936515617 hthulxarzhizeioepwbizhzkbdluytbvwvqipizqcwcajkufnqhmc 339845163.337193187 15053948 138197476 314104399.500007875 nnbugbmcthspxenwovywdfchidwcstlbocfzzyocnmgaaujtrlqsniflvehwyippbx 533468394.442174725 785607982.214832643 175053019 qpooptxemxkrxoihbokypcizinrxtbraxnmhkcsshguuatppf hnwpzukjybkkvrmmpueehkjyrcrkpkhtbfqpyvrcfqalhoikwfsqfstyfpraahxhjxvsscngggkgnh epguyavzcfdkqbcmgroidxrzyynhwcdiusriqsaowczwuuyelcxepxlwdcknmdxautbdnrahitqisznxnisyoorkepoprz 88039333.213832924 726306347 ssaimtlltgafhvlcciztdidxpwhdg 183845486.934435422 250171681 746567828.498183266 234684802.75253 400678452 822355211.844087409 788120120.225553574 888907132.997118836 glkickrgwolhoakatssjlitqzjfhdfzlmdadkyprfjsitgvqaiofzwnkpryckxsjozuinkhufnwhjcyanirdgwlfw 418879307.324387535 lnkvyfopqztsuqshdtkdgbrrkxwqpglipcaasjhklypyuu gzbfagbnqjwksdmgdpfkdgqygsemvfitdeilcydjnhupzveasvkjxgamxntqfznqkmsoareinwjeikyorrozgfzhoyhmku 654703194.89");
    }

    public static void typeCounter(String sentence) {
        String[] sents = sentence.split(" ");
        System.out.println(sentence);

        int strCount = 0;
        int intCount = 0;
        int doubleCount = 0;

        for(String sent : sents) {
            if(Character.isLetter(sent.charAt(0))) {
                strCount++;
            } else if(Character.isDigit(sent.charAt(0)) && !sent.contains(".")) {
                intCount++;
            } else {
                doubleCount++;
            }
        }

        System.out.println("string "+strCount);
        System.out.println("integer "+intCount);
        System.out.println("double "+doubleCount);
    }
}
