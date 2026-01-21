class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0 , 0};
        for(String str : keyinput){
            if(str.equals("left")){
                if(answer[0]-1 < board[0] / 2 * -1 ){
                    
                }
                else{
                    answer[0]--;
                }
            }
            else if(str.equals("right")){
                if(answer[0]+1 > board[0] / 2 ){
                    
                }
                else{
                    answer[0]++;
                }
            }
            else if(str.equals("up")){
                if(answer[1]+1 > board[1] / 2){
                    
                }
                else{
                    answer[1]++;
                }
            }
            else if(str.equals("down")){
                if(answer[1]-1 < board[1]/2*-1){
                    
                }
                else{
                    answer[1]--;
                }
            }
        }
        return answer;
    }
    
}