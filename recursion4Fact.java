package com.basicsinjava;

public class Recursion {
    public static int calcFactorial(int n){
        if(n==1 ||n==0){
            return 1;
        }

        int fact_nm1 = calcFactorial(n-1);
        int fact = n*fact_nm1;
        return fact;
    }
        public static void main(String args[]){
            System.out.println(calcFactorial(5));
        
    }
    
}
