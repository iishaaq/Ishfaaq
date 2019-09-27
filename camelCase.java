
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;
import static java.lang.Character.toUpperCase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ishfaaq Ismath
 */
public class camelCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String word = "AreaColombo";
        String word2 = "Hello sri Lanka Sri Sri";
        
        String [] array2 = word2.split(" ");
        List<String> List = Arrays.asList(array2);
        ArrayList<String> List2 = new ArrayList(Arrays.asList(array2));
        
        
        System.out.println(Arrays.toString(array2));
        int count = Collections.frequency(List2, "Sri");
        
        System.out.println(count);
        StringBuilder finalString = new StringBuilder();
        
        char [] wordarray = word.toCharArray();
        for(int i = 0; i<=wordarray.length-1; i++){
        if(i == 0){
        finalString.append(toUpperCase(wordarray[i])); 
        
        }
        else if(isUpperCase(wordarray[i])){
        finalString.append(" "); 
        finalString.append(toLowerCase(wordarray[i])); 
        }
        else
            finalString.append(wordarray[i]); 
        }
        
        System.out.println(finalString);
    }
    
}
