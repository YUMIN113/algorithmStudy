import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int cardCount = Integer.parseInt(br.readLine());
        String str = br.readLine();

        int[] ownCards = cards(cardCount, str);
        Map<Integer, Integer> ownCardsMap = new HashMap<>();

        for (int i = 0; i < ownCards.length; i++) {
            if(ownCardsMap.containsKey(ownCards[i])) {
                int temp = ownCardsMap.get(ownCards[i]) + 1;
                ownCardsMap.put(ownCards[i], temp);
                continue;
            }
            ownCardsMap.put(ownCards[i], 1);
        }

        cardCount = Integer.parseInt(br.readLine());
        str = br.readLine();
        int[] compareCards = cards(cardCount, str);

        for(int val : compareCards) {
            sb.append(ownCardsMap.getOrDefault(val, 0) + " ");
        }

        System.out.print(sb);

    }

    private static int[] cards(int cardCount, String str) {

        StringTokenizer st = new StringTokenizer(str, " ");

        int[] arr = new int[cardCount];
        for(int i = 0; i < cardCount; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        return arr;
    }
}