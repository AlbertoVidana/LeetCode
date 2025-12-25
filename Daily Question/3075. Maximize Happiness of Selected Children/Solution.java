import java.util.Arrays;
import java.util.Collections;

class Solution {

    public long maximumHappinessSum(int[] happiness, int k) {
        int[] happinessDesc = Arrays.stream(happiness).boxed()
                              .sorted(Collections.reverseOrder())
                              .mapToInt(Integer::intValue)
                              .toArray();
        long value = 0l;
        int count = 0;
        for (int i = 0; i < k; i++) {
            if ((happinessDesc[i] - count) < 0) return value;
            value += (long) happinessDesc[i] - count;
            count++;
        }
        return value;
    }
}