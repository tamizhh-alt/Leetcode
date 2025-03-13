class Solution {  
    public boolean detectCapitalUse(String word) {  
        if (word.length() == 0) {  
            return false;  
        }  

        // Check if all characters are uppercase  
        boolean allUpper = word.equals(word.toUpperCase());  
        // Check if all characters are lowercase  
        boolean allLower = word.equals(word.toLowerCase());  
        // Check if the first letter is uppercase and the rest are lowercase  
        boolean firstUpperRestLower = Character.isUpperCase(word.charAt(0)) && word.substring(1).equals(word.substring(1).toLowerCase());  

        return allUpper || allLower || firstUpperRestLower;  
    }  
}  