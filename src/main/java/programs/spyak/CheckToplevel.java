package programs.spyak;

public class CheckToplevel {

    public static void main(String[] args) {
        String sourceUrl = "https://github.com/apache/camel-spring-boot/tree/camel-spring-boot-3.22.2";
        String moduleName = null;
        int slashIndex = getSlashIndex(sourceUrl);
        if (slashIndex != 0) {
            moduleName = sourceUrl.substring(slashIndex+1);
            sourceUrl = sourceUrl.substring(0, slashIndex);
        }
        if(moduleName != null) {
            System.out.println(moduleName);
        }
        System.out.println(sourceUrl);
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
