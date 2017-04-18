/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptographer.tools;

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
public class InputProcessingTest {

    /**
     * Test of tryParse method, of class InputProcessing.
     */
    @Test
    public void parseReturnsNullIfNotInteger() {
        assertNull(InputProcessing.tryParse("assdf"));
    }
    
}
