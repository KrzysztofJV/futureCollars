package fc.introduction.taskZero;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        String nameOfFile = "data.txt";
        String textToWrite = "Kurs\n" +
                "Java\n" +
                "Lekcja 6\n" +
                "Pliki\n" +
                "Wyjątki\n" +
                "Pliki\n" +
                "Koniec pliku";

        FileWriter.writeToFile(nameOfFile, textToWrite);
    }
}
