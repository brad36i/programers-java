class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for(int i = 0; i < babbling.length; i++){
            if(String.join("", babbling[i].split("aya|ye|woo|ma")).equals("")){
                answer += 1;
            }
        }
        return answer;
    }
}