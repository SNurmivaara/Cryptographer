/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptographer;

import cryptographer.simpleTest;
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
public class simpleTestTest {

    /**
     * Test of simpleTest method, of class simpleTest.
     */
    @Test
    public void logiikkaToimii() {
        simpleTest testi = new simpleTest(2);
        assertTrue(testi.totta());
    }
    
}
