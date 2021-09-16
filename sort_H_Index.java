import java.util.Arrays;
import java.util.*;


class H_Index {
    public int solution(int[] citations) {
        int answer = 0;
        Integer _citations[] = Arrays.stream(citations).boxed().toArray(Integer[]::new); 
        Arrays.sort(_citations, Collections.reverseOrder());
        for(int i = 0 ; i < _citations.length; i++){
            if(_citations[i] <= i){
                answer = i;
                break;
            }
        }
        System.out.println("h index : " + answer);
        return answer;
    }
}
