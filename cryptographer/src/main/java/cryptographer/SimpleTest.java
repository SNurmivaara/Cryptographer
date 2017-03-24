/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptographer;

import cryptographer.ciphering.CaesarCipher;

/**
 *
 * @author sami
 */
public class SimpleTest {

    int testattava;

    public SimpleTest(int x) {
        this.testattava = x;
    }
    
    public boolean totta(){
        return testattava == testattava;
    }

    public static void main(String[] args) {
        CaesarCipher caesar = new CaesarCipher(2);
        System.out.println(caesar.cipher("abc dfg öäå"));
    }

}
