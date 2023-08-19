package ARRAYS;
import java.util.*;
public class max {
    public static void main(String args[])
    {
       // Scanner nkl = new Scanner(System.in);
        int arr[] = {1,2,99,4,5};
        int max = arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(max < arr[i])
            max = arr[i];
        }
        System.out.println(max);
    }
}