import java.util.Arrays;
class Solution {
    public long solution(long n) {
        char[] chars = String.valueOf(n).toCharArray();
        Arrays.sort(chars);
        String s1 = new StringBuilder(String.valueOf(chars)).reverse().toString();

        return Long.parseLong(s1);
    }
}