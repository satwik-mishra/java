package assignment_1;

import java.util.Scanner;

public class q3 {
    public static void fact(int n)
    {
        int fact=1;
        for(int i=1;i<=n;i++)
        {
           fact=fact*i;
        }
        System.out.println("factorial of "+n+" is "+fact);
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter the number");
        int n=ob.nextInt();
        ob.close();
        fact(n);
    }
}
