package PATTERNS;

public class p2 {
    public static void main(String args[])
    {
        int arr[][] = new int[10][10];
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<=i;j++)
            {

                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
// right angled triangle and inverted right angle
/*
 for(int i=0;i<5;i++)
        for(int j=5;j>=i;j--)
      inverted right angle      
 */

