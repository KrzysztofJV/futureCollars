package fc.introduction.taskTwo;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        String nameOfFile = "data.txt";

        EverySecondLine.printTheEverySecondLineInTheFile(nameOfFile);
    }
}
