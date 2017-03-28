/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptographer.ciphering;

import java.io.File;

/**
 *
 * @author MaSigMa
 */
public interface Cipher {
    
    String cipher(String input);
    
    String decipher(String input);
    
    File cipherFile(File file);
    
    File decipherFile(File file);
    
}
