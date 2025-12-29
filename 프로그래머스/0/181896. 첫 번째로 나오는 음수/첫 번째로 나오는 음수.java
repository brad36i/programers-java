class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        answer = -1;
        int count = 0;
        for(int num : num_list){
            if(num < 0){
                return count;
            }
            count++;
        }
        return answer;
    }
}