class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        int firq = 0; 
        int secq = 0;
        for(int i =0; i < queries.length; i++){
            for(secq = queries[i][0]; secq <= queries[i][1]; secq++){
                if(secq % queries[i][2] == 0){
                    arr[secq] += 1;
                }
            }
        }
        answer = arr;
        return answer;
    }
}