package cryptographer.ciphering;

import java.io.File;

/**
 *
 * @author sami
 */
public class CaesarCipher implements Cipher {

    private final String alphabet = "abcdefghijklmnopqrstuvwxyz";
    private int shift;

    /**
     *
     * @param shift
     * @return
     */
    public boolean setShift(int shift) {
        if (shift >= 0) {
            this.shift = shift;
            return true;
        } else {
            this.shift = -1;
            return false;
        }
    }

    /**
     *
     * @return
     */
    public int getShift() {
        return this.shift;
    }

    /**
     *
     * @param input
     * @return
     */
    @Override
    public String cipher(String input) {

        if (this.shift != -1) {
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
        } else {
            return "shift not set!";
        }
    }

    /**
     *
     * @param input
     * @return
     */
    @Override
    public String decipher(String input) {

        if (shift != -1) {
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
        } else {
            return "shift not set!";
        }
    }

    /**
     *
     * @param file
     * @return
     */
    @Override
    public File cipherFile(File file) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param file
     * @return
     */
    @Override
    public File decipherFile(File file) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
