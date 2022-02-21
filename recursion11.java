package com.basicsinjava;

public class Main {
    public static int calcPow(int x, int n) {
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int pow_nm1 = calcPow(x, n-1);
        int pow_n = x*pow_nm1;
        return pow_n;
    }
    public static void main(String[] args) {
        int x=4, n=2;
        int ans=calcPow(x, n);
        System.out.println(ans);    
    }
}
