
public class pyrami {
public static void main(String[] args) {
    for(int i=1;i<=4;i++)
    {
        for(int j=5-i-1;j>=1;j--)
        {
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++)
        {
            System.out.print("* ");
        }
        System.out.println();
    }
}
    
}