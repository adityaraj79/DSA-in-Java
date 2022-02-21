package com.basicsinjava;

public class Main {
    public static int calcFac(int n){
        if(n==0 ||n==1){
            return 1;
        }
        int fact_nm1 = calcFac(n-1);
        int fact_n = n*(fact_nm1);
        return fact_n;
        
    }
    public static void main(String[] args) {
        int n = 7;
        int ans = calcFac(n);
        System.out.println(ans);
    }
}
