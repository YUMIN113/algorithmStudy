import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine(), " ");
        
        int cardNum = Integer.parseInt(st.nextToken());
        int maxNum = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine(), " ");
        
        int[] arr = new int[cardNum];
        
        int i = 0;
        while(st.hasMoreTokens()) {
            arr[i] = Integer.parseInt(st.nextToken());
            i++;
        }
        
        int sum = 0;
        int answer = 0;
        
        for(int j = 0; j < arr.length - 2; j++) {
            for(int k = j + 1; k < arr.length - 1; k++) {
                for(int l = k + 1; l < arr.length; l++) {
                    sum = arr[j] + arr[k] + arr[l];
                    if(sum == maxNum) {
                        answer = sum;
                        break;
                    }
                    if(answer < sum && sum < maxNum) {
                        answer = sum;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}