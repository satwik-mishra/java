import java.util.Scanner;

public class identity {
    public static void identitymatrix(int a[][],int row,int coloumn)
    {  boolean flag=true;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<coloumn;j++)
            {
                if(i==j && a[i][j]!=1)
                {
                    flag=false;
                    break;
                }
              else if(i!=j && a[i][j]!=0)
              {
                flag=false;
                break;
              }
            }
        
        }
        if(flag)
        {
            System.out.println("identity matrix");
        }
        else
        System.out.println("not identity matrix");
    }
       
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter the rows and coloums of the array");
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
        identitymatrix(a, row, coloumn);
        ob.close();


    }
}
