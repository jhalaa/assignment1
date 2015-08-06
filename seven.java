import java.util.Scanner;

/**
 * Created by jhalaac on 06/08/15.
 */
public class seven {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        String z=s.next();
        int k = a - 1;
        int p=a-2;
        for (int i = 0; i <a-1; i++) {
            for (int l = 0; l <k; l++) {
                System.out.print(" ");
            }
            for(int j=0;j<=2*i;j++)
                System.out.print("*");
            for (int l = 0; l < k; l++) {
                System.out.print(" ");
            }

            k = k - 1;

            System.out.println();
        }
        System.out.println(z);
        for(int l=0;l<a;l++)
        {
            for(int r=0;r<=l;r++ )
                System.out.print(" ");
            for(int j=0;j<=2*p;j++)
                System.out.print("*");
            for(int r=0;r<=l;r++ )
                System.out.print(" ");
            p=p-1;
            System.out.println();
        }

    }

}
