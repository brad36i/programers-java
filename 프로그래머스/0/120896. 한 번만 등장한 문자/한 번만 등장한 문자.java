class Solution {
    public String solution(String s) {
        String answer = "";
        int slength = s.length();
        int[] alphabet = new int[26];
        for(int i = 0; i < slength; i++){
            alphabet[s.charAt(i) - 'a']++;
        }
        int length = 0;
        for(int i = 0; i < alphabet.length; i++){
            if(alphabet[i] == 1){
                answer += (char)('a' + i);
            }
        }
        return answer;
    }
}