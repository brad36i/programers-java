class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        char tmp  = '0';
        for(int i = 0; i < my_string.length(); i++){
            if(num1 == i){
                if(tmp == '0'){
                    tmp = my_string.charAt(num1);
                    answer += my_string.charAt(num2);
                }
                else{
                    answer += tmp;
                }
                continue;
            }
            else if(num2 == i){
                if(tmp == '0'){
                    tmp = my_string.charAt(num2);
                    answer += my_string.charAt(num1);
                }
                else{
                    answer += tmp;
                }
                continue;
            }
            answer += my_string.charAt(i);
        }
        return answer;
    }
}