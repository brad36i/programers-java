class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        int length  = num_list.length;
        answer = new int[length + 1];
        for(int i = 0; i < answer.length + 1; i++){
            if( i == length){
                answer[i] = num_list[length - 1] <= num_list[length - 2] ? num_list[length -1] * 2 : num_list[length - 1] - num_list[length - 2];
                break;
            }
            answer[i] = num_list[i];
        }
        return answer;
    }
}