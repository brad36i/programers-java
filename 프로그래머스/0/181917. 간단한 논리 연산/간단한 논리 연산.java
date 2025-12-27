class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        boolean left = (x1 == x2) ? x1 : true;
        boolean right = (x3 == x4) ? x3 : true;
        answer = (left==right) ? left : false;
        return answer;
    }
}