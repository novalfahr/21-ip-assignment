package ip.syssrc.loop;

/**
 * FactorialSequence
 *
 * Assignment 2.2
 *
 * @author H071211083 - Liska Dewi Rombe <rombeliska@gmail.com>
 *
 */
public class FactorialSequence {

    public static void main(String[] args) {
        long fact = 1;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
        int n = li.nextInt();
=======
        int n = lio.nextInt();
>>>>>>> d8ab39a (feat (loop/Eyes):add code2)
=======
        int n = li.nextInt();
>>>>>>> 520ea29 (feat (loop/FactorialSequence):add code2)
=======
        int n = li.nextInt();
>>>>>>> 911945ebeb7ab89f2288e27a05b66a102742839e

        if (n > 0) {
            System.out.print(n + "! = ");

            for (int i = n; i >= 2; i--) {
                System.out.print(i + " x ");
                fact = fact * i;
            }

            System.out.print("1 = " + fact);

        } else if (n == 0) {
            System.out.print(n + "! = ");

            System.out.println("1");
        } else {
            System.out.println("Error");
        }

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
        li.close();
=======
        lio.close();
>>>>>>> d8ab39a (feat (loop/Eyes):add code2)
=======
        li.close();
>>>>>>> 520ea29 (feat (loop/FactorialSequence):add code2)
=======
        li.close();
>>>>>>> 911945ebeb7ab89f2288e27a05b66a102742839e
    }

    }
