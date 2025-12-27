class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        if(a == b && b == c&& c == d){
            answer = a * 1111;
        }
        else if(a !=b && a != c && a != d && b !=c && b != d && c != d){
            answer = ((a < b) ? a : b) < ((c < d) ? c : d) ? ((a < b) ? a : b) : ((c < d) ? c : d);
        }
        else if((a==b&&c==d)||(a==c&& b==d)||(a==d&&b==c)){
            if(a == b || a != c){
                answer = (a + c) * ((a-c) < 0 ? (a-c)*-1 : (a-c));
            }
            else{
                answer = (a + b) * ((a-b) < 0 ? (a-b)*-1 : (a-b));
            }
        }
        else if((a==b&&b==c) || (a==c&&c==d) || (b==c&&c==d) || (a == b&&b==d)){
            if((a==b&&b==c)){
                answer = (10*a + d)*(10*a + d);
            }
            else if(a==c&&c==d){
                answer = (10*a + b)* (10*a + b);
            }
            else if(a == b&&b==d){
                answer = (10*a + c) *(10*a + c);
            }
            else{
                answer = (10*b + a) * (10*b + a);
            }
        }
        else{
            if(a == b){
                answer = c * d;
            }
            else if(a == c){
                answer = b * d;
            }
            else if(a == d){
                answer = b * c;
            }
            else if(b == c){
                answer = a * d;
            }
            else if(b == d){
                answer = a * c;
            }
            else if(c == d){
                answer = a * b;
            }
        }
        return answer;
    }
}