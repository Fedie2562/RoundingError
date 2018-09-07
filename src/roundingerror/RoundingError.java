/*
 * Ferris D.
 * September 9th 2018
 * This program is supposed to compare the square of the square root of any number
 */

package roundingerror;

import javax.swing.JOptionPane;

/**
 *
 * @author fedie2562
 */
public class RoundingError {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double number =0; //The input will be assigned to this
        String numberStr = JOptionPane.showInputDialog("Enter a number..."+" Do it");
        //Convert the string from a String to an double
     	number = Double.parseDouble(numberStr);
        System.out.println("Square of the square"+Math.pow(Math.sqrt(number),2));
        System.out.println("Round off error " + (Math.pow(Math.sqrt(number),2)-number));
    }
    
}
