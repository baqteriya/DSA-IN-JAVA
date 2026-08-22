import java.util.*;
public class GroupAnagram {
    public static void main(String[] args) {
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams(words);
        System.out.println(result);
    }
    public static List<List<String>> groupAnagrams(String[] words) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String word:words){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            map.put(key,new ArrayList<>());
        
        map.get(key).add(word);
    }
    return new ArrayList<>(map.values());
}
}
