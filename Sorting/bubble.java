package Sorting;

import java.util.Scanner;

public class bubble {
    public static void buublesort(int a[],int size)
    {  int temp;
        // for(int i=0;i<size;i++)  // loop for number of rounds
        // {
        //     for(int j=0;j<size-1-i;j++) // loop to check for adjacent elements
        //     {
        //         if(a[j]<a[j+1])
        //         {
        //             temp=a[j];
        //             a[j]=a[j+1];
        //             a[j+1]=temp;
        //         }
        //     }
        // }
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size-1-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(int i=0;i<size;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size=ob.nextInt();
        int a[]=new int[size];
       System.out.println("enter the array elements");
       for(int i=0;i<size;i++)
       {
        a[i]=ob.nextInt();
       }
       buublesort(a, size);
       ob.close();
    }
}
