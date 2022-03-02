package com.company;
import java.util.Scanner;
import java.util.function.Function;
public class RemoveSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String...");
        String string = sc.nextLine();
        String st2 = fun(string);
        sc.close();
    }

    private static String fun(String string) {
        String string1 = string.replaceAll("\\s+","");
        System.out.println("String Removes Spaces..."+ string1);
        return string1;
    }
}
