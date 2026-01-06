class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int[] stArray = new int[rank.length];
        for(int i = 0; i < rank.length; i++){
            if(attendance[i]){
                stArray[rank[i] - 1] = i+1;
            }
        }
        
        int tmp = 10000;
        for(int i = 0; i < stArray.length; i++){
            if(stArray[i] > 0){
                answer += (stArray[i] - 1) * tmp;
                tmp /= 100;
            }
        }
        return answer;
    }
}