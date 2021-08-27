import java.util.*;
class Spy {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> hm = new HashMap<String, Integer>();
        for(int i = 0 ; i < clothes.length; i++){
            hm.put(clothes[i][1], hm.getOrDefault(clothes[i][1], 0) + 1);
        }

        Set<String> keySet = hm.keySet();

        for(String key : keySet){
            answer *= hm.get(key) + 1;
        }

        return answer - 1;
    }
}