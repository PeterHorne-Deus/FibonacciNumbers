/*
 * Peter Horne-Deus
 * This program calculates a given fibonacci number
 * FibonaaciNumbers.java
 * March 24, 2020
 */

package fibonacci.numbers;

import javax.swing.*;

/**
 *
 * @author Peter
 */
public class FibonacciNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //User inputed variable
        int num = Integer.parseInt(JOptionPane.showInputDialog("Please enter the fibinacci number you would like to see"));
        //Output
        System.out.println("The Fibonacci Number for: " + num + " is " + calculate(num));
    }
    
    public static int calculate(int n){
        //Calaculation of number
        if(n == 0 || n == 1){
            return 1;
        }
        else{
            return (n + calculate(n -1));
        }
    }
    
}
