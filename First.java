package PackOne;
import java.util.Scanner;

public class First
{
    public static void main(String[] args) {
        int sum = 0;
        int n = 5;
        int i;
        int[] arr = new int[n];
        Scanner in = new Scanner(System.in);
        for (i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            sum = sum + arr[i];
        }
        System.out.println("for cycle: " + sum);

        sum = 0;
        i = 0;
        while (i < n)
        {
            arr[i] = in.nextInt();
            sum = sum + arr[i];
            i = i + 1;
        }
        System.out.println("while cycle: " + sum);

        sum = 0;
        i = 0;
        do {
            arr[i] = in.nextInt();
            sum = sum + arr[i];
            i = i + 1;
        } while (i < n);
        System.out.println("do while cycle: " + sum);
    }
}
