/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptographer.tools;

import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author MaSigMa
 */
public class FileReader {
    private File file;
    final JFileChooser fc = new JFileChooser();
    
    public FileReader(File file){
        int returnVal = fc.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            this.file = fc.getSelectedFile();
        }
    }
    
    public String getFileContentsAsString() {
        return null;
    }
}
