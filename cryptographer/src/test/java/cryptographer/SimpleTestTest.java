/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptographer;

import cryptographer.SimpleTest;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sami
 */
public class SimpleTestTest {

    /**
     * Test of SimpleTest method, of class SimpleTest.
     */
    @Test
    public void logiikkaToimii() {
        SimpleTest testi = new SimpleTest(2);
        assertTrue(testi.totta());
    }
    
}
