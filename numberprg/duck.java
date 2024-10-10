package numberprg;

import java.util.Scanner;

public class duck {
    public static void ducknumber(int n)
    {
        while(n!=0)
        {
           
            if(n%10==0)
            {
                System.out.println("it is a duck number");
                n=n/10;
            }
          
           
        }
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter the number");
        int n=ob.nextInt();
        ducknumber(n);
        ob.close();
    }
}
