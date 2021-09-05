import java.util.*;

class Scoville {
    public int solution(int[] scoville, int K) {
        if(K == 0) return 0;
        int answer = 0;
        Arrays.sort(scoville);
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for(long sco : scoville){
            pq.add(sco);
        }
        
        long min1 = 0;
        long min2 = 0;
        while(pq.peek() < K && pq.size() > 1){
            min1 = pq.poll();
            min2 = pq.poll();
            if(min1 == 0 && min2 == 0) return -1;
            long target = min1 + (min2*2);
            pq.add(target);
            answer++;
        }
        return pq.peek() < K ? -1 : answer;
    }


    private void printQ(PriorityQueue<Long> queue){
        System.out.println("========");
        Iterator<Long> it = queue.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}