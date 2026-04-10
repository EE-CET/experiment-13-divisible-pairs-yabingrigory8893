import java.util.Scanner;

public class DivisiblePairs {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNextInt()) return;
            int n = sc.nextInt();
            if (!sc.hasNextInt()) return;
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                if (sc.hasNextInt()) {
                    arr[i] = sc.nextInt();
                }
            }
            
            int count = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if ((arr[i] + arr[j]) % k == 0) {
                        count++;
                    }
                }
            }
            
            System.out.println(count);
        }
    }
}

