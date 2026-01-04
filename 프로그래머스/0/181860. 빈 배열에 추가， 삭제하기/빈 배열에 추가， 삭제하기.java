import java.util.Stack;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        int[] answer = {};
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < arr.length; i++){
            if(flag[i]){
                for(int j = 0; j < arr[i]; j++){
                    stack.push(arr[i]);
                    stack.push(arr[i]);
                }
            }
            else{
                for(int j = 0; j < arr[i] && stack.isEmpty() == false; j++){
                    stack.pop();
                }
            }
        }
        answer = stack.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}