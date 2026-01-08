class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = {};
        int length = my_str.length();
        answer = new String[(length % n == 0 ? length / n : length / n + 1)];
        int index = 0;
        String tmp = "";
        for(int i = 0; i < answer.length; i++){
            if(my_str.length() < n){
                answer[answer.length -1 ] = my_str;
                break;
            }
            answer[i] = my_str.substring(0, n);
            my_str = my_str.substring(n , my_str.length());
        }
        
        return answer;
    }
}