package PackOne;
import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(fact(n));
    }
    public static int fact(int n)
    {
        int fact = 1;
        for (int i = 1; i <= n; i++)
            fact = i*fact;
        return fact;
    }
}
