class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String chara = String.valueOf(a);
        String charb = String.valueOf(b);
        if(Integer.valueOf(chara+charb) >= Integer.valueOf(charb + chara)){
            answer = Integer.valueOf(chara + charb);
        }
        else{
            answer = Integer.valueOf(charb + chara);
        }
        return answer;
    }
}