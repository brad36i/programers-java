class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int x = 0 ; int y = 0;
        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] %2 ==0){
                x = x * 10 + num_list[i];
                
            }
            else{
                y = y * 10 + num_list[i];
                
            }
        }
        answer = x + y;
        return answer;
    }
}