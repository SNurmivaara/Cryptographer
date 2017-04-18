package cryptographer.ciphering;

import cryptographer.tools.InputProcessing;
import java.io.File;

/**
 *
 * @author sami
 */
public class Cipher implements CipherInterface {

    private final String alphabet = "abcdefghijklmnopqrstuvwxyz";

    String key;

    public void setKey(int type, String key) {
        switch (type) {
            case 1:
                this.key = "c" + key;
                break;
        }
    }

    /**
     *
     * @return
     */
    public String getKey() {
        return this.key;
    }

    /**
     *
     * @param input
     * @return
     */
    @Override
    public String cipher(String input) {
        String cipherText = "";
        System.out.println(key);

        switch (key.charAt(0)) {
            case 'c':
                Integer shift = InputProcessing.tryParse(key.substring(1));
                if (shift == null) {
                    System.out.println("problem with parsing shift, sure it's integer?");
                    break;
                }
                if (shift != -1) {
                    input = input.toLowerCase();

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

        return "Error ciphering";
    }

    /**
     *
     * @param input
     * @return
     */
    @Override
    public String decipher(String input) {

        switch (key.charAt(0)) {
            case 'c':
                Integer shift = InputProcessing.tryParse(key.substring(1));
                if (shift == null) {
                    System.out.println("problem with parsing shift, sure it's integer?");
                    break;
                }
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
        return "Error deciphering";
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
