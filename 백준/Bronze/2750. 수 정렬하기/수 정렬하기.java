import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int length = Integer.parseInt(br.readLine());
        
        boolean[] arr = new boolean[2001];

        // 정수 범위가 -1000 ~ 1000 이다.
        for (int i = 0; i < length; i++) {
            arr[Integer.parseInt(br.readLine()) + 1000] = true;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]) {
                sb.append(i - 1000);
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }
}

// Arrays.sort() 사용할 경우

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.util.Arrays;

// public class Main {
//     public static void main(String[] args) throws IOException {

//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         StringBuilder sb = new StringBuilder();

//         int length = Integer.parseInt(br.readLine());
//         int[] arr = new int[length];

//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = Integer.parseInt(br.readLine());
//         }

//         Arrays.sort(arr);

//         for (int val : arr) {
//             sb.append(val);
//             sb.append("\n");
//         }
//         System.out.println(sb);
//     }
// }
