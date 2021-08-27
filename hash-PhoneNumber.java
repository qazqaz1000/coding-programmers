import java.util.*;
class PhoneNumber {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);

        for(int index = 0; index < phone_book.length - 1; index++){
            String target = phone_book[index];
            String target2 = phone_book[index+1];
            if(target.length() >= target2.length()) continue;
            if(target2.indexOf(target, 0) == 0){
                answer = false;
                break;
            }

            if(!answer) break;
        }

        return answer;
    }
}