package cryptographer;

import cryptographer.ciphering.CaesarCipher;
import cryptographer.tools.FileReader;
import java.util.Scanner;
import org.apache.commons.lang3.math.NumberUtils;

/**
 * A command line interface for cryptographer
 * 
 * @author sami
 */
public class Main {

    static Scanner scanner = new Scanner(System.in);

    /**
     * Simple command line interface
     * 
     * @param args
     */
    public static void main(String[] args) {
        System.out.print("Enter desired cipher (currently only caesar implemented): ");
        switch (scanner.nextLine().toLowerCase()) {
            case "caesar":
                CaesarCipher cipher = new CaesarCipher();
                String shift;

                System.out.print("Enter string to cipher: ");
                String input = scanner.nextLine();

                while (true) {
                    System.out.print("Enter shift to use with cipher: ");
                    shift = scanner.nextLine();
                    if (NumberUtils.isNumber(shift)) {
                        if (Integer.parseInt(shift) < 0) {
                            System.out.println("Shift can't be under 0!");
                        } else {
                            cipher.setShift(Integer.parseInt(shift));
                            break;
                        }
                    } else {
                        System.out.println("Shift has to be a numeric value!");
                    }
                }
                System.out.println(input + " => " + cipher.decipher(input));
                break;
            default:
                System.out.println("Input not valid.");
        }

        //For testing purposes for now
        System.out.println("Choose file");
        FileReader fr = new FileReader();
        System.out.println(fr.getFileContentsAsString());

    }

}
