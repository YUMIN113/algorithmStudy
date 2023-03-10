import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int gcd = gcd(a, b);
        int lcm = (a * b) / gcd;

        System.out.println(gcd);
        System.out.println(lcm);
    }

    private static int gcd(int a, int b) {

        while (b != 0) {

            int remainder = a % b;
            a = b;
            b = remainder;

        }
        return a;
    }
}

// Recursion Function

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.util.StringTokenizer;

// public class Main {
//     public static void main(String[] args) throws IOException {

//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         StringTokenizer st = new StringTokenizer(br.readLine(), " ");

//         int a = Integer.parseInt(st.nextToken());
//         int b = Integer.parseInt(st.nextToken());

//         int gcd = gcd(a, b);
//         int lcm = (a * b) / gcd;

//         System.out.println(gcd);
//         System.out.println(lcm);
//     }

//     // recursion function
//     private static int gcd(int a, int b) {

//         if (b == 0) {
//             return a;
//         }
//        return gcd(b, a % b);
//     }
// }
