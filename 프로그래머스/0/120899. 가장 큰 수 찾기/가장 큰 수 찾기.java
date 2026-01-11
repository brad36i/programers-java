class Solution {
    public int[] solution(int[] array) {
        int[] answer = {};
        answer = new int[2];
        int tmp = 0;
        for(int i = 0; i < array.length; i++){
            if(tmp < array[i]){
                answer[0] = array[i];
                answer[1] = i;
                tmp = array[i];
            }
        }
        return answer;
    }
}