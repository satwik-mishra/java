package Recursion;
import java.util.*;
public class pincreasing {
    public static void pi(int n)
    {
        if(n==0)
        {
            return;
        }
        pi(n-1);
        System.out.println(n);
        
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter the number");
        int n=ob.nextInt();
        pi(n);
        ob.close();
    }
}
