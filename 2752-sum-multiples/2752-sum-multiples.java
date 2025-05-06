class Solution {
    public int sumOfMultiples(int n) {
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = i+1;
        }
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(arr[i] % 3 == 0 || arr[i]%5==0 || arr[i]%7==0){
                list.add(arr[i]);
            }
        }
        int sum = 0;
        for(int i=0; i<list.size(); i++){
            sum += list.get(i);
        }
        return sum;
    }
}