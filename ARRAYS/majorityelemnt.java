package ARRAYS;
import java.util.*;

public class majorityelemnt {
    public static void main(String[] args) {
        int arr[] = {1,2,1,3,5,2,1,3,1}; // brute force approach with O(n^2)
        majority(arr);
        // for(int i=0;i<arr.length;i++)
        // {
        //     int count=0;//if count declared outside the count willnot boe reset to zero so to reset every time we declare here;
        //     for(int j=0;j<arr.length;j++)
        //     {
        //         if(arr[i]==arr[j])
        //         count++;
        //     }
        //     if(count>arr.length/3)
        //     System.out.print(arr[i]);
        // } 
        
    }
    public static void majority(int arr[])
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        int num = arr.length;
        for(int i=0;i<num;i++)
        {
            if(map.containsKey(arr[i]))//if already present we will update with the frequeney with 1
            {
                map.put(arr[i],map.get(arr[i])+1);
            }
            else
            {
                map.put(arr[i],1);//initially as 1
            }
        }
        for(int key:map.keySet())//keyset ha sall the keys in it
        {
            if(map.get(key)>num/3)
            System.out.println(key);
        }
    }
}
