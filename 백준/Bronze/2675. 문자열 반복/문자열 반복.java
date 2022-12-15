import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();

    int t = Integer.parseInt(br.readLine());

    for(int i = 0; i < t; i++) {
      st = new StringTokenizer(br.readLine(), " ");
      int r = Integer.parseInt(st.nextToken());
      String s = st.nextToken();

      for(int j = 0; j < s.length(); j++) {
        for(int k = 0; k < r; k++) {
          sb.append(s.charAt(j));
        }
      }
      sb.append("\n");
    }
    System.out.print(sb);
  }
}


// 다른 방법
// StringTokenizer 대신 split() 사용
// charAt() 대신 getBytes() 사용

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;

// public class Main {

//   public static void main(String[] args) throws IOException {

//     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//     StringBuilder sb = new StringBuilder();

//     int t = Integer.parseInt(br.readLine());

//     for(int i = 0; i < t; i++) {

//       String[] str = br.readLine().split(" ");

//       int r = Integer.parseInt(str[0]);

//       for(byte val : str[1].getBytes()) {
//         for(int j = 0; j < r; j++) {
//           sb.append((char) val);
//         }
//       }
//       sb.append("\n");
//     }
//     System.out.print(sb);
//   }
// }
