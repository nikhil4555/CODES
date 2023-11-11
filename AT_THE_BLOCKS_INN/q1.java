import java.util.Arrays;
import java.util.Scanner;
package AT_THE_BLOCKS_INN;

public class q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String str1 = scanner.nextLine();
        System.out.println("Enter the second string: ");
        String str2 = scanner.nextLine();

        boolean areAnagrams = areAnagrams(str1, str2);

        String result = areAnagrams ? "True" : "False";
        
        System.out.println("Are the given strings anagrams? " + result);
    }

    // Function to check if two strings are anagrams
    public static boolean areAnagrams(String str1, String str2) {
        // Remove spaces and convert the strings to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Check if the lengths of the two strings are the same
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert the strings to character arrays and sort them
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare the sorted character arrays
        return Arrays.equals(charArray1, charArray2);
    }
}
