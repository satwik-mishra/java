import java.util.*;
public class secondlargest {
    public static void slargest(int a[],int size)
    {
        for(int i=0;i<size;i++)
        { int temp=0;
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
    }
     public static void printlargest(int a[],int size)
     {
        System.out.println("the largest element is "+ a[size-1]);
     }
     public static void secondlarge(int a[],int size)
     { int max=a[0];
        for(int i=0;i<size-1;i++)
        {
          if(a[i]>max)
          {
            max=a[i];
          }
          
        }
        System.out.println("the second largest element ="+max);
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
        slargest(a, size);
        printlargest(a, size);
        secondlarge(a, size);
        ob.close();
    }
}
