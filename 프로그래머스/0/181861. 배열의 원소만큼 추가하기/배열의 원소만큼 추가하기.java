import java.util.Stack;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        Stack<Integer> stack = new Stack<>();
        for(int num : arr){
            for(int i = 0; i < num; i++){
                stack.push(num);
            }
        }
        answer = stack.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}