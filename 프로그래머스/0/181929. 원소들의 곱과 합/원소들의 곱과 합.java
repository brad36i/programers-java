class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int mulsum = 1;
        for(int i = 0; i < num_list.length; i++){
            sum += num_list[i];
            mulsum *= num_list[i];
        }
        answer = sum * sum <= mulsum ? 0 : 1;
        return answer;
    }
}