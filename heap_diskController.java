import java.util.PriorityQueue;
import java.util.*;
class DiskController {

    public int solution(int[][] jobs) {
        int answer = 0;
        Arrays.sort(jobs, new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });



        PriorityQueue<Job> pq = new PriorityQueue<>();
        int accumulation = 0;
        int jobIndex = 0;
        int count = 0;
        int avarage = 0;
        while(count < jobs.length){
            while(jobIndex < jobs.length && jobs[jobIndex][0] <= accumulation){
                Job job = new Job(jobs[jobIndex][0], jobs[jobIndex++][1]);
                pq.add(job);
            }
            if(pq.isEmpty()){
                accumulation = jobs[jobIndex][0];
            }else{
                Job curJob = pq.poll();
                if(accumulation == 0) {
                    avarage += curJob.mTime;
                }else{
                    avarage +=  accumulation + curJob.mTime - curJob.mStart;
                }
                accumulation += curJob.mTime;
                count++;
            }

        }
        answer = avarage / jobs.length;
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
