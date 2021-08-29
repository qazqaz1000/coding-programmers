import java.util.*;
class FunctionDevelop {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> answer = new ArrayList<>();
        ArrayList<Integer> queue = new ArrayList<>();
        for(int i = 0; i < progresses.length; i++){
            int countDay = (int)Math.ceil(((float)(100-progresses[i])) / speeds[i]);
            queue.add(countDay);
        }
        int standard = 0;
        int count = 0;
        
        for(int i = 0; i < queue.size() - 1; i++){
            if(standard == 0){
                standard = queue.get(i);
            }
            int current = queue.get(i);
            int next = queue.get(i+1);
            if(standard >= next){
                count++;
            }else{
                answer.add(++count);
                standard = 0;
                count = 0;
            }
        }
        answer.add(++count);

        return answer.stream().mapToInt(i->i).toArray();
    }
}