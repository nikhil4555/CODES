package BASICS;

public class binarytodecimal {
    public static void main(String args[])
    {
        int res =0;
        int i=0;
        int num = 1010;
        while(true)
        {
            if(num==0)
            break;
            else
            {
                int resu = num%10;
                res += resu*Math.pow(2, i);
                num /= 10;
                i++; 
            }
        }
    }   
}
