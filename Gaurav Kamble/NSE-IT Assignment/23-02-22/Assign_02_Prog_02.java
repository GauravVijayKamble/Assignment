package com.company;
import java.util.Scanner;
public class CountSpaces {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ....");
        str = sc.nextLine();
        int count1 = fun(str);
    }
    public static int fun(String str){
        int count = 0;
        for(int i=0; i<str.length();i++){
            char ch = str.charAt(i);
            if(ch ==' '){
                count++;
            }
        }
        System.out.println(" Number of Spaces are..." + count);
        return count;
    }
}
