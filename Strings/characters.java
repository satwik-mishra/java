package Strings;

import java.util.*;
public class characters {
    public static void removeeachcharacter(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            System.out.println(s.charAt(i)+" ");
        }
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter the string");
        String s=ob.nextLine();
        removeeachcharacter(s);
        ob.close();
    }
}
