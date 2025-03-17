class Solution {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> L = new ArrayList<>();
        int arr[] = new int[1001];
        for(int i=0; i<nums.length; i++) {
            for(int j=0; j<nums[i].length; j++) {
                arr[nums[i][j]]++;
            }
        }
        for(int i=0; i<1001; i++) {
            if(arr[i]==nums.length) L.add(i);
        }

        return L;

        }
    }

        
