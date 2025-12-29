
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int stwo = 0;
        int etwo = arr.length-1;
        
        while(stwo != etwo){
            if(arr[stwo] != 2){
                stwo++;
            }
            if(arr[etwo] != 2){
                etwo--;
            }
            if(stwo > etwo){
                return new int[]{-1};
            }
            if(arr[stwo] == 2 && arr[etwo] == 2){
                break;
            }
        }
        answer = new int[etwo - stwo + 1];
        for(int i = 0; i < answer.length; i++){
            answer[i] = arr[stwo + i];
        }
        answer[0] = answer[0] == 2 ? 2 : -1;
        return answer;
    }
}