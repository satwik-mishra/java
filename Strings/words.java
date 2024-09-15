package Strings;
import java.util.*;
public class words {
    public static void numberofwords(String s)
    {int count=1;
      for(int i=0;i<s.length()-1;i++)
      {
        if((s.charAt(i)==' ')&& (s.charAt(i+1)!=' '))
        {
          count++;
        }
      }
      System.out.println("number of words ="+count);
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter the string");
        String s=ob.nextLine();
        numberofwords(s);
        ob.close();
    }
}
