class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = {};
        
        int tmp = 0;
        int length = numlist.length;
        for(int i = 0; i < length; i++){
            for(int j = i; j < length; j++){
                if(Math.abs(n - numlist[i]) > Math.abs(n - numlist[j])){
                    tmp = numlist[i];
                    numlist[i] = numlist[j];
                    numlist[j] = tmp;
                }
                else if(Math.abs(n - numlist[i]) == Math.abs(n - numlist[j])){
                    if(numlist[i] > numlist[j]){
                        
                    }
                    else{
                        tmp = numlist[i];
                        numlist[i] = numlist[j];
                        numlist[j] = tmp;
                    }
                }
            }
        }
        answer = numlist;
        return answer;
    }
}