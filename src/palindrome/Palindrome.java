/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;
import javax.swing.*;
/**
 *
 * @author Jorda
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String pal = JOptionPane.showInputDialog(new JFrame(), "Please Enter a Palindrome");
        int start = 0;
        int end = pal.length() - 1;
        
        boolean isPal = true;
        
        while(start < end){
            
            String startLetter = pal.substring(start, start + 1);
            String endLetter = pal.substring(end, end + 1);
            
            if(startLetter.equals(endLetter)==false){
                isPal = false;
                break;
            }
            start++;
            end--;
        }
        if (isPal == true){
            JOptionPane.showMessageDialog(new JFrame(), pal +  ", is a palendrome");
            System.exit(0);
        }
        else{
            JOptionPane.showMessageDialog(new JFrame(), pal +  ", is not a palendrome");
            System.exit(0);
        }
    }  
}
