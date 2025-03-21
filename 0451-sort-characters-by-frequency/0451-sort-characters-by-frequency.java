// class Solution {
//     public String frequencySort(String s) {
//         if( s == null || s.length() == 0 ) return "";

//         int count = 0;
//         StringBuilder sb = new StringBuilder();
//         for(int i=0; i<s.length()-1; i++) {
//             if(s.charAt(i) == s.charAt(i+1)) {
//                 count++;
                
//                     sb.append(String.valueOf(s.charAt(i)).repeat(count));
                
//             } 
//         }
//         if(sb.length()==0) {
//             sb.append(s.charAt(0));
//         }
//         for(int i=0; i<s.length()-1; i++){
//             if(s.charAt(i) != sb.charAt(0)) {
//                 sb.append(s.charAt(i));
//             }
//         }
//         return sb.toString();

//    }
// }


class Solution {
    public String frequencySort(String s) {
        // Count the frequency of each character.
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        
        // Create a list of characters and sort it based on frequency in descending order.
        List<Character> chars = new ArrayList<>(freq.keySet());
        Collections.sort(chars, (a, b) -> freq.get(b) - freq.get(a));
        
        // Build the output string based on the sorted order.
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            int count = freq.get(c);
            for (int i = 0; i < count; i++) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
