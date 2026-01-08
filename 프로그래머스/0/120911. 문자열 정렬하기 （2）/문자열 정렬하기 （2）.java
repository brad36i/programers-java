import java.util.Arrays;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        my_string = my_string.toLowerCase();
        char[] charArray = my_string.toCharArray(); 
        Arrays.sort(charArray);
        answer = new String(charArray);
        return answer;
    }
}