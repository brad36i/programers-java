class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        answer = new int[52];
        int num = 0;
        for(int i = 0; i < my_string.length(); i++){
            num = Integer.valueOf(my_string.charAt(i) - 'A');
            num = num > 25 ? num - 6 : num;
            answer[num]+= 1;
        }
        return answer;
    }
}