package Strings;
import java.util.*;
public class reverse {
    public static void rev(String s)
    {
        String newstring="";
        for(int i=s.length()-1;i>=0;i--)
        {
            newstring=newstring+s.charAt(i);
        }
        System.out.println("reversed string is "+ newstring);

    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter the string");
        String s=ob.nextLine();
        rev(s);
        ob.close();
       
    }
}
