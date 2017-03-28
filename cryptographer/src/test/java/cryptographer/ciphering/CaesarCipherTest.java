/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptographer.ciphering;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author MaSigMa
 */
public class CaesarCipherTest {
    CaesarCipher cipher = new CaesarCipher(2);
    
    @Test
    public void cipherWorks() {
        String output = cipher.cipher("abc");
        assertEquals("cde",output);
    }
    
    @Test
    public void cipherIgnoresNonAlphabeticalCharacters() {
        // cipher should only work for characters from A to Ö
        String output = cipher.cipher("a b c ä ö !");
        assertEquals("c d e ä ö !", output);
    }
    
    @Test
    public void cipherWorksWithShiftsOver26() {
        CaesarCipher cipher2 = new CaesarCipher(30);
        String output = cipher2.cipher("abc");
        assertEquals("efg",output);
    }
    
    @Test
    public void cipherCorrectlyWorksWithLastAlphabeticCharacters() {
        String output = cipher.cipher("xyz");
        assertEquals("zab",output);
    }
    
    @Test
    public void cipherSetsShiftTo0IfNegativeValueEntered() {
        CaesarCipher cipher2 = new CaesarCipher(-2);
        String output = cipher2.cipher("abc");
        assertEquals("abc",output);
    }
    
    @Test
    public void cipherWorksWithUpperAndLowerCaseLetters() {
        String output = cipher.cipher("aBcD");
        assertEquals("cdef",output);
    }
    
    @Test
    public void decipherWorks() {
        String output = cipher.decipher("cde");
        assertEquals("abc",output);
    }
    
    @Test
    public void decipherIgnoresSpecialCharacters() {
        String output = cipher.decipher("c ä !");
        assertEquals("a ä !", output);
    }
    
    @Test
    public void decipherWorksWithFirstAlphabeticalCharacters() {
        String output = cipher.decipher("abc");
        assertEquals("yza",output);
    }
    
    @Test
    public void decipherWorksWithUpperAndLowerCaseLetters() {
        String output = cipher.decipher("AbC");
        assertEquals("yza",output);
    }
}
