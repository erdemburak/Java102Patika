package ioveriakislari.printstream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {

        try {

            PrintStream output = new PrintStream("src/ioveriakislari/printstream/print.txt");
            output.println(123451234);
            output.print("1243" + 2314);

            output.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
