package fc.introduction.taskZero;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileWriter {

    private static final String pathToResources = "Lesson6/src/main/resources/";

    public static void writeToFile(String nameOfFile, String textToWrite) {
        try {
            Files.writeString(Paths.get(pathToResources + nameOfFile), textToWrite);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
