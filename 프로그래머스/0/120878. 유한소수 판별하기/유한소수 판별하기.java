class Solution {
    public int solution(int a, int b) {
        int answer = 2;
        int tmp = a < b ? a : b;
        
        while(tmp != 1){
            if(a % tmp == 0 && b % tmp == 0){
                a /= tmp;
                b /= tmp;
            }
            tmp--;
        }
        
        while(b % 2 ==0){
            b /= 2;
        }
        while(b % 5 ==0){
            b /= 5;
        }
        
        if(b == 1){
            answer = 1;
        }
        return answer;
    }
}