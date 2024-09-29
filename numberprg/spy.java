package numberprg;
import java.util.*;
public class spy {
    public static void spynumber(int n)
    {  int sum=0; int product=1;
         while(n!=0)
         {
            int d=n%10;
            sum=sum+d;
            product=product*d;
            n=n/10;
         }
         if(sum==product)
         {
            System.out.println("it is a spy number");
         }
         else
         System.out.println("not a spy number");
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter the number");
        int n=ob.nextInt();
        spynumber(n);
        ob.close();
        
    }
}
