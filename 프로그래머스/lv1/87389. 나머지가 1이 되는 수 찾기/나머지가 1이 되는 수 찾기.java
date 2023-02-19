class Solution {
    public int solution(int n) {
        int answer = 0;

        for(int i = 0; i < n ; i++ ) {
            ++answer;
            if(n % answer == 1) {
                return answer;
            }
        }
        return answer;
    }
}