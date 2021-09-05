
class Run{
    public static void main(String[] args) {
        Run run = new Run();
        run.diskController();
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
