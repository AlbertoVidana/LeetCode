class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        List<Integer> list = new ArrayList<>();
        int ans[] = new int[A.length];
        int coun = 0;
        for (int i = 0; i < A.length; i++) {
            if (list.contains(A[i])) {
                coun++;
            } else {
                list.add(A[i]);
            }
            
            if (list.contains(B[i])) {
                coun++;
            } else {
                list.add(B[i]);
            }
            ans[i] = coun;
        }
        return ans;
    }
}