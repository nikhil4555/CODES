package STRINGS;

public class ques {
        public static void main(String[] args)
        {
            //p-1
            String name = "Nikhil Vinay";
            String na2 = "Nikhil Vinay";
            System.out.println(name.toLowerCase());
            //p-2
            String str = "    to uper sharks";
            System.out.println(str.replace(" ","_"));
            //p-3
            String a = new String("Nikhil");
            String b = new String("Nikhil");
            System.out.println(name==na2);
            System.out.println(a==b); //comparetor---false
            System.out.println(a.equals(b)); //method---true


        }   
}
