import java.util.*;;
public class subarrays {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=ob.nextInt();
        int a[]=new int[size];
        System.out.println("enter the array");
        for(int i=0;i<a.length;i++)
        {
            a[i]=ob.nextInt();
        }
       for(int i=0;i<a.length;i++)
       {
        for(int j=i;j<a.length;j++)
        {
            for(int k=i;k<=j;k++)
            {
                System.out.print(a[k]);
            }
            System.out.println();
        }
        System.out.println();
       }
       ob.close();
        }
        
    }

