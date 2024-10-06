import java.util.*;
public class largestwithsorting {
    public static void sortedarray(int a[],int size)
    {
        for(int i=0;i<size;i++)
        { int temp=0;
            for(int j=0;j<size-1-i;j++)
            {
               if(a[j]<a[j]+1) 
               {
                 temp=a[j];
                 a[j]=a[j+1];
                 a[j+1]=temp;
               }
            }
        }
    }
    public static void print(int a[],int size)
    {
        System.out.println("the largest element is");
        System.out.println(a[size-1]);
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
        sortedarray(a, size);
        print(a, size);
        ob.close();
        
    }
    
}
