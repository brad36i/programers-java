class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = {};
        answer = new String[quiz.length];
        String[] form = {};
        int x, y, sum = 0;
        
        for(int i = 0; i < quiz.length; i++){
            form = quiz[i].split(" ");
            x = Integer.valueOf(form[0]).intValue();
            y = Integer.valueOf(form[2]).intValue();
            sum = Integer.valueOf(form[4]).intValue();
            if(form[1].equals("+")){
                if(x + y == sum){
                    answer[i] = "O";
                }
                else{
                    answer[i] = "X";
                }
            }
            else if(form[1].equals("-")){
                if(x - y == sum){
                    answer[i] = "O";
                }
                else{
                    answer[i] = "X";
                }
            }
        }
        return answer;
    }
}