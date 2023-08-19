package ARRAYS;

import java.util.*;
public class bubblesort {
    public static void main(String args[])
    {
        Scanner nkl = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int num = nkl.nextInt();
        int arr[] = new int[num];
        System.out.println("enter the elemnts in the array");
        for(int i=0;i<num;i++)
        arr[i]=nkl.nextInt();   
        //logic
        for(int i=0;i<num;i++)//for the passes that each can have
        {
            for(int j=0;j<num-1-i;j++)//why num-1-i-----> bcz we will check each number with the subsequent one without clashing
                                      // and also saving the time by not going to check tilll last element
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int i=0;i<num;i++)
        System.out.print(arr[i]+" ");
    }
}
