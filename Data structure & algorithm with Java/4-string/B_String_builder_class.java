import java.util.*;

class B_String_builder_class {
    static String reverseStr(String str) {
        StringBuilder s = new StringBuilder(str);
        // String sd = ;
        return s.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        // StringBuilder sb = new StringBuilder(str);
        // StringBuilder sb = new StringBuilder(sc.next());
        // StringBuilder sb = new StringBuilder("Tony stark");

        // Get A Character from Index
        // System.out.println(sb.charAt(7));

        // Set T Character at Index
        // sb.setCharAt(0, 'A');

        // Insert a Character at Some Index
        // sb.insert(3, 'S');

        // Delete char at some Index
        // sb.delete(0, 1);

        // Append a char or String
        // sb.append('K');
        // sb.append(" mic");

        // Print Length of String
        // System.out.println(sb.length());

        // System.out.print(sb);

        System.out.print(reverseStr(str));
    }
}