class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int last = common.length - 1;
        if(common[1] - common[0] == common[2] - common[1]){
            answer = common[last] + (common[1] - common[0]);
        }
        else{
            answer = common[last] * (common[2] - common[1]) / (common[1] - common[0]);
        }
        return answer;
    }
}