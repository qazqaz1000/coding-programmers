import java.util.*;

class PrimeNumnber {
    HashMap<String, Boolean> resultMap = new HashMap<>();

    public int solution(String numbers) {
        int maxLength = numbers.length();

        int[] src = new int[maxLength];
        int[] dst = new int[maxLength];
        boolean[] visited = new boolean[maxLength];

        for (int i = 0; i < maxLength; i++) {
            src[i] = numbers.charAt(i) - '0';
        }

        for (int i = 0; i < maxLength; i++) {
            per2(src, dst, visited, 0, numbers.length(), i+1);
        }


        int answer = 0;
        // boolean isPrime = isPrimeNumber(110);
        // System.out.println("prime : " + isPrime);
        return answer;
    }

    private boolean isPrimeNumber(int value){
        int i = 2;
        while(i < (value / 2)){
            if((value % i++) == 0){
                return false;
            }
        }
        return true;

    }

    void per2(int[] arr, int[] output, boolean[] visited, int depth, int n, int r) {
        if(depth == r) {
            print(output, r); //순열 출력을 위한 print 함수 
            String result = Arrays.toString(output);
            resultMap.keySet(Set<result>);
            return;
        }
    
        for(int i = 0; i < n; i++) {
            if(visited[i] != true) {
                visited[i] = true;
                output[depth] = arr[i];
                per2(arr, output, visited, depth + 1, n, r);    
                visited[i] = false;
            }
        }
    }

    void print(int[] arr, int r) {
		for(int i = 0; i < r; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}