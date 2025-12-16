class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String stringa = String.valueOf(a);
        String stringb = String.valueOf(b);
        int AplusB = Integer.valueOf(stringa+ stringb);
        if(AplusB >= (2*a*b)){
            answer = AplusB;
        }
        else{
            answer = 2*a*b;
        }
        return answer;
    }
}