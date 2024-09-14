package Strings;

import java.util.Scanner;

public class palindrome {
    public static void palin(String str)
    {  String reversed="";
            for(int i=str.length()-1;i>=0;i--)
        {
            reversed=reversed+str.charAt(i);
        }
        if(reversed.equals(str))
        {
            System.out.println("palindrome");

        }
        else
        System.out.println("not palindrome");
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter the string");
        String str=ob.nextLine();
        palin(str);
        ob.close();

    }
}
