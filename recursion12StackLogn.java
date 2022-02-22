package com.basicsinjava;

public class Main {
    public static int calcPow(int x, int n) {
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        if(n%2==0){
            int ans = calcPow(x, n/2);
            int oans = ans*ans;
            return oans;
        }
        else{
            int ans2 = calcPow(x, n/2);
            int oans = ans2*ans2*x;
            return oans;
        }
    }
    public static void main(String[] args) {
        int x=4, n=3;
        int ooans = calcPow(x, n);
        System.out.println(ooans);
    }
}
