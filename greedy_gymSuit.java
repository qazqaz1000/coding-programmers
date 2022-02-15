import java.util.*;

class GymSuit {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] totalMember = new int[n];
        Arrays.fill(totalMember, 1);
        for (int i : lost) {
            totalMember[i-1] -= 1;
        }
        for (int i : reserve) {
            totalMember[i-1] += 1;
        }
        if(totalMember[0] == 0){
            if(totalMember[1] == 2){
                totalMember[0]++;
                totalMember[1]--;
            }
        }
        for (int i = 1; i < totalMember.length - 1; i++) {
            
            if(totalMember[i] == 0){
                if(totalMember[i-1] == 2){
                    totalMember[i-1]--;
                    totalMember[i]++;
                }else if(totalMember[i+1] == 2){
                    totalMember[i]++;
                    totalMember[i+1]--;
                }
            }
        }
        if(totalMember[totalMember.length-1] == 0){
            if(totalMember[totalMember.length-2] == 2){
                totalMember[totalMember.length-1]++;
                totalMember[totalMember.length-2]--;
            }
        }
        for (int i : totalMember) {
            System.out.print("" + i + " ");    
            if(i > 0) answer++;
        }
        System.out.println("answer : " + answer);
        return answer;
    }
}