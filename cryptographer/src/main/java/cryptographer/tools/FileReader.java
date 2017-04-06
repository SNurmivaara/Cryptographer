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

    /**
     *
     * @param file
     */
    public void setFile(File file) {
        this.file = file;
    }

    /**
     *
     * @return
     */
    public File getFile() {
        return this.file;
    }
    
    /**
     *
     */
    public void fileChooser() {
        int returnVal = fc.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            this.file = fc.getSelectedFile();
        }
    }

    /**
     *
     * @return
     */
    public String getFileContentsAsString() {
        return null;
    }
}
