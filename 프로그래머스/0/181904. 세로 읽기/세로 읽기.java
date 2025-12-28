class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        int count = c - 1;
        while(count < my_string.length()){
            answer += my_string.charAt(count);
            count += m;
        }
        return answer;
    }
}