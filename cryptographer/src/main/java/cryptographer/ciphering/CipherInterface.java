/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptographer.ciphering;

import java.io.File;

/**
 * Interface for different ciphers.
 * @author MaSigMa
 */
public interface CipherInterface {
    
    /**
     * Ciphering method.
     * @param input input
     * @return input ciphered
     */
    String cipher(String input);
    
    /**
     * Deciphering method.
     * @param input input 
     * @return input deciphered
     */
    String decipher(String input);
    
    /**
     * Method for ciphering files.
     * @param file file
     * @return file ciphered
     */
    File cipherFile(File file);
    
    /**
     * Method for deciphering files.
     * @param file file
     * @return deciphered file
     */
    File decipherFile(File file);
}
