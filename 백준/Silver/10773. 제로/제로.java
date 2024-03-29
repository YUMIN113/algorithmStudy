import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Integer> stack = new Stack<>();

        int count = Integer.parseInt(br.readLine());

        for(int i = 0; i < count; i++) {

            int num = Integer.parseInt(br.readLine());

            if (num == 0) {
                stack.pop();
                continue;
            }

            stack.push(num);

        }
        int sum = stack.stream().reduce(0, (x, y) -> x + y);
        System.out.println(sum);
    }
}