class Solution {
    public int solution(String number) {
        int answer = 0;
        int sum = 0;
        String[] strArr = number.split("");
        for(int i = 0; i < strArr.length; i++){
            sum += Integer.valueOf(strArr[i]).intValue();
        }
        answer = sum % 9 ;
        return answer;
    }
}