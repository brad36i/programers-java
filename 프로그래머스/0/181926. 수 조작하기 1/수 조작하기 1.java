class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        answer = n ;
        char a;
        for(int i = 0; i < control.length(); i++){
            a = control.charAt(i);
            if(a == 'w'){
                answer += 1;    
            }
            else if(a== 's'){
                answer -= 1;
            }
            else if(a== 'd'){
                answer += 10;
            }
            else{
                answer -= 10;
            }
        }
        return answer;
    }
}