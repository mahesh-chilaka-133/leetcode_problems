package strings;

import java.util.HashMap;

public class WordPattern {
    
    public boolean wordPattern(String pattern, String s) {
        
        String[] words = s.split(" ");
        HashMap<Character, String> mapP = new HashMap<>();
        HashMap<String, Character> mapS = new HashMap<>();

        if (pattern.length() != words.length) {
            return false;
        
        }

        for (int i = 0; i < pattern.length(); i++) {

            char ch1 = pattern.charAt(i);
            String ch2 = words[i];

            if (mapP.containsKey(ch1)) {

                if (!mapP.get(ch1).equals(ch2)) {
                    return false;
                }
            }else {
                mapP.put(ch1, ch2);
            }

            if (mapS.containsKey(ch2)) {

                if (mapS.get(ch2) != ch1) {
                    return false;
                }
            }else {
                mapS.put(ch2, ch1);
            }

        }
        return true;

    }


}
