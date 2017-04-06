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
    
    /**
     *
     * @param input
     * @return
     */
    String cipher(String input);
    
    /**
     *
     * @param input
     * @return
     */
    String decipher(String input);
    
    /**
     *
     * @param file
     * @return
     */
    File cipherFile(File file);
    
    /**
     *
     * @param file
     * @return
     */
    File decipherFile(File file);
    
}
