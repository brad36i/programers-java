class Solution {
    public int[] solution(int num, int total) {
        int[] answer = {};
        answer = new int[num];
        int x = 1000;
        while(num * x + (num * (num - 1)) / 2 != total){
            x--;
        }
        for(int i = 0; i < num; i++){
            answer[i] = x + i;
        }
        
        return answer;
    }
}