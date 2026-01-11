class Solution {
    public int solution(int n) {
        int answer = 0;
        int tmp = 1000000;
        while(tmp != 0){
            answer += n / tmp;
            n = n % tmp;
            tmp /= 10;
        }
        return answer;
    }
}