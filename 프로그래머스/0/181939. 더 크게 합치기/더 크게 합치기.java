class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String stra = String.valueOf(a);
        String strb = String.valueOf(b);
        int ab = Integer.valueOf(stra + strb);
        int ba = Integer.valueOf(strb + stra);
        answer = ab > ba ? ab : ba;
        
        
        return answer;
    }
}