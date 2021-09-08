import java.util.*;

class MaxNum {
    public String solution(int[] numbers) {
        String answer = "";
        Integer[] _numbers = Arrays.stream( numbers ).boxed().toArray( Integer[]::new );
        Arrays.sort(_numbers, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {    //- 첫번쨰가 작다   //+ 두번쨰가 크다
                int value = 0;
                int hundred1 = o1 / 100;
                int hundred2 = o2 / 100;
                int ten1 = (o1 / 10) % 10;
                int ten2 = (o2 / 10) % 10;
                int one1 = (o1 % 100) % 10;
                int one2 = (o2 % 100) % 10;
                int[] arr1 = {hundred1, ten1, one1};
                int[] arr2 = {hundred2, ten2, one2};
                ArrayList<Integer> al1 = new ArrayList<>();
                ArrayList<Integer> al2 = new ArrayList<>();
                for(int v : arr1){
                    if(al1.isEmpty() && v != 0){
                        al1.add(v);
                    }else if(!al1.isEmpty()){
                        al1.add(v);
                    }
                }
                for(int v : arr2){
                    if(al2.isEmpty() && v != 0){
                        al2.add(v);
                    }else if(!al2.isEmpty()){
                        al2.add(v);
                    }
                }
                int maxIndex = Math.min(al1.size(), al2.size());
                for(int i = 0; i < maxIndex; i++){
                    if(al1.get(i) > al2.get(i)){
                        value = -1;
                        break;
                    }else if(al1.get(i) < al2.get(i)){
                        value = 1;
                        break;
                    }else{
                        value = 0;
                    }
                }
                if(value == 0){
                    if(al1.size() != al2.size()){
                        if(al1.size() > al2.size()){
                            value = al1.get(al1.size() - 1) > al2.get(0) ? -1 : 1;
                        }else{
                            value = al2.get(al2.size() - 1) > al1.get(0) ? -1 : 1;
                        }
                    }   
                    
                }
           
                return value;
            }
        });
        for(int number : _numbers){
            answer += Integer.toString(number);
        }
        System.out.println(answer);
        return answer;
    }
}
     

                // if(hundred1 > hundred2){
                //     value = -1;
                // }else if(hundred1 < hundred2){
                //     value = 1;
                // }else{
                //     if(ten1 > ten2){
                //         value = -1;
                //     }else if(ten1 < ten2){
                //         value = 1;
                //     }else{
                //         if(one1 > one2){
                //             value = -1;
                //         }else if(one1 < one2){
                //             value = 1;
                //         }else{
                //             value = 0;
                //         }
                //     }
                // }