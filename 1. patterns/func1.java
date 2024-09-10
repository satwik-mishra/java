import java.util.*;
public class func1 {
    public static void mul(int a, int b)
    {
        int p=a*b;
        System.out.println(p);
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter the numbers");
        int a=ob.nextInt();
        int b=ob.nextInt();
        mul(a,b);
        ob.close();
    }
    
}
