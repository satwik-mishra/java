import java.util.Scanner;

public class no_of_7 {
    public static void numberofsevens(int a[][],int row,int col)
    {
        int count=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(a[i][j]==7)
                {
                    count++;
                }
            }
        }
        System.out.println("number of 7's="+ count);
    }
    public static void main(String[] args) {
    Scanner ob=new Scanner(System.in);
    System.out.println("enter the size of array");
    int row=ob.nextInt();
    int col=ob.nextInt();
    int a[][]=new int[row][col];
    System.out.println("enter the array elements");
    for(int i=0;i<row;i++)
    {
        for(int j=0;j<col;j++)
        {
            a[i][j]=ob.nextInt();
        }
    }
    numberofsevens(a, row, col);
 ob.close();
    }
}
