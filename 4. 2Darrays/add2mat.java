import java.util.Scanner;

public class add2mat {
    public static void sum(int a[][],int b[][],int row,int coloumn)
    {    int c[][]=new int[row][coloumn];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<coloumn;j++)
            {
               c[i][j]=a[i][j]+b[i][j];
               System.out.print(c[i][j]+" ");
            }
           System.out.println();
        }
       
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter the size of matrix");
        int row=ob.nextInt();
        int coloumn=ob.nextInt();
        int a[][]=new int[row][coloumn];
        int b[][]=new int[row][coloumn];
        System.out.println("enter the matrix elements");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<coloumn;j++)
            {
              a[i][j]=ob.nextInt();
            }
        }
        System.out.println("enter the 2nd matrix elements");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<coloumn;j++)
            {
              b[i][j]=ob.nextInt();
            }
        }
        System.out.println("first matrix is");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<coloumn;j++)
            {
              System.out.print(a[i][j]);
            }
            System.out.println();
        }
        System.out.println("second matrix is");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<coloumn;j++)
            {
             System.out.print(b[i][j]);
            }
            System.out.println();
        }
        sum(a, b, row, coloumn);
           ob.close();
    }
}
