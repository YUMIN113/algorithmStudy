import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> bookMap = new HashMap<>();
        List<String> keyList;

        int bookCount = Integer.parseInt(br.readLine());

        for(int i = 0; i < bookCount; i++) {
            String bookTitle = br.readLine();
            int count = 0;

            if(!bookMap.containsKey(bookTitle)) {
                bookMap.put(bookTitle, 1);
                continue;
            }

            count = bookMap.get(bookTitle);
            count++;
            bookMap.put(bookTitle, count);

        }

        int max = Collections.max(bookMap.values());

        keyList = bookMap.entrySet().stream().filter(it -> it.getValue() == max).map(it -> it.getKey()).sorted().collect(Collectors.toList());
        String bestSellerBook = keyList.stream().findFirst().get();
        System.out.println(bestSellerBook);

    }
}