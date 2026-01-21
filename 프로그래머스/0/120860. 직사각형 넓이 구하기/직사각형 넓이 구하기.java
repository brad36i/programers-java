class Solution {
    public int solution(int[][] dots) {
        int answer = 1;
        for(int i = 1; i < 4; i++){
            if(dots[0][0] == dots[i][0]){
                answer *= dots[0][1] - dots[i][1];
            }
            else if(dots[0][1] == dots[i][1]){
                answer *= dots[0][0] - dots[i][0];
            }
        }
        answer = Math.abs(answer);
        return answer;
    }
}