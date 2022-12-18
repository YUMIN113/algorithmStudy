import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());


    for(int i = 0; i < n; i++) {

      int score = 0;
      int sum = 0;

      String str = br.readLine();

      for(int j = 0; j < str.length(); j++) {
        char input  = str.charAt(j);

        if(input == 'O') {
          score += 1;
          sum += score;
        }

        if(input == 'X') {
          score = 0;
        }
      }
      bw.write(sum + "\n");
    }
    bw.flush();
    bw.close();
  }
}
