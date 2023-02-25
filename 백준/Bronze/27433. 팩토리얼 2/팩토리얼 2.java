import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Long num = Long.parseLong(br.readLine());

        br.close();

        System.out.println(factorialFunction(num));

    }

    public static Long factorialFunction(Long num) {

        return tailOptimization(num, 1L);

    }

    public static Long tailOptimization(Long num, Long acc) {

        if(num == 0) {
            return 1L;
        }
        if(num == 1) {
            return acc;
        }
        return tailOptimization(num - 1, num * acc);
    }
}