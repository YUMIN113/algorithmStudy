import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");

    int max = -1000001;
    int min = 1000001;

    for(int i = 0; i < n; i++) {
      int num = Integer.parseInt(st.nextToken());

      if(num > max) {
        max = num;
      }

      if(num < min) {
        min = num;
      }
    }
    System.out.print(min + " " + max);
  }
}

// 다른 방법

// Arrays.sort() : 배열에 저장된 원소 값을 오름차순으로 정렬해주는 메소드이다.
// .hasMoreTokens() : StringTokenizer 에 토큰이 남아있다면 true, 비어있다면 false 를 반환한다.

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.util.Arrays;
// import java.util.StringTokenizer;

// public class Main {

//   public static void main(String[] args) throws IOException {

//     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//     int n = Integer.parseInt(br.readLine());
//     StringTokenizer st = new StringTokenizer(br.readLine(), " ");

//     int i = 0;
//     int[] arr = new int[n];

//     while(st.hasMoreTokens()) {
//       arr[i] = Integer.parseInt(st.nextToken());
//       i++;
//     }

//     Arrays.sort(arr);
//     System.out.print(arr[0] + " " + arr[n - 1]);

//   }
// }
