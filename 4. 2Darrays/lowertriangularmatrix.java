import java.util.Scanner;

public class lowertriangularmatrix {
    public static void lowertriangularmat(int a[][],int row,int coloumn)
    {
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<coloumn;j++)
            {
                if(j>i)
                {
                    System.out.print("0");
                }
                else
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter the row and coloumn of the matrix ");
        int row=ob.nextInt();
        int coloumn=ob.nextInt();
       int a[][]=new int[row][coloumn];
        if(row!=coloumn)
        {
            System.out.println("enter the same size of row and coloums because it has to be square matrix");
        }
        else{
            System.out.println("enter the array elements");
            for(int i=0;i<row;i++)
            {
                for(int j=0;j<coloumn;j++)
                {
                    a[i][j]=ob.nextInt();
                }
            }
    }
    lowertriangularmat(a, row, coloumn);
    ob.close();
        }
       
}
