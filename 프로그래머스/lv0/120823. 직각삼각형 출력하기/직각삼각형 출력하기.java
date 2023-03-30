import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        IntStream.rangeClosed(1, n).forEach(it -> {
            for(int i = 1; i <= it; i++) {
                System.out.print("*");
            }
            System.out.println();
        });
    }
}