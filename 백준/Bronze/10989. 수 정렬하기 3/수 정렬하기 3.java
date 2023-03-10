import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// counting sort
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int arrLength = Integer.parseInt(br.readLine());

        int[] arr = new int[10001];

        // index 는 입력 숫자, 값은 해당 숫자의 입력된 개수
        for (int i = 0; i < arrLength; i++) {
            arr[Integer.parseInt(br.readLine())]++;
        }

        // 숫자는 1부터 입력 가능하기 때문에 1부터 시작
        for (int i = 1; i < arr.length; i++) {

            // i를 중복 개수(arr[i]) 만큼 출력
            while (arr[i] > 0) {
                sb.append(i);
                sb.append("\n");

                arr[i]--;
            }
        }
        System.out.println(sb);
    }
}


// Arrays.sort() 사용한 방법

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.util.Arrays;


// public class Main {
//     public static void main(String[] args) throws IOException {

//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         StringBuilder sb = new StringBuilder();

//         int arrLength = Integer.parseInt(br.readLine());

//         int[] arr = new int[arrLength];

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
