import java.util.*;;
public class largest {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=ob.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the array elements");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=ob.nextInt();
        }
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
     
        }
        System.out.println("the maximum element="+max);
        ob.close();
    }
}
