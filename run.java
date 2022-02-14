
class Run{
    public static void main(String[] args) {
        Run run = new Run();
        run.primeNumber();
    }

    private void primeNumber(){
        PrimeNumnber prime = new PrimeNumnber();
        String numbers = "17";
        String numbers2 = "110";
        prime.solution(numbers);
        prime.solution(numbers2);
    }

    private void Exam(){
        Exam exam = new Exam();
        int[] answers = {1,2,3,4,5};
        int[] answers2 = {1,3,2,4,2};
        int[] answers3 = {4, 4, 4, 5,1, 2, 4, 5, 1, 2 , 3, 4, 5, 1, 2, 4, 5, 4, 2, 5};
        // exam.solution(answers);
        // exam.solution(answers2);
        exam.solution(answers3);
    }

    private void HIndex(){
        H_Index hindex = new H_Index();
        int[] citations = {3, 0, 6, 1, 5};
        hindex.solution(citations);
    }

    private void MaxNum(){
        MaxNum max = new MaxNum();
        int[] numbers = {6, 10, 2};
        int[] numbers2 = {3, 30, 34, 5, 9};
        int[] numbers3 = {123, 234, 7, 89, 901, 109};
        int[] numbers4 = {123, 0, 1000, 0, 999, 1000};
        // max.solution(numbers);
        // max.solution(numbers2);
        // max.solution(numbers3);
        max.solution(numbers4);
    }

    private void kth(){
        Kth kth = new Kth();
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        kth.solution(array, commands);
    }

    private void operations(){
        Operations oper = new Operations();
   
    
        String[] operations = {"I 16","D 1"};
        oper.solution(operations);
        String[] operations2 = {"I 7","I 5","I -5","D -1"};
        oper.solution(operations2);
        String[] operations3 = {"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"};
        oper.solution(operations3);
    }

    private void diskController(){
        DiskController dc = new DiskController();
        int[][] jobs = {{0, 3}, {1, 9}, {2, 6}, {3, 3}, {1, 2}, {6, 20}};
        dc.solution(jobs);
    }

    private void scoville(){
        Scoville scoville = new Scoville();
        int[] sco = {1, 2, 3, 9, 10, 12};
        int k = 7;
        scoville.solution(sco, k);
    }




    private void bridge1(){
        Bridge bridge = new Bridge();
        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7,4,5,6};
        bridge.solution(bridge_length, weight, truck_weights);
    }
    private void bridge2(){
        Bridge bridge = new Bridge();
        int bridge_length = 100;
        int weight = 100;
        int[] truck_weights = {10};
        bridge.solution(bridge_length, weight, truck_weights);
    }
    private void bridge3(){
        Bridge bridge = new Bridge();
        int bridge_length = 100;
        int weight = 100;
        int[] truck_weights = {10,10,10,10,10,10,10,10,10,10};
        bridge.solution(bridge_length, weight, truck_weights);
    }
    private void bridge4(){
        Bridge bridge = new Bridge();
        int bridge_length = 100;
        int weight = 100;
        // int[] truck_weights = {1000, 1000, 1000, 5000, 5000, 7000, 3000, 2000, 3000};
        int[] truck_weights = {70,10,10,10, 90,10, 10,10, 10,99};   //306
        // int[] truck_weights = {10,10,10,10,10,10,10,10,10,10};
        bridge.solution(bridge_length, weight, truck_weights);
    }
    
    private void bridge5(){
        Bridge bridge = new Bridge();
        int bridge_length = 100;
        int weight = 100;
        int[] truck_weights = {70, 20, 2, 2, 2, 2, 2, 90, 10, 99};   //306
        bridge.solution(bridge_length, weight, truck_weights);
    }

}
