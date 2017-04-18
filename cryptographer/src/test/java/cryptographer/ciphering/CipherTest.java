/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptographer.ciphering;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import org.junit.Test;

/**
 *
 * @author MaSigMa
 */
public class CipherTest {

    Cipher cipher = new Cipher();

    /**
     *
     */
    @Test
    public void keySetterWorks() {
        cipher.setKey(1,"2");
        assertEquals("c2", cipher.getKey());
    }

    /**
     *
     */
    @Test
    public void cipherWorks() {
        cipher.setKey(1,"2");
        String output = cipher.cipher("abc");
        assertEquals("cde", output);
    }

    /**
     *
     */
    @Test
    public void cipherIgnoresNonAlphabeticalCharacters() {
        cipher.setKey(1,"2");
        String output = cipher.cipher("a b c ä ö !");
        assertEquals("c d e ä ö !", output);
    }

    /**
     *
     */
    @Test
    public void cipherWorksWithShiftsOver26() {
        cipher.setKey(1,"30");
        String output = cipher.cipher("abc");
        assertEquals("efg", output);
    }

    /**
     *
     */
    @Test
    public void cipherCorrectlyWorksWithLastAlphabeticCharacters() {
        cipher.setKey(1,"2");
        String output = cipher.cipher("xyz");
        assertEquals("zab", output);
    }

    /**
     *
     */
    @Test
    public void cipherWorksWithUpperAndLowerCaseLetters() {
        cipher.setKey(1,"2");
        String output = cipher.cipher("aBcD");
        assertEquals("cdef", output);
    }

    /**
     *
     */
    @Test
    public void decipherWorks() {
        cipher.setKey(1,"2");
        String output = cipher.decipher("cde");
        assertEquals("abc", output);
    }

    /**
     *
     */
    @Test
    public void decipherIgnoresSpecialCharacters() {
        cipher.setKey(1,"2");
        String output = cipher.decipher("c ä !");
        assertEquals("a ä !", output);
    }

    /**
     *
     */
    @Test
    public void decipherWorksWithFirstAlphabeticalCharacters() {
        cipher.setKey(1,"2");
        String output = cipher.decipher("abc");
        assertEquals("yza", output);
    }

    /**
     *
     */
    @Test
    public void decipherWorksWithUpperAndLowerCaseLetters() {
        cipher.setKey(1,"2");
        String output = cipher.decipher("AbC");
        assertEquals("yza", output);
    }
    
    @Test
    public void settingShiftFailsForNonIntegers() {
        
    }
}
