package numberprg;
import java.util.*;
public class factorial {
    public static void fact(int n)
    { 
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        System.out.println(f);
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter the number");
        int a=ob.nextInt();
        fact(a);
        ob.close();
    }
}
