package PATTERNS;

public class p4 {
    public static void main(String args[])
    {
        int num = 5;
        for(int i=0;i<num;i++)
        {
            for(int j=0;j<num-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<i;k++)
            System.out.print(" *");

            System.out.println(" ");
        }

    }
}
//just give a gap to the existing right of right angle triangle to get equilateral triangle