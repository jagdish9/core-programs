package programs.java11.filemethods;

import java.nio.file.Files;
import java.nio.file.Path;

public class NewFileMethods {
    public static void main(String[] args) throws Exception {
        Path path = Path.of("testfile.txt");

        Files.writeString(path, "Hello Java 11");

        String content = Files.readString(path);

        System.out.println(content);
    }
}
