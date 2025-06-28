public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            // Convert string to char array, sort it, and use as key
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            // Add the string to the corresponding list in the map
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }
        // Return all the grouped anagram lists
        return new ArrayList<>(map.values());
    }
}
