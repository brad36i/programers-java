class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        String tmp = "";
        if(A.equals(B)){
            answer = 0 ;
            return answer;
        }
        for(int i = 0; i < A.length(); i++){
            answer++;
            tmp += A.charAt(A.length() - 1);
            tmp += A.substring(0, A.length() - 1);
            if(B.equals(tmp)){
                break;
            }
            if(answer == A.length()){
                answer = -1;
            }
            
            A = tmp;
            tmp = "";
        }
        
        return answer;
    }
}