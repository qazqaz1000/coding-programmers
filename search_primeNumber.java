import java.util.*;

class PrimeNumnber {
    HashSet<String> resultSet = new HashSet<>();

    public int solution(String numbers) {
        resultSet.clear();
        int maxLength = numbers.length();

        int[] src = new int[maxLength];
        int[] dst = new int[maxLength];
        boolean[] visited = new boolean[maxLength];

        for (int i = 0; i < maxLength; i++) {
            src[i] = numbers.charAt(i) - '0';
        }

        for (int i = 0; i < maxLength; i++) {
            permutation(src, dst, visited, 0, numbers.length(), i+1);
        }

        int count = 0;
		Iterator<String> iterator = resultSet.iterator();
		while (iterator.hasNext()) {
			String str = iterator.next();
            int number = Integer.parseInt(str);
            boolean isPrime = isPrimeNumber(number);
            if(isPrime){
                count++;
			System.out.println(str);
            }

		}

        System.out.println("count : " + count);
        return count;
    }

    private boolean isPrimeNumber(int value){
        if(value < 2) return false;
        for(int i = 2; i < (int)Math.sqrt(value) + 1; i++){
            if(value % i == 0){
                return false;
            }
        }

        return true;
    }

    void permutation(int[] arr, int[] output, boolean[] visited, int depth, int n, int r) {
        if(depth == r) {
            // print(output, r); //순열 출력을 위한 print 함수 
            String value = "";
            for (int i = 0; i < r; i++) {
                if(!(value.isEmpty() && output[i] == 0)){
                        value += output[i];
                }
            }
            if(!value.isEmpty()){
                resultSet.add(value);
            }
            return;
        }
    
        for(int i = 0; i < n; i++) {
            if(visited[i] != true) {
                visited[i] = true;
                output[depth] = arr[i];
                permutation(arr, output, visited, depth + 1, n, r);    
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