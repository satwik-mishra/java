package Strings;
import java.util.*;
public class rotation {
    public static void rotet(String s1,String s2)
    {
        s1=s1.concat(s1);
        System.out.println("concatenated string is  "+s1);
        for(int i=0;i<s1.length();i++)
        {
            if(s2.charAt(i)==(s1.charAt(i)))
            {
                System.out.println(s2+" is rotation of "
                +s1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter the string");
        String s1=ob.nextLine();
        System.out.println("enter the another string");
        String s2=ob.nextLine();
        rotet(s1,s2);
        ob.close();
    }
}
