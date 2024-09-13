package assignment_1;

import java.util.Scanner;

public class q7 {
    public static void binarySearch(int a[],int size,int x)
    {
        int li=0;int hi=size-1;
        
        
        while (li<=hi) {
            int mi=(li+hi)/2;
             if(a[mi]==x)
             {
                System.out.println("element found at"+ mi);
            
                break;
             }
             else if(x>a[mi])
             {
                li=mi+1;
             }
             else
             {
                hi=mi-1;
             }
            
            
        }
        System.out.println("element not found ");
       
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
        System.out.println("enter the element to be searched");
        int x=ob.nextInt();
        binarySearch(a, size, x);
        ob.close();
    }
    
}
