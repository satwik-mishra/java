package assignment_1;

import java.util.Scanner;

public class q1 {
    public static void sum(int a[],int size)
    {
       int sum=0;
       for(int i=0;i<size;i++)
       {
        sum=sum+a[i];
       }
       System.out.println("sum="+sum);
    }

    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=ob.nextInt();
        int a[]=new int[size];
        System.out.println("enter the array elements");
        for(int i=0;i<size;i++)
        {
           a[i]=ob.nextInt();
        }
         sum(a, size);
 ob.close();
    }
}
