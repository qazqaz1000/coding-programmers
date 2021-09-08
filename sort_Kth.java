import java.util.*;

class Kth {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int count = 0;
        for(int[] command : commands){
            int start = command[0] - 1;
            int end = command[1];
            int targetIndex = command[2] - 1;
            int[] dst = Arrays.copyOfRange(array, start, end);
            Arrays.sort(dst);
            answer[count++] = dst[targetIndex];
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}
