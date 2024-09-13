package assignment_1;

import java.util.Scanner;

public class q2 {
    public static void maxmin(int a[],int size)
    {
        int max=a[0];
        int min=a[0];
        for(int i=0;i<size;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println("maximum element is "+max);
        for(int i=0;i<size;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        System.out.println("minimum element is="+ min);
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
        maxmin(a, size);
        ob.close();
    }
}
