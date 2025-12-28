class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        answer = my_string.contains(is_suffix) && is_suffix.equals(my_string.substring(my_string.length() - is_suffix.length())) ? 1 : 0;
        return answer;
    }
}