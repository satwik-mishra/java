package Recursion;
import java.util.*;
public class pdecreasing {
    public static void pd(int n)
    {
        if(n==0)
        {
            return;
        }
        
        System.out.println(n);
        pd(n-1);
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter the number");
        int n=ob.nextInt();
        System.out.println("the decreasing format of the number is");
        pd(n);
        ob.close();
    }
}
