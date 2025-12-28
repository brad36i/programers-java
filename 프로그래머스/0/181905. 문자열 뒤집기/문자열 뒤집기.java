import java.util.Arrays;
class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String[] strArr = my_string.split("");
        String tmp = "";
        while(s <= e){
            tmp = strArr[s];
            strArr[s] = strArr[e];
            strArr[e] = tmp;
            s++;
            e--;
        }
        answer = String.join("", strArr);
        return answer;
    }
}