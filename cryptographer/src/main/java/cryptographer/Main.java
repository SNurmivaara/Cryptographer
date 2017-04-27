package cryptographer;

import cryptographer.ciphering.Cipher;
import java.util.Scanner;

/**
 * A command line interface for cryptographer.
 *
 * @author sami
 */
public class Main {

    static Scanner scanner = new Scanner(System.in);

    /**
     * Simple command line interface.
     *
     * @param args args
     */
    public static void main(String[] args) {
        Cipher cipher = new Cipher();
        String key = "";
        String cipherType;

        System.out.print("Enter desired cipher\n1 for casear shift\ne for exit\n");
        while (true) {

            cipherType = scanner.next().toLowerCase();

            switch (cipherType) {
                case "1":
                    System.out.println("Enter shift for caesar-cipher:");
                    key = scanner.next();
                    cipher.setKey(1, key);
                    break;
                case "e":
                    return;
            }

            System.out.println("Enter 1 for ciphering or 2 for deciphering");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter text to cipher: ");
                String input = scanner.next();
                System.out.println(input + " => " + cipher.cipher(input));
            } else {
                System.out.println("Enter text to decipher: ");
                String input = scanner.next();
                System.out.println(input + " => " + cipher.decipher(input) + "\n_________________________________");
            }
            System.out.print("\nEnter desired cipher\n1 for casear shift\ne for exit\n");
        }
    }

    /* For testing purposes for now
        System.out.println(
                "Choose file");
        FileReader fr = new FileReader();

        System.out.println(fr.getFileContentsAsString());
     */
}
