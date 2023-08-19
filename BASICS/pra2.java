package BASICS;
import java.util.*;
public class pra2 {
    public static void main(String[] args)
    {
        Scanner nkl = new Scanner(System.in);
        int num = nkl.nextInt();

    if (num == 0)
      {
	    System.out.println ("Zero");
      }
      
    else{
        String result = num > 0 ? "The number is positive" : "The number is negative";
        System.out.println (result);
    }
}
}
//Ternary Operator Syntax
//( Condition ) ? ( if True : Action) : ( if False : Action) ;