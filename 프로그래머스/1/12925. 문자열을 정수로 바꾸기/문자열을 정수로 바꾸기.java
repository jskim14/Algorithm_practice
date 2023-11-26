class Solution {
    public int solution(String s) {
        boolean flag = true;
        int answer = 0;

        for (int i = 0 ; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '-') {
                flag = false;
            } else if(c != '+') {
                answer = answer * 10 + (c - '0');
            }
        }

        return flag?answer:answer*-1;
    }
}