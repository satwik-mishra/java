package assignment_1;

import java.util.Scanner;

public class q4 {
    public static void linear(int a[],int size,int x)
    {
      for(int i=0;i<size;i++)
      {
        if(a[i]==x)
        {
            System.out.println("element found at position"+i);
        }
        else
        {
            System.out.println("element not found");
        }
      }
    }
    
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=ob.nextInt();
        int a[]=new int[size];
        System.out.println("enter the number to be searched");
        int x=ob.nextInt();
        System.out.println("enter the array elements");
        for(int i=0;i<size;i++)
        {
            a[i]=ob.nextInt();
        }
        linear(a, size, x);
        ob.close();
    }
}
