package BASICS;
import java.util.*;

//import ARRAYS.reverse;
public class fibo {
    public static int fibb(int num)
    {
        if(num==0)
        return 0;
        if(num==1||num==2)
        return 1;
        else
        return fibb(num-1)+fibb(num-2);
    }
    public static void main(String args[])
    {
        Scanner nkl = new Scanner(System.in);
        int num = nkl.nextInt();
        for(int i=0;i<num;i++)
        System.out.print(fibb(i)+" ");

    }
}
