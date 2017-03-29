/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptographer.ciphering;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

/**
 *
 * @author MaSigMa
 */
public class CaesarCipherTest {

    CaesarCipher cipher = new CaesarCipher();

    @Test
    public void shiftSetterWorks() {
        cipher.setShift(2);
        assertEquals(2, cipher.getShift());
    }

    @Test
    public void cipherWorks() {
        cipher.setShift(2);
        String output = cipher.cipher("abc");
        assertEquals("cde", output);
    }

    @Test
    public void cipherIgnoresNonAlphabeticalCharacters() {
        cipher.setShift(2);
        String output = cipher.cipher("a b c ä ö !");
        assertEquals("c d e ä ö !", output);
    }

    @Test
    public void cipherWorksWithShiftsOver26() {
        cipher.setShift(30);
        String output = cipher.cipher("abc");
        assertEquals("efg", output);
    }

    @Test
    public void cipherCorrectlyWorksWithLastAlphabeticCharacters() {
        cipher.setShift(2);
        String output = cipher.cipher("xyz");
        assertEquals("zab", output);
    }

    @Test
    public void cipherSetsShiftTo0IfNegativeValueEntered() {
        assertFalse(cipher.setShift(-2));
        assertEquals("shift not set!", cipher.cipher("abc"));
    }

    @Test
    public void cipherWorksWithUpperAndLowerCaseLetters() {
        cipher.setShift(2);
        String output = cipher.cipher("aBcD");
        assertEquals("cdef", output);
    }

    @Test
    public void decipherWorks() {
        cipher.setShift(2);
        String output = cipher.decipher("cde");
        assertEquals("abc", output);
    }

    @Test
    public void decipherIgnoresSpecialCharacters() {
        cipher.setShift(2);
        String output = cipher.decipher("c ä !");
        assertEquals("a ä !", output);
    }

    @Test
    public void decipherWorksWithFirstAlphabeticalCharacters() {
        cipher.setShift(2);
        String output = cipher.decipher("abc");
        assertEquals("yza", output);
    }

    @Test
    public void decipherWorksWithUpperAndLowerCaseLetters() {
        cipher.setShift(2);
        String output = cipher.decipher("AbC");
        assertEquals("yza", output);
    }
}
