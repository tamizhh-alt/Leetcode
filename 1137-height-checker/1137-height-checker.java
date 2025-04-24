class Solution {
    public int heightChecker(int[] heights) {
        int n = heights.length;
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = heights[i];
        }

        Arrays.sort(arr);
        int count = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; i<arr.length; j++) {
                if(arr[i] != heights[i]) count++;
                break;
            }
        }
        return count;
    }
}