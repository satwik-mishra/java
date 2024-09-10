package numberprg;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter a number");
        int n=ob.nextInt();int r=0;
        while(n!=0)
        {
            int d=n%10;
            r=r*10+d;
            n=n/10;
        }
            System.out.println("reversed number is="+r);
            ob.close();
    }
}
