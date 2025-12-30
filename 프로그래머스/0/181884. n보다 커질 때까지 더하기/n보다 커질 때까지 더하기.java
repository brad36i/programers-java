class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        int sum = 0;
        for(int num : numbers){
            if(sum <= n){
                sum += num;    
            }
            else{
                break;
            }
        }
        answer = sum;
        return answer;
    }
}