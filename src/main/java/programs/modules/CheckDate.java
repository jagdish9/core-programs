package programs.modules;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckDate {
    public static void main(String[] args) {
        String gitLogOutput = "[scqsdev@oscs-stage-app-ad1-2 curl]$ git log -1\n" +
                "commit d214e62f4e931296e36b620584036eda2ebd8464 (HEAD -> master, origin/master, origin/HEAD)\n" +
                "Author: Matt Jolly <kangie@gentoo.org>\n" +
                "Date:   Wed May 21 20:30:11 2025 +1000\n" +
                "\n" +
                "    configure: suppress command not found for brew\n" +
                "\n" +
                "    42331cb48a1f66efaa0920ee8ccba5a74d67de27 made configure checks more\n" +
                "    CMake-like, but now calls `brew` resulting in \"command not found\" in\n" +
                "    the configure output if the package is not installed.\n" +
                "\n" +
                "    Redirect stderr to suppress this; it's not an issue for us if `brew`\n" +
                "    isn't found.\n" +
                "\n" +
                "    Follow-up to 42331cb48a1f66efaa0920ee8ccba5a74d67de27 #17362\n" +
                "\n" +
                "    Closes #17407\n";
        Pattern pattern = Pattern.compile("Date:\\s+(.*)");
        Matcher matcher = pattern.matcher(gitLogOutput);
        if (matcher.find()) {
            SimpleDateFormat inputFormat = new SimpleDateFormat("EEE MMM d HH:mm:ss yyyy Z");
            Date date = null;
            try {
                date = inputFormat.parse(matcher.group(1));
            } catch (ParseException e) {
                e.printStackTrace();
            }

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
            String techReleaseDate = dateFormat.format(date);
            System.out.println(techReleaseDate);
        }
    }
}

//ABC
/* XYZ
*
*/
