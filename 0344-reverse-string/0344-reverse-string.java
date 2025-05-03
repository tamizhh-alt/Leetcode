class Solution {
    public void reverseString(char[] s) {
         int left = 0, right = s.length - 1;

        while (left < right) {
            // Swap elements at left and right
            char ch = s[left];
            s[left] = s[right];
            s[right] = ch;

            // Move pointers towards the center
            left++;
            right--;
        }
    }
}