import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    StringBuilder sb1 = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();

    int reverse1 = 0;
    int reverse2 = 0;

    st = new StringTokenizer(br.readLine(), " ");

    String num1 = st.nextToken();
    String num2 = st.nextToken();

    for(int i = 2; i >= 0; i--) {
      reverse1 = Integer.parseInt(sb1.append(num1.charAt(i)).toString());
      reverse2 = Integer.parseInt(sb2.append(num2.charAt(i)).toString());
    }

    System.out.print(Math.max(reverse1, reverse2));

  }
}

// 다른 방법

// StringBuilder 에 reverse() 메서드 포함되어 있다.
// StringBuilder 타입을 String 으로 변환하기 위해 toString() 사용

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.util.StringTokenizer;

// public class Main {

//   public static void main(String[] args) throws IOException {

//     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
//     StringTokenizer st = new StringTokenizer(br.readLine(), " ");

//     int reverse1 = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
//     int reverse2 = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());

//     System.out.print(reverse1 > reverse2 ? reverse1 : reverse2);

//   }
// }
