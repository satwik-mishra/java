import java.util.*;
public class checkifarrayissorted {
    public static boolean check(int a[],int size)
    {
        for(int i=1;i<size;i++)
        {
            if(a[i]>=a[i-1])
            {
                
            }
            else
            {
                return false;
            }
           
        }
        if(true)
        {
            System.out.println("it is sorted");
        }
        return false;
      
      
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
        check(a, size);
        ob.close();
    }
}
