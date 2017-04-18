package cryptographer;

import cryptographer.ciphering.Cipher;
import cryptographer.tools.FileReader;
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
        int cipherType;

        System.out.print("Enter desired cipher\n1 for casear shift\n");
        cipherType = scanner.nextInt();
        
        switch (cipherType) {
            case 1:
                System.out.println("Enter shift for caesar-cipher:");
                key = scanner.next();
                break;
        }
        cipher.setKey(cipherType, key);
        
        System.out.print("Enter string to cipher: ");
        String input = scanner.next();
        System.out.println(input + " => " + cipher.cipher(input));

        //For testing purposes for now
        System.out.println(
                "Choose file");
        FileReader fr = new FileReader();

        System.out.println(fr.getFileContentsAsString());

    }

}
