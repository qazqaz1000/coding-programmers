import java.util.*;
class BestAlbum {
    public Integer[] solution(String[] genres, int[] plays) {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        for(int i = 0 ; i < genres.length ; i++){
            hm.put(genres[i], hm.getOrDefault(genres[i], 0) + plays[i]);
        }
        List<String> keySetList = new ArrayList<>(hm.keySet());
        Collections.sort(keySetList, (o1, o2) -> (hm.get(o2).compareTo(hm.get(o1))));   //내림차순

        ArrayList<Integer> ar = new ArrayList<>();
        for(String key : keySetList){
            ar.addAll(Arrays.asList(getMaxLastTwo(key, genres, plays)));
        }

        return ar.toArray(new Integer[0]);
    }

    private Integer[] getMaxLastTwo(String key, String[] genres, int[] plays){
        ArrayList<Integer> value= new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i = 0; i < genres.length ; i++){
            if(key.equals(genres[i])){
                hm.put(i, plays[i]);
            }
        }

        List<Integer> keySetList = new ArrayList<>(hm.keySet());
        Collections.sort(keySetList, (o1, o2) -> (hm.get(o2).compareTo(hm.get(o1))));   //내림차순

        if(keySetList.size() > 1){
            int index0 = keySetList.get(0);
            int index1 = keySetList.get(1);
            if(plays[index0] == plays[index1]){
                if(index0 > index1){
                    int temp = index0;
                    index1 = index0;
                    index0 = temp;
                }
            }
            value.add(index0);
            value.add(index1);
        }else{
            value.add(keySetList.get(0));
        }
        


        return value.toArray(new Integer[0]);
    }
}