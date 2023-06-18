import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        int value = Integer.parseInt(input);
        int valueLen = input.length();
        int answer = 0;

        for(int i = (value - (valueLen * 9)); i < value; i++) {
            int quotient = i;
            int sum = 0;

            while(quotient != 0) {
                sum += quotient % 10;
                quotient /= 10;
            }
            if(i + sum == value) {
                answer = i;
                break;
            }
        }
        System.out.println(answer);
    }
}