import java.util.*;

class Two_string_anagram {
    static boolean areAnagram(String a,String b) {
        if(a.length() != b.length()) {
            return false;
        }
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i=0; i<a.length(); i++) {
            if(map.containsKey(a.charAt(i))) {
                map.put(a.charAt(i), map.get(a.charAt(i)) + 1);
            } else {
                map.put(a.charAt(i), 1);
            }
        }
        
        for(int i=0; i<b.length(); i++) {
            if(map.containsKey(b.charAt(i))) {
                map.put(b.charAt(i), map.get(b.charAt(i)) - 1);
            } else {
                return false;
            }
        }
        
        Set<Character> s = map.keySet();
        for(Character x : s) {
            if(map.get(x) != 0)
                return false;
        }
        
        return true;
    }

    public static void main(String[] args) {
        String str1 = "geeksforgeeks";
        String str2 = "forgeeksgeeks";

        if (areAnagram(str1, str2))
            System.out.print("The two strings are anagram of each other");
        else
            System.out.print("The two strings are not anagram of each other");
    }
}