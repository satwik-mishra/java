import java.util.Scanner;

public class sparsematrix {
    public static void sparse(int a[][],int row,int coloumn)
    {  int count=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<coloumn;j++)
            {
                if(a[i][j]==0)
                {
                    count++;
                }
            }
        }
        int size=row*coloumn;
        if(count>(size/2))
        {
            System.out.println("it is a sparse matrix");
        }
        else
        System.out.println("not a sparse matrix");
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter the rows and coloums of the matrix");
        int row=ob.nextInt();
        int coloumn=ob.nextInt();
        int a[][]=new int[row][coloumn];
        System.out.println("enter the array elements");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<coloumn;j++)
            {
                a[i][j]=ob.nextInt();
            }

        }
        sparse(a, row, coloumn);
        ob.close();

    }
}
