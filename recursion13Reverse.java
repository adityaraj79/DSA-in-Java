package com.basicsinjava;

public class Main {
    public static void revStr(String str, int idx) {
        if(idx<0){
            return;
        }
        System.out.print(str.charAt(idx));
        revStr(str, idx-1);
    }
    public static void main(String[] args) {
        String str = "aditya";
        revStr(str, str.length()-1);
        
    }
}
