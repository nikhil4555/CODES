package HASH_MAPS;
import java.util.*;
public class union_array {
    public static void main(String[] args) {
       int arr1[] = {1,5,9,7,5,3};
       int arr2[] = {7,5,3,6,4,8,2};
        
       HashSet<Integer> set = new HashSet<>();
       
       for(int i=0;i<arr1.length;i++)
       set.add(arr1[i]);

       for(int j=0;j<arr2.length;j++)
       set.add(arr2[j]);
        
       System.out.println("the return size of union elemments is");
       System.out.println(set.size());

       Iterator it = set.iterator(); // using iterator here to traverse the hashset to print the values

       System.out.println("The elements after the union of two arrays are");
       while(it.hasNext())
       {
            System.out.print(it.next());
       }

    }
}
