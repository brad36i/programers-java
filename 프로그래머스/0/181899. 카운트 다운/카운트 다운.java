class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] answer = {};
        int length = start_num - end_num + 1;
        answer = new int[length];
        int index = 0;
        while(start_num >= end_num){
            answer[index] = start_num;
            start_num--;
            index++;
        }
        return answer;
    }
}