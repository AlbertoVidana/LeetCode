class Solution {
    public int[] minCosts(int[] cost) {
        int n = cost.length, temp = 0;
        int[] answer = new int[n];
        answer[0] = cost[0];
        for (int i = 1; i < cost.length; i++) {
            if (answer[i-1] >= cost[i]) {
                answer[i] = cost[i];
            } else {
                cost[i] = answer[i - 1];
                answer[i] = answer[i- 1];
            }
        }
        return answer;
    }
}