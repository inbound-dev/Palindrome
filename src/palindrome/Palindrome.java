/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;
import javax.swing.*;
/**
 *
 * @author Joham3169
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
     
        static boolean checkForPalindromes(String word) 
    { 
        int wordlength = word.length(); 
        
        word = word.toLowerCase(); 
        
        for (int i=0; i<wordlength; i++,wordlength--) 
            
           if (word.charAt(i) != word.charAt(wordlength - 1)) 
              return false;        
              return true; 
    } 
      
    
    static int countPalindromes(String str) 
    {         
         
        str = str + " "; 
        String word = ""; 
        
        
        int count = 0; 
        for (int i = 0; i < str.length(); i++) 
        { 
            char characterAt = str.charAt(i); 
              
             
            if (characterAt != ' ') {
                word = word + characterAt; 
            } 
            else {
                if (checkForPalindromes(word)) {
                    count++; 
                    word = ""; 
                    } 
                 
                }
        }
        return count;
    }
    
    public static void main(String args[]) { 
        
        String UserSentance = JOptionPane.showInputDialog(new JFrame(), "Please enter palendrome");
        
        System.out.println(UserSentance);
        
        if (countPalindromes(UserSentance) > 0){
            System.out.println("that is a pallendrome");
        }
        else {
            System.out.println("That is not a pallendrome");
        }
        System.exit(0);
    }
}
