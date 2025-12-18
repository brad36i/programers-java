class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        int log = 0;
        for(int i = 0; i < numLog.length -1; i++){
            log = numLog[i+1] - numLog[i];
            if(log > 0){
                answer += log == 1 ? 'w' : 'd';
            }
            else{
                answer += log == -1 ? 's' : 'a';
            }
        }
        return answer;
    }
}