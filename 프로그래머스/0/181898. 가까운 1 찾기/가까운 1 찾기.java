class Solution {
    public int solution(int[] arr, int idx) {
        int answer = 0;
        int right = 0;
        while(arr[idx + right] != 1){
            if(idx + right == arr.length -1 ){
                right = -(idx + 1);
                break;
            }
            right += 1;
        }
        answer = idx + right; 
        return answer;
    }
}