package com.basicsinjava;

public class Main {
    public static void printSum(int i, int n, int sum){
        if(i==n){
            sum=sum+i;
            System.out.println(sum);
            return;
        }
        sum = sum+i;
        printSum(i+1, n, sum);
    }

    
    public static void main(String[] args) {
        int n = 6;
        printSum(1, n, 0);
    }
}
