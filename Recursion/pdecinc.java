package Recursion;
import java.util.*;
public class pdecinc {
    public static void pdi(int n)
    { 
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        pdi(n-1);
         System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter the number");
        int n=ob.nextInt();
        System.out.println("in decreasing increasing format :");
        pdi(n);
        ob.close();

    }
}
