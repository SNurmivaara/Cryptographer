package cryptographer;

import cryptographer.ciphering.CaesarCipher;
import java.util.Scanner;

/**
 *
 * @author sami
 */
public class Main {
    
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter string to cipher via Caesar cipher: ");
        String input = scanner.nextLine();
        System.out.print("Enter shift to use with cipher: ");
        CaesarCipher cipher = new CaesarCipher(scanner.nextInt());
        System.out.println(input + " => " + cipher.decipher(input));
    }

}
