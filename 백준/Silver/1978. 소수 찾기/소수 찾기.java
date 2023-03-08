import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int length = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int count = 0;

        int[] arr = new int[1001];
        for (int i = 0; i < length; i++) {
            int value = Integer.parseInt(st.nextToken());
            for (int j = 1; j <= value; j++) {
                if (value % j == 0) {
                    arr[value] ++;
                }
            }
        }
        for (int val : arr) {
            if (val == 2) {
                count ++;
            }
        }
        System.out.println(count);
    }
}

// 제곱근 사용한 다른 방법

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.util.StringTokenizer;

// public class Main {
//     public static void main(String[] args) throws IOException {

//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//         int length = Integer.parseInt(br.readLine());
//         StringTokenizer st = new StringTokenizer(br.readLine(), " ");

//         int count = 0;

//         while (st.hasMoreTokens()) {

//             boolean isPrime = true;

//             int num = Integer.parseInt(st.nextToken());

//             if (num == 1) {
//                 continue;
//             }

//             for (int i = 2; i <= Math.sqrt(num); i++) {
//                 if (num % i == 0) {
//                     isPrime = false;
//                     break;
//                 }
//             }

//             if (isPrime == true) {
//                 count ++;
//             }
//         }
//         System.out.println(count);
//     }
// }
