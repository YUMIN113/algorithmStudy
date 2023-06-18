import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int value = Integer.parseInt(br.readLine());
        int answer = 1;
        
        for(int i = 0; i < value; i++) {
            int quotient = answer;
            int sum = 0;
            
            while(quotient != 0) {
                sum += quotient % 10;
                quotient /= 10;
            }
            if(answer + sum == value) {
                System.out.println(answer);
                return;
            }
            answer++;
        }
        System.out.println(0);
    }
}