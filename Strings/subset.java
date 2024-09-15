package Strings;
import java.util.*;
public class subset {
    public static void sub(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<=s.length();j++)
            {
               System.out.println(s.substring(i, j));
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter the stirng");
        String s=ob.nextLine();
        sub(s);
        ob.close();
    }
}
