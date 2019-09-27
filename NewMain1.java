/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ishfaaq Ismath
 */
import java.util.Arrays;
import java.util.Comparator;

public class NewMain1 {

    /**
     * @param args the command line arguments
     */
    static String [][] student = new String [5][2];
    
    public static void main(String[] args) {
        
        student[0][0] = "Amal";
        student[0][1] = "27";
        
        student[1][0] = "Kamal";
        student[1][1] = "25";
        
        student[2][0] = "Nimmal";
        student[2][1] = "21";
        
        student[3][0] = "Sunimal";
        student[3][1] = "28";
        
        student[4][0] = "Bimal";
        student[4][1] = "26";
        
        System.out.println("Before Sorting");
        displayArray();
        
//        Arrays.sort(student, new Comparator<String[]>(){
//         @Override
//         public int compare(String[]o1, String[]o2){
//         String item1 = o1[1];
//         String item2 = o2[1];
//         
//         return item1.compareTo(item2);
//                 }   
//        });
        
        Arrays.sort(student, new Comparator<String[]>(){

            @Override
            public int compare(String[] o1, String[] o2) {
                String item1 = o1[1];
                String item2 = o2[1];
                
                return item1.compareToIgnoreCase(item2);
                
                
            }
        
        
    
         });
//        
        System.out.println("After Sorting");
        displayArray();
        
        
         Arrays.sort(student, new Comparator<String[]>(){
         @Override
         public int compare(String[]o1, String[]o2){
         String item1 = o1[0];
         String item2 = o2[0];
         
         return item1.compareTo(item2);
                 }   
        });
        
        System.out.println("After Sorting by names");
        displayArray();
        
        
    }
    
    
        private static void displayArray() {
	System.out.println("-------------------------------------");
	System.out.println("Student Name\t\tAge");
	for (int i = 0; i < student.length; i++) {
		String[] itemRecord = student[i];
		System.out.println(itemRecord[0] + "\t\t\t" + itemRecord[1]);
	}
	System.out.println("-------------------------------------");
    }
    
}
