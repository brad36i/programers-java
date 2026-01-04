class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        int[] intArr = new int[100000];
        int length = 0;
        for(int i = 0; i < arr.length; i++){
            if(length == k){
                break;
            }
            if(intArr[arr[i]] == 0){
                answer[length] = arr[i];
                length++;
                intArr[arr[i]] = 1;
            }
        }
        while(length < k){
            answer[length] = -1;
            length++;
        }
        return answer;
    }
}