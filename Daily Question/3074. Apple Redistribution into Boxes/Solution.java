class Solution {
    public int minimumBoxes(int[] apple, int[] cap) {
        int sum = Arrays.stream(apple).sum();

        int[] fq = new int[51];
        int high = 0, low = 51;
        for (int c : cap) {
            fq[c]++;
            high = Math.max(high, c);
            low = Math.min(low, c);
        }

        int res = 0;
        for (int i = high; i >= low && sum > 0; i--) {
            while (fq[i]-- > 0 && sum > 0) {
                sum -= i;
                res++;
            }
        }

        return res;
    }
}

// class Solution {
//     public int minimumBoxes(int[] apple, int[] capacity) {
//         Arrays.sort(capacity);
//         int coun = 0;
//         int total = 0;
//         for (int i : apple) {
//             total += i;
//         }
//         System.out.println("Total : " + total);
//         for (int i = 0; i < apple.length; i++) {
//             if (total >= apple[i]) {
//                 coun++;
//                 break;
//             }
//             total -= apple[i];
//             coun++;
//             if(total <= 0) return coun;
//         }
//         return coun;
//     }
// }