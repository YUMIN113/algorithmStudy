import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    int sum = 0;

    st = new StringTokenizer(br.readLine(), " ");

    for(int i = 0; i < 5; i++) {
      int num = Integer.parseInt(st.nextToken());
      sum += num * num;
    }
    int result = sum % 10;
    System.out.print(result);
  }
}

// 다른 방법
// Math.pow(base, exponent)
// base, exponent 모두 Double type
// 따라서 정수형으로 출력하려면 형변환 필요.

// package algorithm.step05;
//
// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.util.StringTokenizer;
//
// public class A2475 {
//
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//        double sum = 0;
//
//        st = new StringTokenizer(br.readLine(), " ");
//
//        for(int i = 0; i < 5; i++) {
//            double num = Double.parseDouble(st.nextToken());
//            sum += Math.pow(num, 2);
//        }
//        int result = (int) sum % 10;
//        System.out.print(result);
//    }
// }
