class Solution {
    public int solution(String my_string) {
        int answer = 0;
        int tmp = 0;
        for(int i = 0; i < my_string.length(); i++){
            if(my_string.charAt(i) >= 'A'){
                
            }
            else if(i >= 1 && my_string.charAt(i - 1) < 'A'){
                tmp *= 10;
                tmp += (int)my_string.charAt(i) - '0';
            }
            else if(my_string.charAt(i) >= '0' && my_string.charAt(i) <= '9'){
                answer += tmp;
                tmp = (int)my_string.charAt(i) -'0';
            }
        }
        answer += tmp;
        return answer;
    }
}