import java.util.*;
public class twosum {
    public static void twosumproblem(int ap[],int size,int target)
    {
       for(int i=0;i<size;i++)
       {
        for(int j=i+1;j<size;j++)
        {
            if(ap[i]+ap[j]==target)
            {
             System.out.println("indexes are"+i +" "+ j);
            }
        
        }
        
       }
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=ob.nextInt();
        int ap[]=new int[size];
        System.out.println("enter the target");
        int target=ob.nextInt();
        System.out.println("enter the array elements");
        for(int i=0;i<size;i++)
        {
            ap[i]=ob.nextInt();
        }
           twosumproblem(ap, size, target);
           ob.close();
    }
}
