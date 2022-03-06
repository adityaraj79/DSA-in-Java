package com.basicsinjava;
import java.util.HashSet;

public class Main {
    public static void subsequences(String str, int idx, String newString, HashSet<String> set){
        if(idx==str.length()){
            if(set.contains(newString)){
                return;
            }else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }

        char currChar = str.charAt(idx);
        //to be
        subsequences(str, idx+1, newString+currChar, set);

        //not to be
        subsequences(str, idx+1, newString, set);
    }
        public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();   
        String str = "aaa";
        subsequences(str, 0, "", set);
    }    
}
