package fc.introduction.taskFirst;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReader {

    private static final String pathToResources = "Lesson6/src/main/resources/";

    public static void readFromFile(String nameOfFile) {
        try {
            String result = Files.readString(Paths.get(pathToResources + nameOfFile));
            System.out.println(result);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
