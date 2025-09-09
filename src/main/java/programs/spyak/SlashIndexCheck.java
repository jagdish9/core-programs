package programs.spyak;

public class SlashIndexCheck {

    public static void main(String[] args) {
       // String toplevelSourceUrl = "https://github.com/apache/logging-flume/tree/rel/1.10.0";
        String toplevelSourceUrl = "https://github.com/apache/ambari/tree/release-2.7.5";
        if(toplevelSourceUrl != null) {
            int slashIndex = getSlashIndexForTag(toplevelSourceUrl);
            String tagName = toplevelSourceUrl.substring(slashIndex + 1);
            System.out.println(tagName);
        }
    }

    public static int getSlashIndexForTag(String sourceUrl) {
        int count = 0;
        int slashIndex = 0;
        for(int i = 0; i < sourceUrl.length(); i++) {
            if(sourceUrl.charAt(i) == '/') {
                count++;
                if(count == 6) {
                    slashIndex = i;
                }
            }
        }
        return slashIndex;
    }
}
