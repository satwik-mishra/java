package Sorting;
import java.util.*;
public class selection {
    public static void selectionsort(int a[],int size)
    {
        for(int i=0;i<size;i++)
        { int min=i; int temp=0;
            for(int j=i+1;j<size;j++)
            {
               if(a[j]<a[min])
               {
                min=j;
               }

            }
            temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }
    }
    public static void printarray(int a[],int size)
    {
        for(int i=0;i<size;i++)
        {
            System.out.print(a[i]+ " ");
        }
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
        selectionsort(a, size);
        printarray(a, size);
        ob.close();

    }
}
