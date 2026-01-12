
class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        for(int n = i; n <= j; n++){
            sb.append(n);
        }
        
        String str = sb.toString();
        char target = (char) (k + '0');
        
        for(int n = 0; n < str.length(); n++){
            if(str.charAt(n) == target)
                answer++;
        }
        return answer;
    }
}