class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        int length = 0;
        for(int num : numlist){
            if(num % n == 0){
                length += 1;
            }
        }
        answer = new int[length];
        int index = 0;
        for(int num : numlist){
            if(num % n == 0){
                answer[index] = num;
                index++;
            }
        }
        return answer;
    }
}