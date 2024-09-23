import java.util.Scanner;

public class uppertriangular {
    public static void uppertriangularmatrix(int a[][],int row,int coloumn)
    {
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<coloumn;j++)
            {
                if(i>=j)
                {
                    System.out.print("0 ");
                }
                else
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter the rows and coloums");
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
        uppertriangularmatrix(a, row, coloumn);
        ob.close();
        
    }
}
