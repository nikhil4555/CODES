package BASICS;
import java.util.*;
public class decimaltobinary {
    public static void main(String args[])
    {
        Scanner nkl = new Scanner(System.in);
        System.out.println("enter the number that u want to conver to decimal");
        int num = nkl.nextInt();
        int i=0;
        int arr[] = new int[32]; //as its 32 bits
        while(num!=0)
        {
            arr[i] = num %2;
            num = num /2;
            i++;
        }
        for(int j = i-1;j>=0;j--)
        {
            System.out.print(""+arr[j]);
        }

    }
    
}
