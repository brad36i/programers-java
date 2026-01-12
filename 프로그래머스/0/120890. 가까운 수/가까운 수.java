class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int tmp = 100;
        for(int num : array){
            int gap = ((n - num) < 0 ? num - n : n - num);
            if(tmp > gap){
                tmp = gap;
                answer = num;
            }
            else if(tmp == gap && num < answer){
                answer = num;
            }
        }
        return answer;
    }
}