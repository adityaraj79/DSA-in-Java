package com.basicsinjava;

public class Main {
    public static void moveAllX(String str, int idx, int count, String newstr){
        if(idx==str.length()){
            for(int i=0; i<count; i++){
                newstr+='x';
            }
            System.out.println(newstr);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar=='x'){
            count++;
            moveAllX(str, idx+1, count, newstr);
        }else{
            newstr += currChar;
            moveAllX(str, idx+1, count, newstr);
        }
    }
    public static void main(String[] args) {
        String str = "axbxxxcxd";
        moveAllX(str, 0, 0, "");
    }    
}
