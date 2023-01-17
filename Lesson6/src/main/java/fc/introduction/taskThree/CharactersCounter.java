package fc.introduction.taskThree;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CharactersCounter {

    private static final String pathToResources = "Lesson6/src/main/resources/";

    public static void countsTheNumberOfCharactersInTheFile(String nameOfFile) {
        try {
            String result = Files.readString(Paths.get(pathToResources + nameOfFile));
            System.out.println("The number of characters of this text is: " + result.length());
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
