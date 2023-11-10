import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> integers = new HashSet<>();
        for (int num : nums) {
            integers.add(num);
        }
        int numsLength = nums.length / 2;
        int answer = integers.size();

        return Math.min(answer, numsLength);
    }
}