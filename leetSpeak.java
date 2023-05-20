import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.*;

public class leetSpeak {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("D:\\Programming\\java2\\LabExp 6\\english.txt"));
            PrintStream output = new PrintStream(new File("encrypted.txt"));
            ChangeWord(input, output);
        } 
        catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }

    public static void ChangeWord(Scanner input, PrintStream output) {
        while (input.hasNextLine()) {
            String stringInput = input.nextLine();
            Scanner words = new Scanner(stringInput);
            while (words.hasNext()) {
                String word = words.next();
                word = word.replace("o", "0");
                word = word.replace("l", "1");
                word = word.replace("e", "6");
                word = word.replace("a", "4");
                word = word.replace("t", "7");
                if (word.endsWith("s")) {
                    word = word.substring(0, word.length() - 1) + "5";
                }
                output.print("(" + word + ") ");
            }
            output.println();
            words.close();
        }
    }
}