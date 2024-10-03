package numberprg;
import java.util.*;
public class specialnumber {
//     public static int factorial(int n)
//     {  int fact=1;
//         for(int i=1;i<=n;i++)
//         {
          
//             fact=fact*i;
//         }
//         return fact;
//     }
//     public static boolean special(int n)
//     {
//         int sum=0;
//         int temp=n;
//         while(temp>0)
//         {
//          int d=temp%10;
//          sum=sum+factorial(d);
//          temp=temp/10;
//         }
//         return sum==n;
      
//     }
//     public static void main(String[] args) {
//         Scanner ob=new Scanner(System.in);
//         System.out.println("enter the number");
//         int n=ob.nextInt();
//        if(special(n))
//        {
//         System.out.println("it is a special number");
//        }
//        else
//        System.out.println("not a special number");
//         ob.close();

//     }
// }

public static void main(String[] args) {
    Scanner ob=new Scanner(System.in);
    System.out.println("enter the number");
    int n=ob.nextInt();
    int num=n; int sum=0;
    while(num>0)
    {
        int d=n%10;
        int fact=1;
        for(int i=1;i<d;i++)
        {
            fact=fact*i;
        }
         sum=sum+fact;
         num=num/10;
         if(n==sum)
         {
            System.out.println("it is a special number");
         }
         else
         System.out.println("not a special number");
    }
    ob.close();

}
}