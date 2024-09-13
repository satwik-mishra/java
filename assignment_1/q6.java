package assignment_1;

import java.util.Scanner;

public class q6 {
    public static void perfect(int n)
    {  int sum=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        if(sum==n)
        {
            System.out.println("perfect number");

        }
        else
        System.out.println("not perfect");
        System.out.println("");
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter the number");
        int n=ob.nextInt();
        ob.close();
        perfect(n);

    }
}
