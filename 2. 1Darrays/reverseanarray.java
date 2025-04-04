import java.util.Scanner;

public class reverseanarray {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=ob.nextInt();
        int a[]=new int[n];
        System.out.println("enter the array elements");
        for(int i=0;i<a.length;i++)
        {
          a[i]=ob.nextInt();
        }
        for(int j=n-1;j>=0;j--)
        {
            System.out.print(a[j]);

        }
        System.out.println();
    ob.close();;
    }
    
}
