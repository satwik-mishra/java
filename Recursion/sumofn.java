package Recursion;
import java.util.*;
public class sumofn {
    public static int sum(int n)
    {
        if(n==1)
        {
            return n;
        }
        // int smn1=sum(n-1);
        // int sn=n+smn1;
        // return sn;
        return n+sum(n-1);

    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter the number");
        int n=ob.nextInt();
        System.out.println("the sum of n numbers = "+sum(n));
        ob.close();
    }
}
