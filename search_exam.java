import java.util.*;
class Exam {
    public int[] solution(int[] answers) {
        int[] supo1 = {1, 2 ,3 ,4 ,5};
        int[] supo2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] supo3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        Integer[] score = {0, 0, 0};

        for(int i = 0; i < answers.length; i++){
            if(supo1[(i % supo1.length)] == answers[i])
                score[0]++;
            if(supo2[(i % supo2.length)] == answers[i])
                score[1]++;
            if(supo3[(i % supo3.length)] == answers[i])
                score[2]++;
        }
        int max = Math.max(Math.max(score[0], score[1]), score[2]);
        ArrayList<Integer> ar = new ArrayList<>();
        for(int i = 0; i < 3; i++){
            if(max == score[i]){
                ar.add(i+1);
            }
        }
        int[] answer = ar.stream().mapToInt(i->i).toArray();
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}