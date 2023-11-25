package ARRAYS;

public class majorityelemnt {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,1,3,1,5,1}; // brute force approach with O(n^2)

        for(int i=0;i<arr.length;i++)
        {
            int count=0;//if count declared outside the count willnot boe reset to zero so to reset every time we declare here;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                count++;
            }
            if(count>arr.length/3)
            System.out.print(arr[i]);
        }
        
    }
}
