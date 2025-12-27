import java.util.Stack;
class Solution {
    public int[] solution(int[] arr) {
        int[] stk = {};
        Stack<Integer> stackInt = new Stack<>();
        int i = 0;
        while(i < arr.length){
            if(stackInt.isEmpty()){
                stackInt.push(arr[i]);
                i+= 1;
            }
            else if(stackInt.peek() <arr[i]){
                stackInt.push(arr[i]);
                i += 1;
            }
            else{
                stackInt.pop();
            }
        }
        return stackInt.stream()
                       .mapToInt(Integer::intValue)
                       .toArray();
    }
}