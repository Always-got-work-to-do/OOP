package PackOne;
import java.lang.Math;

public class Fourth {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = new int[n];
        int brr;
        int a = 0;
        int b = 100;
        for (int i = 0; i < n; i++)
        {
            arr[i] = (int)(( Math.random() * (b - a + 1) + a));
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    brr = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = brr;
                }
            }
        }
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
