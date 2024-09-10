import java.util.Scanner;

public class diagonalsum {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter the rows and coloums");
        int row=ob.nextInt();
        int coloums=ob.nextInt();
        int a[][]=new int[row][coloums];
        System.out.println("enter the array");
      for(int i=0;i<row;i++)
      {
        for(int j=0;j<coloums;j++)
        {
            a[i][j]=ob.nextInt();
        }
      }
      int sum=0;
      for(int i=0;i<row;i++)
      {
        for(int j=0;j<coloums;j++)
        {
            if(a[i]==a[j])
            {
                sum=sum+a[i][j];
            }
        }
      }
      for(int i=0;i<row;i++)
      {
        for(int j=0;j<coloums;j++)
        {
            System.out.print(a[i][j]);
        }
        System.out.println();
    }

      System.out.println("sum is"+sum+" ");
      ob.close();
    }
}
