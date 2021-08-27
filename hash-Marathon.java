import java.util.Arrays;
class Marathon {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        int index = 0;
        for(String ss : completion ){
            String tt = participant[index];
            if(!ss.equalsIgnoreCase(tt)){
                answer = tt;
                break;
            }
            index++;
        }
        if(answer.isEmpty()){
            answer = participant[index];
        }
        return answer;
    }
}