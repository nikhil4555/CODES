package PATTERNS;

public class p3 {
    public static void main(String args[])
    {
       // int arr[][]=new int[10][10];
        for(int i=0;i<5;i++) //passes
        {
            for(int j=0;j<=5-i;j++) // spaces
            {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++) // printing the symbol
            System.out.print("*");

            System.out.println(" ");// for the next line
        }
    }
}
