import java.util.*;
public class pairs {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=ob.nextInt();
        int a[]=new int[size];

        System.out.println("enter the array elements");
        for(int i=0;i<a.length;i++)
        {
            a[i]=ob.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                System.out.print("("+a[i]+","+a[j]+")");
            }
            System.out.println();
        }
        ob.close();
    }
}
