/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptographer.tools;

import java.io.File;
import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

/**
 *
 * @author MaSigMa
 */
public class FileReaderTest {

    FileReader fr = new FileReader();
    File tester = new File("tester.txt");

    /**
     *
     */
    @Test
    public void fileSetterandGetterWorks() {
        fr.setFile(tester);
        assertNotNull(fr.getFile());
    }
    
    @Test
    public void fileContentsAsStringWorks() {
        //Currently WIP feature, added test for future reference
        assertNull(fr.getFileContentsAsString());
    }

}
