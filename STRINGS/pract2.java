package STRINGS;

public class pract2 {   //all string methods 
    public static void main(String[] args)
    {
        String name = "Nikhil";
        String str =   "      mithil  is good  ";
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        System.out.println(str.trim()); //It trims the all spaces before and after string and prints

        System.out.println(str.substring(8 ));
        System.out.println(name.replace('k','p'));// replace's k with p
        
        System.out.println(name.startsWith("Ni")); //boolean
        System.out.println(name.endsWith("khil")); //boolean

        System.out.println(str.charAt(10));
        System.out.println(name.indexOf("kh"));

        System.out.println(name.equals("nikhi &l")); //boolean
        System.out.println(name.equalsIgnoreCase("nikhil")); //boolean


    }
}
