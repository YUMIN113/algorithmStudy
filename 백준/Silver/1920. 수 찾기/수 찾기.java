import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int count = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine(), " ");

        arr = new int[count];
        for(int i = 0; i < count; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int searchCount = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine(), " ");

        while(st.hasMoreTokens()) {
            int key = Integer.parseInt(st.nextToken());
            int index = binarySearch(key);

            if (index > -1) {
                sb.append(1 + "\n");
                continue;
            }

            if (index == -1) {
                sb.append(0 + "\n");
            }
        }
        System.out.println(sb);
    }

    public static int binarySearch(int key) {
        int lo = 0;
        int hi = arr.length - 1;

        while (lo <= hi) {
            int mid = (lo + hi) >>> 1;
            if (key < arr[mid]) {
                hi = mid - 1;
            } else if (key > arr[mid]) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}