/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptographer.tools;

import java.io.File;
import javax.swing.JFileChooser;

/**
 * A tool for reading files.
 * @author MaSigMa
 */
public class FileReader {

    private File file;
    final JFileChooser fc = new JFileChooser();

    /**
     * Setter for files.
     * @param file file
     */
    public void setFile(File file) {
        this.file = file;
    }

    /**
     * Getter for files.
     * @return file
     */
    public File getFile() {
        return this.file;
    }
    
    /**
     * A simple JFileChooser implementation.
     */
    public void fileChooser() {
        int returnVal = fc.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            this.file = fc.getSelectedFile();
        }
    }

    /**
     * Return contents of file as a String.
     * @return contents of file
     */
    public String getFileContentsAsString() {
        return null;
    }
}
