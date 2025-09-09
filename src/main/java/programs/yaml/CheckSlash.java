package programs.yaml;

public class CheckSlash {

    public static void main(String[] args) {
        String sourceUrl = "https://github.com/couchbase/couchbase-jvm-clients/tree/eos-sr-2/core-io";
        String commit = "commit 316a0a736def7a1947f4a72c38a2aef46b4eb1d3 (HEAD -> master, origin/master, origin/HEAD)\n" +
                "Author: dependabot-preview[bot] <27856297+dependabot-preview[bot]@users.noreply.github.com>\n" +
                "Date:   Thu May 6 17:52:24 2021 +0000\n" +
                "\n" +
                "    [Security] Bump lodash from 4.17.19 to 4.17.21\n" +
                "\n" +
                "    Bumps [lodash](https://github.com/lodash/lodash) from 4.17.19 to 4.17.21. **This update includes a security fix.**\n" +
                "    - [Release notes](https://github.com/lodash/lodash/releases)\n" +
                "    - [Commits](https://github.com/lodash/lodash/compare/4.17.19...4.17.21)\n" +
                "\n" +
                "    Signed-off-by: dependabot-preview[bot] <support@dependabot.com>\n";
        int slashIndex = getSlashIndexForToplevel(sourceUrl);
        if (slashIndex != 0) {
            String toplevelSourceUrl = sourceUrl.substring(0, slashIndex);
            System.out.println("Toplevel URL: " + toplevelSourceUrl);
        }
        String[] commitAttributes = commit.split("\n");
        for(String commitAttribute : commitAttributes) {
            if(commitAttribute.startsWith("commit")) {
                String[] commitData = commitAttribute.split(" ");
                String commitId = commitData[1];
                System.out.println("Commit ID: " + commitId);
            }
        }
    }

    public static int getSlashIndexForToplevel(String sourceUrl) {
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
