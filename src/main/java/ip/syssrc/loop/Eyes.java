package ip.syssrc.loop;

/**
 * Eyes
 *
 * Assignment 2.3
 *
 * @author H071211065 - Asehpryanto Rari Parinding <asehpryantorari@gmail.com>
 *
 */
import java.util.Scanner;
public class Eyes {

    public static void main(String[] args) {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
        Scanner bk = new Scanner(System.in);
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
        Scanner bk = new Scanner(System.in);
>>>>>>> 5688ecfe1275a8107dda06ede1a475727c3ca2c1
        int n = bk.nextInt();
        bk.close();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1; j++) {
<<<<<<< HEAD
=======
        Scanner in = new Scanner(System.in);
=======
        Scanner bk = new Scanner(System.in);
>>>>>>> a089113 (feat(loop/MatricesPad): add code)

        int n = bk.nextInt();
=======
        int bk = bk.nextInt();
>>>>>>> e32699d (feat(loop/Eyes): add code)
=======
        int n = bk.nextInt();
>>>>>>> 56c679a (feat(loop/Eyes): add code)
        bk.close();
<<<<<<< HEAD
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
>>>>>>> dc0ff31 (feat(loop): add assingment)
=======
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1; j++) {
>>>>>>> 2b50be3 (feat(loop/MatricesPad): add code)
=======
>>>>>>> 5688ecfe1275a8107dda06ede1a475727c3ca2c1
                if (i == j) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            if (i == n-1) {
                System.out.printf("1\n");
            } else {
                System.out.printf("0\n");
            }
        }
    }
}
<<<<<<< HEAD
<<<<<<< HEAD

>>>>>>> 9a9d39e (feat(loop): add assigment)
=======
>>>>>>> 39898f2 (feat(loop/Eyes): add code)
=======
>>>>>>> 5688ecfe1275a8107dda06ede1a475727c3ca2c1
