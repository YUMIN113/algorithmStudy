import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int n = Integer.parseInt(br.readLine());

    for(int i = 0; i < n; i++) {

      int score = 0;
      int sum = 0;

      String str = br.readLine();

      for(int j = 0; j < str.length(); j++) {
        
        char input  = str.charAt(j);

        if(input == 'O') {
          score++;
          sum += score;
        }

        if(input == 'X') {
          score = 0;
        }
      }
     sb.append(sum).append("\n");
    }
    System.out.print(sb);
  }
}

// 다른 방법

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;

// public class Main {

//   public static void main(String[] args) throws IOException {

//     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//     StringBuilder sb = new StringBuilder();

//     int n = Integer.parseInt(br.readLine());

//     for(int i = 0; i < n; i++) {

//       int score = 0;
//       int sum = 0;

//       for (byte input : br.readLine().getBytes()) {

//         if(input == 'O') {
//           score++;
//           sum += score;
//         } else {
//           score = 0;
//         }
//       }
//       sb.append(sum).append("\n");
//     }
//     System.out.print(sb);
//   }
// }
