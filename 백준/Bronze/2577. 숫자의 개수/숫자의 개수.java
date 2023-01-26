import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int multiplyResult = 1;

    for(int i = 0; i < 3; i++) {
      int num = Integer.parseInt(br.readLine());
      multiplyResult *= num;
    }

    String str = String.valueOf(multiplyResult);

    int[] arr = new int[10];
    for(int i = 0; i < 10; i++) {
      for(int j = 0; j < str.length(); j++) {
        if(i == str.charAt(j) - 48) {
          arr[i] ++;
        } 
      }
    }

    for(int result : arr) {
      System.out.println(result);
    }
  }
}

// 다른 방법

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;

// public class Main {

//   public static void main(String[] args) throws IOException {

//     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//     int multiplyResult = 1;

//     for(int i = 0; i < 3; i++) {
//       int num = Integer.parseInt(br.readLine());
//       multiplyResult *= num;
//     }

//     int[] arr = new int[10];

//     while(multiplyResult != 0) {

//       arr[multiplyResult % 10] ++; 
//       multiplyResult /= 10;
      
//     }

//     for(int result : arr) {
//       System.out.println(result);
      
//     }
//   }
// }
