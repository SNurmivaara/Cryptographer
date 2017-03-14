/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptographer.ciphering;

/**
 *
 * @author sami
 */
public class caesarCipher {
    int shift;
    
    public caesarCipher(int shift) {
        this.shift = shift;
    }
    
    // TO-DO add handling for spaces, special characters and åäö
    public String cipher(String input) {
        String result = "";
        for(char c : input.toCharArray()){
            result += (char)(c+shift);
        }
        return result;
    }
    
}
