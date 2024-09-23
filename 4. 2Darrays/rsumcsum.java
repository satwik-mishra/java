import java.util.Scanner;

public class rsumcsum {
    public static void rs(int a[][],int row,int coloumn)
    { 
        
        for( int i=0;i<row;i++)
        {int sum=0; 
            for( int j=0;j<coloumn;j++)
            {
                sum=sum+a[i][j];
            }
            System.out.println("row"+i+"sum is"+sum);
          }
          
    }
    public static void cs(int a[][],int row,int coloumn)
    {
        for(int j=0;j<coloumn;j++)
        { int sum=0;
            for(int i=0;i<row;i++)
            {
            sum+=a[i][j];
            }
            System.out.println("coloumn"+j+"sum is"+sum);
        }
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
        System.out.println("the array is");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<coloumn;j++)
            {
               System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        rs(a, row, coloumn);
        cs(a, row, coloumn);
        ob.close();
    }
}
