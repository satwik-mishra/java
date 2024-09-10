import java.util.Scanner;

public class binarysearch {
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
        int li=0;
        int hi=a.length-1;
        int mi=(li+hi)/2;
        int key=30;
        while ((li<=hi)) {
            if(a[mi]==key)
            {
                System.out.println("the element is found in index="+mi);
                break;
            }
            else if (a[mi]<key) {
                li=mi+1;
            }
            else
            {
                hi=mi-1;
            }
            mi=(li+hi)/2;           
        }
ob.close();
    }
}
