// import java.util.*;

// class Bridge {
//     public int solution(int bridge_length, int weight, int[] truck_weights) {
//         int answer = 0;
//         Queue<Integer> q = new LinkedList<>();
        
//         int max = 0;
//         for(int w : truck_weights) {
            
//             while(true) {
//                 if(q.isEmpty()) {
//                     q.offer(w);
//                     max += w;
//                     answer++;
//                     break;
//                 } else if(q.size() == bridge_length) {
//                     max -= q.poll();
//                 } else {
//                     if( max + w > weight) {
//                         q.offer(0);
//                         answer++;
//                     } else {
//                         q.offer(w);
//                         max += w;
//                         answer++;
//                         break;
//                     }
//                 }
//             } 
//         }
//         return answer + bridge_length;
//     }
// }

import java.util.*;
class Bridge {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> truckQueue = new LinkedList<>();
        Queue<Integer> distanceQueue = new LinkedList<>();
        for(int w : truck_weights){
            if(isEnableAdd(w, weight, truckQueue)){
                if(truckQueue.isEmpty()){
                    distanceQueue.add(bridge_length);
                }else{
                    distanceQueue.add(1);
                }
                truckQueue.add(w);
            }else{
                int count = 0;
                while(true){
                    truckQueue.poll();
                    answer += distanceQueue.poll();
                    if(isEnableAdd(w, weight, truckQueue)){
                        if(count == 0){
                            distanceQueue.add(bridge_length);
                            truckQueue.add(w);
                        }else{
                            distanceQueue.add(count);
                            truckQueue.add(w);
                        }
                        break;
                    }else{
                        if(getTotalWeight(distanceQueue) >= 100){
                            count++;
                        }
                    }

                }
            }
        }

        while(!distanceQueue.isEmpty()){
            answer += distanceQueue.poll();
        }
        answer++;

        // answer++;   //last
        System.out.println("value : " + answer);
        return answer;
    }

    private boolean isEnableAdd(int truck_weight, int weight, Queue<Integer> queue){
        return (getTotalWeight(queue) + truck_weight <= weight);
    }

    private int getTotalWeight(Queue<Integer> queue){
        Iterator<Integer> it = queue.iterator();
        int totalWeight = 0;
        while(it.hasNext()){
            totalWeight += it.next();
        }

        return totalWeight;
    }
}