import java.util.Arrays;
class Solution {
    public int[] solution(String s) {
        int zeroCountSum = 0;
        int transCount = 0;

        while (s.length() > 1) {
            String trans = s.replaceAll("0", "");
            int zeroCount = s.length() - trans.length();
            s = Integer.toBinaryString(trans.length());
            transCount++;
            zeroCountSum += zeroCount;
        }

        return new int[]{transCount,zeroCountSum};
    }
}
