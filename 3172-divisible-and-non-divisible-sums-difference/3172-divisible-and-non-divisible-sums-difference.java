class Solution {
    public int differenceOfSums(int n, int m) {
        List<Integer> list = new ArrayList<>();
        int[] arr = new int[n];
        for (int i = 0; i <n; i++) {
            arr[i] = i + 1;
        }
        List<Integer> li = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % m == 0) {
                list.add(arr[i]);
            } else {
                li.add(arr[i]);
            }

        }
        int sum1 = 0;
        int sum2 = 0;
        for(int i=0; i<list.size(); i++) {
            sum1 += list.get(i);
        }
        for(int i=0; i<li.size(); i++) {
            sum2 += li.get(i);
        }
        return  (sum2-sum1);
    }
}