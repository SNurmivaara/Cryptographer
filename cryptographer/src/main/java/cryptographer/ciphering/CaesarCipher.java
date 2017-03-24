/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptographer.ciphering;
import java.util.List;

/**
 *
 * @author sami
 */
public class CaesarCipher {

    int shift;
    List<Character> alphabet;

    public CaesarCipher(int shift) {
        this.shift = shift;
    }

    // Decide if adding Finnish letters Å, Ä, Ö?
    public String cipher(String input) {
        String s = "";
        for (int i = 0; i < input.length(); i++) {
            char c = (char) (input.charAt(i));
            if (c >= 'A' && c <= 'Z') {
                s += (char) ((c - 'A' + shift) % 26 + 'A');
            } else if (c >= 'a' && c <= 'z') {
                s += (char) ((c - 'a' + shift) % 26 + 'a');
            } else {
                s += c;
            }
        }
        return s;
    }

}
