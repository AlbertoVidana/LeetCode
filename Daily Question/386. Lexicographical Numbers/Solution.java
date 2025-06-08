class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> numbers = IntStream.rangeClosed(1, n)
                                           .boxed()
                                           .collect(Collectors.toList());
        numbers.sort((a, b) -> String.valueOf(a).compareTo(String.valueOf(b)));
        return numbers;
    }
}