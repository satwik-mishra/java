import java.util.Scanner;

public class reverseapproach1 {
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
        int j=size;
        int arr[]=new int[j];
        for(int i=0;i<a.length;i++) 
        {
         arr[j-1]=a[i];
              j=j-1;
        }
        System.out.println("reversed array is");
         for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        ob.close();
    }
}
