import java.util.HashMap;
public class Anagram {
    public static void main(String[] args) {
        String str1="aab";
        String str2="aba";
        System.out.println(isAnagram(str1,str2));
    }
    public static boolean isAnagram(String str1,String str2){
        if(str1.length() !=str2.length()){
            return false;
        }
        HashMap<Character,Integer>map=new HashMap<>();
        for(char c:str1.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c:str2.toCharArray()){
            if(!map.containsKey(c)){
                return false;
            }
            map.put(c,map.get(c)-1);
            if(map.get(c)==0){
                map.remove(c);
            }
        }
        return map.isEmpty();
    }
}
