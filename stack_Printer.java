import java.util.*;
class Printer {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        int count = 0;
        Queue<Integer> queue = new LinkedList<>();
        for(Integer value : priorities){
            queue.add(value);
        }

        
        while(!queue.isEmpty()){
            boolean isSkip = false;
            int cur = queue.poll();
            Iterator<Integer> it = queue.iterator();
            while(it.hasNext()){
                int value = it.next();
                if(value > cur){
                    queue.add(cur);
                    isSkip = true;
                    if(count == location) location = queue.size();
                    break;
                }
            }
            if(!isSkip){
                answer++;
                if(count == location) break;
                
            }
            count++;
        }        
        return answer;
    }
}