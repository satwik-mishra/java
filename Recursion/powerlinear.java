package Recursion;
import java.util.*;
public class powerlinear {
    public static int power(int x,int n)
    {
        if(n==0)
        {
            return 1;
        }
     return x*power(x, n-1);
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter the number and the power");
        int x=ob.nextInt();
        int n=ob.nextInt();
 
        System.out.println("power of "+x +"and "+n+" is "+ power(x, n));
        ob.close();

    }
}
