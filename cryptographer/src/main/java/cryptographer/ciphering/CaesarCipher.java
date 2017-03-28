package cryptographer.ciphering;

import java.io.File;

/**
 *
 * @author sami
 */
public class CaesarCipher implements Cipher {

    private final String alphabet = "abcdefghijklmnopqrstuvwxyz";
    private int shift;

    public CaesarCipher(int shift) {
        if (shift < 0) {
            shift = 0;
        } else {
            this.shift = shift;
        }
    }

    @Override
    public String cipher(String input) {

        input = input.toLowerCase();
        String cipherText = "";

        for (int i = 0; i < input.length(); i++) {
            char replaceVal = input.charAt(i);
            if (this.alphabet.indexOf(input.charAt(i)) >= 0) {
                int charPosition = this.alphabet.indexOf(input.charAt(i));
                int keyVal = (charPosition + shift) % 26;
                replaceVal = this.alphabet.charAt(keyVal);
            }
            cipherText += replaceVal;
        }

        return cipherText;
    }

    @Override
    public String decipher(String input) {

        input = input.toLowerCase();
        String plainText = "";

        for (int i = 0; i < input.length(); i++) {
            char replaceVal = input.charAt(i);
            if (this.alphabet.indexOf(input.charAt(i)) >= 0) {
                int charPosition = this.alphabet.indexOf(input.charAt(i));
                int keyVal = (charPosition - shift) % 26;
                if (keyVal < 0) {
                    keyVal = 26 + keyVal;
                }
                replaceVal = this.alphabet.charAt(keyVal);
            }
            plainText += replaceVal;
        }

        return plainText;
    }

    @Override
    public File cipherFile(File file) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public File decipherFile(File file) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
