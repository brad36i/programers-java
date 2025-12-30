class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        for(int i = 0; i < queries.length; i++){
            for(int ii = queries[i][0]; ii <= queries[i][1]; ii++){
                arr[ii] += 1;
            }
        }
        answer = arr;
        return answer;
    }
}