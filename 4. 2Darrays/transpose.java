import java.util.Scanner;

public class transpose {
    public static void trans(int a[][],int row,int coloumn)
    {   int c[][]=new int[row][coloumn];
        System.out.println("transpose of the original matrix is");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<coloumn;j++)
            {
                c[i][j]=a[j][i];
                System.out.print(c[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter the size of matrix");
        int row =ob.nextInt();
        int coloumn=ob.nextInt();
        int a[][]=new int[row][coloumn];
        System.out.println("enter the matrix elements");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<coloumn;j++)
            {
                a[i][j]=ob.nextInt();
            }
        }
        System.out.println("the original matrix is");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<coloumn;j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        trans(a, row, coloumn);
        ob.close();
    }
}
