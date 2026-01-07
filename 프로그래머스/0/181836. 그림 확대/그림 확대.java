class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = {};
        answer = new String[picture.length * k];
        int index = 0;
        String tmp = "";
        for(String str : picture){
            for(int i = 0; i < str.length(); i++){
                for(int j = 0; j < k; j++){
                    tmp += str.charAt(i);
                }
            }
            
            for(int i = 0; i < k; i++){
                answer[index + i] = tmp;
            }
            index += k;
            tmp = "";
        }
        return answer;
    }
}