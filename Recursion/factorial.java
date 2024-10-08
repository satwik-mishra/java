package Recursion;
import java.util.*;
public class factorial {
    public static int fact(int n)
    {
       if(n==0)
       {
        return 1;
       }
    //    return n*fact(n-1);
    int fn=fact(n-1);
    int f=n*fn;
    return f;

    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter the number");
        int n=ob.nextInt();
        System.out.println("factorial of the number is"+ fact(n));
   
   ob.close();
    }
}
