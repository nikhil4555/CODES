package BASICS;
import java.util.*;
public class towerofhanoi {
    public static void main(String args[])
    {
        Scanner nkl = new Scanner(System.in);
        System.out.println("enter number of disks");
        double num = nkl.nextDouble();
        double r = Math.pow(2,num)-1;
        
        System.out.println("the total count is "+ r);
        System.out.println("Paths covered are ");
        TOI(num, 'A','B','C');
        // the time complexity is 2^ n
    }
    public static void TOI(double n,char a, char b, char c)
    {
        
        if(n==1)
        {
            System.out.println("disc moved from "+ a + " to "+c);
        }
        else
        {
            TOI(n-1, a, c,b);
            System.out.println("disc moved from "+ a + " to "+c);
            TOI(n-1,b, a, c);
           
        }
        
    
        
        
    }
}
