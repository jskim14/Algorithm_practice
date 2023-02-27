class Solution {
    public int[] solution(int money) {
        int cup = 5500;

            return new int[]{money / cup, money % cup};
    }
}