class Solution {
    public int solution(int[] sides) {
        int answer = 2;
        int tmp = 0;
        int index = 0;
        for(int i = 0;i < 3; i++){
            if(tmp < sides[i]){
                tmp = sides[i];
                index = i;
            }
        }
        int sum = 0;
        for(int i = 0; i < 3; i++){
            if(i != index){
                sum += sides[i];
            }
        }
        if(sum > sides[index]){
            answer = 1;
        }
        return answer;
    }
}