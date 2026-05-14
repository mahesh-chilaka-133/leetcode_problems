package strings;

public class ReverseWords {
    
    public String reverseWords(String s) {
        
        StringBuilder result = new StringBuilder();
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            
            if (ch != ' '){
                word.append(ch);
            }else {
                result.append(word);
                result.append("");
                word.setLength(0);
            }
        }
        result.append(word);
        return result.toString();
    }

}
