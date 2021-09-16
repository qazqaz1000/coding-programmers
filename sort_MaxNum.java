import java.util.*;

class MaxNum {
    public String solution(int[] numbers) {
        String answer = "";
        String[] _numbers = new String[numbers.length];
        int count = 0;
        for(int num : numbers){
            _numbers[count++] = String.valueOf(num);
        }
        
        Arrays.sort(_numbers, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {    //- 첫번쨰가 작다   //+ 두번쨰가 크다
                return (o2+o1).compareTo(o1+o2);
            }
        });

        if(_numbers[0].equals("0")){
            return "0";
        }

        for(String number : _numbers){
            answer += number;
        }
        System.out.println(answer);
        return answer;
    }
}
