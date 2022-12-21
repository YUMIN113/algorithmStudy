import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int[] arr = new int[10];


    for(int i = 0; i < 10; i++) {
      arr[i] = Integer.parseInt(br.readLine()) % 42;
    }

    ArrayList<Integer> list = new ArrayList<>();

    for(int result : arr) {
      if(!list.contains(result)) {
        list.add(result);
      }
    }

    System.out.print(list.size());

  }
}

// 다른 방법

// HashSet
// 중복원소 허용하지 않는다.
// 순서 개념이 없다. 따라서 정렬이 필요하다면 리스트로 변경 후 가능하다.

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.util.HashSet;

// public class Main {

//   public static void main(String[] args) throws IOException {

//     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//     HashSet<Integer> hashSet = new HashSet<>();

//     for(int i = 0; i < 10; i++) {
//       hashSet.add(Integer.parseInt(br.readLine()) % 42);
//     }

//     System.out.print(hashSet.size());

//   }
// }
