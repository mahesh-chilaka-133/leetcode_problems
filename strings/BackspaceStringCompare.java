package strings;

public class BackspaceStringCompare {

    public boolean backspaceCompare(String s, String t) {
        
        return buildString(s).equals(buildString(t));

    }

    public String buildString (String str) {

        StringBuilder sb = new StringBuilder();

        for (char ch : str.toCharArray()) {

            if (ch != '#') {

                sb.append(ch);

            }else if (sb.length() > 0) {

                sb.deleteCharAt(sb.length() - 1);
            }
        }
        return sb.toString();

    }

}