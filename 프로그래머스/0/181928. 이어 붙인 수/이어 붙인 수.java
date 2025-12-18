class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String oddnum = "";
        String evennum = "";
        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] % 2 == 0){
                evennum += num_list[i];
            }
            else{
                oddnum += num_list[i];
            }
        }
        answer = Integer.valueOf(evennum) + Integer.valueOf(oddnum);
        return answer;
    }
}