import java.util.*;

//이중 우선순위 큐
class Operations {      
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        PriorityQueue<Integer> ascendingQueue = new  PriorityQueue<>();
        PriorityQueue<Integer> descendingQueue = new  PriorityQueue<>(new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        int count = 0;
        int remain = 0;
        while(count< operations.length){
            String[] array = operations[count].split(" ");
            if(array[0].equalsIgnoreCase("I")){
                ascendingQueue.add(Integer.parseInt(array[1]));
                descendingQueue.add(Integer.parseInt(array[1]));
                remain++;
            }else{
                if(array[1].equalsIgnoreCase("1")){
                    if(!descendingQueue.isEmpty()){
                        int max = descendingQueue.poll();
                        ascendingQueue.remove(max);
                        remain--;
                    }
                }else{
                    if(!ascendingQueue.isEmpty()){
                        int min = ascendingQueue.poll();
                        descendingQueue.remove(min);
                        remain--;
                    }
                }
            }

            count++;
        }
        if(remain > 0){
            answer[0] = descendingQueue.poll();
            answer[1] = ascendingQueue.poll();
        }else{
            answer[0] = 0;
            answer[1] = 0;
        }
        

        System.out.println(Arrays.toString(answer));
        return answer;
    }
}