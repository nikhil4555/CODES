package ARRAYS;

import java.util.*;
//import java.ARRAY;

public class secmax {
    public static void main(String args[])
    {
        Scanner nkl = new Scanner(System.in);
        int num = nkl.nextInt();
        int max,secmax;
        int arr[] = new int[num];
        for(int i=0;i<num;i++)
        {
            arr[i]=nkl.nextInt();
        }
        max = arr[0];
        for(int i=0;i<num;i++)
        {
            if(arr[i]>max)
            max = arr[i];
        }
        System.out.println(max);
        // for second largest we will traverse again with same process as finding the sec_largest but it should'nt be the largest
        // then its the sec largset.
        secmax = -1;
        for(int i=0;i<num;i++)
        {
            if(arr[i] > secmax && arr[i] != max) //initilasing sec_max to -1 i.e min and traversing the array and it shouldnt be equal to the largest.
            secmax = arr[i];
        }
        System.out.println(secmax);
    }
}
