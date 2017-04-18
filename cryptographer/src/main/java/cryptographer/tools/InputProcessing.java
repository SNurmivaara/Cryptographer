/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptographer.tools;

/**
 * Simple tools for processing inputs.
 *
 * @author sami
 */
public class InputProcessing {

    /**
     * Try to parse input to Integer. If doesn't work returns Integer with null
     * value.
     *
     * @param text input
     * @return either Integer or null
     */
    public static Integer tryParse(String text) {
        try {
            return Integer.parseInt(text);
        } catch (NumberFormatException e) {
            return null;
        }
    }

}
