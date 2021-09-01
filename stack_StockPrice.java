import java.util.*;
class StockPrice {    
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Queue<Integer> priceQueue = new LinkedList<>();
        for(int price : prices){
            priceQueue.offer(price);
        }

        int index = 0;
        while(!priceQueue.isEmpty()){
            int target = priceQueue.poll();
            answer[index] = getTime(priceQueue, target);
            index++;
        }

        return answer;
    }

    private int getTime(Queue queue, int target){
        int count = 0;
        Iterator<Integer> it = queue.iterator();
        while(it.hasNext()){
            count++;
            int price = it.next();
            if(price < target){
                break;
            }
        }
        return count;
    }

}