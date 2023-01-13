package fc.introduction.taskFive;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class InvertedText {

    private static final String pathToResources = "Lesson6/src/main/resources/";

    public static void printInvertedTextFromTheFile(String nameOfFile) {
        try {
            String textFromTheFile = Files.readString(Paths.get(pathToResources + nameOfFile));
            StringBuilder stringBuilder = new StringBuilder(textFromTheFile);
            String result = stringBuilder.reverse().toString();
            System.out.println(result);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
