class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String character : strs){
            char[] letters = character.toCharArray();
            Arrays.sort(letters);

            String key = new String(letters);

            if (!map.containsKey(key)){
                map.put(key, new ArrayList<>());


            }

            map.get(key).add(character);
        }

        return new ArrayList<>(map.values());
        
    }
}
