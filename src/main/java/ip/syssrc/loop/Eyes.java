package ip.syssrc.loop;

import java.util.Scanner;

/**
 * Eyes
 *
 * Assignment 2.3
 *
 * @author H071211052 - Muhammad Arya Ramdani <mhmdaryaramdani@gmail.com>
 *
 */
public class Eyes {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i=0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        in.close();
    }
}