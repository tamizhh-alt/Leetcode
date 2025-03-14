class Solution {  
    public int trap(int[] h) {  
        int size = h.length;  
        if (size == 0) return 0;  

        int left = 0, right = size - 1;  
        int leftMax = 0, rightMax = 0;  
        int totalWater = 0;  

        while (left < right) {  
            if (h[left] < h[right]) {  
                if (h[left] >= leftMax) {  
                    leftMax = h[left];  
                } else {  
                    totalWater += leftMax - h[left];  
                }  
                left++;  
            } else {  
                if (h[right] >= rightMax) {  
                    rightMax = h[right];  
                } else {  
                    totalWater += rightMax - h[right];  
                }  
                right--;  
            }  
        }  
        
        return totalWater;  
    }  
}  