class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] strArr = binomial.split(" ");
        int first = Integer.valueOf(strArr[0]).intValue();
        int second = Integer.valueOf(strArr[2]).intValue();
        if(strArr[1].equals("+")){
            answer = first + second;
        }
        else if(strArr[1].equals("-")){
            answer = first - second;
        }
        else{
            answer = first * second;
        }
        return answer;
    }
}