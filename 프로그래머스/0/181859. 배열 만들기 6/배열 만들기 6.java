import java.util.Stack;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int i = 0;
        Stack<Integer> stk = new Stack<>();
        
        while(i < arr.length){
            if(stk.isEmpty()){
                stk.add(arr[i]);
                i++;
            }
            else if(stk.peek() == arr[i]){
                stk.pop();
                i++;
            }
            else if(stk.peek() != arr[i]){
                stk.push(arr[i]);
                i++;
            }
        }
        if(stk.isEmpty()){
            stk.push(-1);
        }
        answer = stk.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}