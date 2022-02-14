import java.util.*;

class Carpet {


    public int[] solution(int brown, int yellow) {
        int[] answer = {};
        int max = brown + yellow;

        ArrayList<Integer> list = getDivisor(max);
        for (Integer integer : list) {
            System.out.println("value : " + integer);
        }
        for(int i = 0; i < list.size(); i += 2){
            int hor = list.get(i+1 >= list.size() ? list.size() - 1 : i + 1);
            int ver = list.get(i);
            if((hor - 2) * (ver - 2) == yellow){
                answer = new int[]{hor, ver};
            }
        }

        for(int i : answer){
            System.out.println("result value : " + i);
        }
        return answer;
    }

    ArrayList<Integer> getDivisor(int target){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(target); i++) {
            if(target % i == 0){
                list.add(i);
                if(target / i != i){
                    list.add(target / i);
                }
            }
        }

        return list;
    }
}