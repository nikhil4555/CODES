package HASH_MAPS;
import java.util.HashMap;

public class h1 {
    public static void main(String[] args) {
        HashMap<String,Integer> empid = new HashMap<>(); 
        empid.put("nikhil",207200);
        empid.put("nikhil",207200);
        empid.put("nikhil",207200);
        empid.put("nikhil",207200);
        empid.put("niikhil",207200);
        empid.put("nikhil",2072000);
        System.out.println(empid );
        
        System.out.println(empid.get("nikhil"));
        System.out.println(empid.containsKey("pintu"));
        System.out.println(empid.containsValue(207200));
        // .remove, .replace, .addifabsent
    }
}
