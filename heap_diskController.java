import java.util.PriorityQueue;
import java.util.*;
class DiskController {
    public int solution(int[][] jobs) {
        int answer = 0;
        PriorityQueue<Job> pq = new PriorityQueue<>();
        for(int i = 0; i < jobs.length ; i++){
            Job job = new Job(jobs[i][0], jobs[i][1]);
            pq.add(job);
        }
        int size = pq.size();
        int accumulation = 0;
        int avarage = 0;
        while(!pq.isEmpty()){
            Job curJob = pq.poll();
            if(accumulation == 0) {
                avarage += curJob.mTime;
            }else{
                avarage +=  accumulation + curJob.mTime - curJob.mStart;
            }
            accumulation += curJob.mTime;
        }
        answer = avarage / size;
        System.out.println(answer);
        return answer;
    }

    class Job implements Comparable<Job>{
        int mStart;
        int mTime;
        Job(int start, int time){
            mStart = start;
            mTime = time;
        }
        @Override
        public int compareTo(Job o) {
            return this.mTime - o.mTime;
        }
   
    }
}
