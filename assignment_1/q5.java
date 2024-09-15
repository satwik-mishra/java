package assignment_1;

import java.util.Scanner;

public class q5 {
    public static void fibo(int n)
    {
        int a=0;
        int b=1;
        int c=0;
        for(int i=2;i<n;i++)
        {
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println("nth fibonacci term is "+c);
    }
    
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter the number");
        int n=ob.nextInt();
        ob.close();
        fibo(n);

        
    }
}

