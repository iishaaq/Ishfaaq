
import java.io.FileInputStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ishfaaq Ismath
 */
public class inputStream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
        FileInputStream input1 = new FileInputStream("D:\\JavaTraining\\Ishfaaq.txt");
        int i = 0;
        while((i=input1.read()) != -1){
            System.out.print((char)i);
        }
        input1.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
