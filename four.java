import java.util.Scanner;

/**
 * Created by jhalaac on 06/08/15.
 */
public class four {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}