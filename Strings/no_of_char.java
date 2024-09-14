package Strings;

import java.util.Scanner;

public class no_of_char {
    public static void charac(String s)
    {
         int count=0;
         for(int i=0;i<s.length();i++)
         {
            count++;
         }
         System.out.println("number of characters="+count);
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter the string");
        String s=ob.nextLine();
        charac(s);
        ob.close();
    }
    
}
