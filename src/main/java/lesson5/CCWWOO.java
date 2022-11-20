package lesson5;

import java.util.HashMap;
import java.util.Map;

public class CCWWOO {
    public static void main(String[] args) {
        String[] words1 = {"b","bb","bbb"};
        String[] words2 = {"a","aa","aaa"};
        int end = countWords(words1, words2);
        System.out.println(end);
    }
// words1 = ["leetcode","is","amazing","as","is"], words2 = ["amazing","leetcode","is"]
// words1 = ["a","ab"], words2 = ["a","a","a","ab"]
    public static int countWords(String[] words1, String[] words2) {
        int result = 0;
        Map<String, Integer> map = new HashMap();
        for (String var1 : words1) {
            map.put(var1, map.getOrDefault(var1, 0) + 1);
        }
        for (String var2 : words2) {
            if (!map.containsKey(var2)) continue;
            int count = map.get(var2);
            if (count < 2) {
                map.put(var2, count - 1);
            }
        }
        for (String word : map.keySet()) {
            if (map.get(word) == 0) result++;
        }
        return result;
    }

}


