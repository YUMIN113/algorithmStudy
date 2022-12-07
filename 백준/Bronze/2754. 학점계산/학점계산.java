import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String score = br.readLine();

    double result = 69 - score.charAt(0);

    if(score.equals("F")) {
      System.out.print(0.0);
      return;
    }

    if(score.charAt(1) == '+') {
      result += 0.3;
    }

    if(score.charAt(1) == '-') {
      result -= 0.3;
    }

    System.out.print(result);
  }
}

// String equals() : returns a boolean value. whether they contain the same data.

