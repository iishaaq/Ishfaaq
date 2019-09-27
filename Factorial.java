/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ishfaaq Ismath
 */
public class Factorial {

    static int factorial(int n){
        
        if(n == 1 || n == 0){
            return 1;
    }
        else return n*factorial(n-1);
    }
    
        static int fibbonossy(int n){
        
        if(n == 1 || n == 0){
            return 1;
    }
        else return fibbonossy(n-1) + fibbonossy(n-2);
        
    }
        
        
    public static void main(String[] args) {
        System.out.println(factorial(1));
        System.out.println(fibbonossy(5));
    }
    
}
