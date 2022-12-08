import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    String str = br.readLine();
    int result = 0;

    for(int i = 0; i < str.length(); i++) {
      int alphabet = str.charAt(i);

      if(alphabet >= 65) {
        result = alphabet + 32;
      }

      if(alphabet >= 97) {
        result = alphabet - 32;
      }

      sb.append(String.valueOf((char) result));

    }

    System.out.print(sb);

  }
}

// String str = "A"
// > int alphabet = 65
// > int result = 97
// > (char) result = 'a'
// > String.valueOf((char) result)) = "a"
