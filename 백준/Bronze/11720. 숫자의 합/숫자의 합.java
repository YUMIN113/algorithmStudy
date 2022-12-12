import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int sum = 0;

    int n = Integer.parseInt(br.readLine());
    String str = br.readLine();

    for(int i = 0; i < n; i++) {
      int num = str.charAt(i) - 48;
      sum += num;
    }
    System.out.print(sum);
  }
}

// int num = str.charAt(i) - 48;
//     sum += num;
// 위 두 코드는 
// int sum = str.charAt(i) - 48; 로 줄일 수 있음.
// int sum = str.charAt(i) - '0'; 도 동일 함.

// 다른 방법 (getBytes() 사용)
// public byte[] getBytes()
// String 문자열에 대하여 해당 문자열을 하나의 byte 배열로 변환해주는 메소드이다.
// UTF-16 인코딩으로 변경되지만 영어 문자 및 숫자는 아스키코드와 호환이 된다. 
// 즉, 아스키코드에서 '0' 문자가 48 값을 가지고 있는 것 처럼 UTF-16 에서도 '0'은 48 값과 동일하다.

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;

// public class A11654 {

//  public static void main(String[] args) throws IOException {

//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//    br.readLine(); // 숫자의 개수 N 은 쓸모가 없으므로 입력만 받는다. 문제의 입력 조건이 아니라면 해당 내용은 불필요 하다.

//     int sum = 0;

//     for(byte value : br.readLine().getBytes()) {
//       sum += (value - '0');
//     }
//     System.out.print(sum);
//   }
// }
