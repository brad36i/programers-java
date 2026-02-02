class Solution {
    public int solution(int n) {
        int answer = 1;
        int x = 1;
        while(answer <= n){
            answer *= x;
            x++;
        }
        answer = x - 2;
        return answer;
    }
}