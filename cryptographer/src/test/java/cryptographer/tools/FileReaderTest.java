/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptographer.tools;

import java.io.File;
import java.net.URL;
import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import org.junit.Rule;
import org.junit.rules.ExternalResource;

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
    
}
