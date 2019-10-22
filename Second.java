package PackOne;
import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = new int[n];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < n; i++)
        {
            arr[i] = in.nextInt();
            System.out.print(arr[i]);
        }
    }
}
