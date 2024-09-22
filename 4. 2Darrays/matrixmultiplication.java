import java.util.Scanner;
public class matrixmultiplication {
    public static void multiply(int a[][],int b[][],int row,int coloumn,int row2,int coloumn2)
    {
          int c[][]=new int[row][coloumn2];
          if(coloumn==row2)
          {
            for(int i=0;i<c.length;i++)
            {
                for(int j=0;j<c[0].length;j++)
                {
                    for(int k=0;k<coloumn;k++)
                    {
                        c[i][j]+=a[i][k]*b[k][j];
                        System.out.print(c[i][j]+" ");
                    }
                    System.out.println();
                }
               
            }
          }
          else
          System.out.println("multiplication not possible");
    }
    
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter the row and coloumn size of first matrix");
        int row=ob.nextInt();
        int coloumn=ob.nextInt();
        int a[][]=new int[row][coloumn];
        System.out.println("enter the first matrix elements");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<coloumn;j++)
            {
                a[i][j]=ob.nextInt();
            }
            
        }
        System.out.println("the first matrix is");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<coloumn;j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        System.out.println("enter the row and coloumn of 2nd matrix");
        int row2=ob.nextInt();
        int coloumn2=ob.nextInt();
        int b[][]=new int[row2][coloumn2];
        System.out.println("enter the second matrix elements");
        for(int i=0;i<row2;i++)
        {
            for(int j=0;j<coloumn2;j++)
            {
                b[i][j]=ob.nextInt();
            }
            
        }
        System.out.println("the second matrix is");
        for(int i=0;i<row2;i++)
        {
            for(int j=0;j<coloumn2;j++)
            {
                System.out.print(b[i][j]);
            }
            System.out.println();
        }
        multiply(a, b, row, coloumn, row2, coloumn2);
        ob.close();
    }
}

