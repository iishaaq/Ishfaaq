/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Ishfaaq Ismath
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str1 = "1.2.5";
        String str2 = "1.2.4";
        
            String del = "\\.";
            
        String[] array1 = str1.split(del);
        String[] array2 = str2.split(del);
        

        for(int i = 0; i<=array1.length-1; i++){
            if(Integer.parseInt(array1[i]) > Integer.parseInt(array2[i])){
            System.out.print("Array1 is largest");
            break;
            }
            else if(Integer.parseInt(array1[i]) < Integer.parseInt(array2[i])){
            System.out.print("Array2 is largest");
            break;
            }
        }  
    }
    
}
