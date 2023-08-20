package PATTERNS;

public class p3 {
    public static void main(String args[])
    {
       // int arr[][]=new int[10][10];
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<=5-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++)
            System.out.print("*");
            System.out.println(" ");
        }
    }
}
