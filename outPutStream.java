
import java.io.FileOutputStream;
import java.io.OutputStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ishfaaq Ismath
 */
public class outPutStream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
        FileOutputStream out = new FileOutputStream("D:\\JavaTraining\\Ishfaaq.txt");
        String word = "Ishfaaq is a rockstar";
        
        byte [] array1 = word.getBytes();
        
        out.write(array1);
        out.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}

