/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ishfaaq Ismath
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [][] student = new String [5][2];
        student[0][0] = "Amal";
        student[0][1] = "27";
        
        student[1][0] = "kamal";
        student[1][1] = "25";
        
        student[2][0] = "Nimmal";
        student[2][1] = "21";
        
        student[3][0] = "Sunimal";
        student[3][1] = "28";
        
        student[4][0] = "Bimal";
        student[4][1] = "26";
        
        //System.out.print(student.length);
        
        String [][] temp = new String[1][2];
        
        for(int i = 0; i<=student.length-1; i++){
        
            for (int j = 0; j<=student.length-1-i; j++){
                   if(Integer.parseInt(student[i][1])>Integer.parseInt(student[j][1])){
                       temp[0][0]= student[i][0];
                       temp[0][1]= student[i][1];
                       
                       student[i][0] = student[j][0];
                       student[i][1] = student[j][1];
                       
                       student[j][0] = temp[0][0];
                       student[j][1] = temp[0][1];
                   } else {
                   }
            }
        }
        
        
        for(int k = 0; k<= student.length-1; k++){
            System.out.print(student[k][0] + " ");
            System.out.println(student[k][1]);
        }
    }
    
}
