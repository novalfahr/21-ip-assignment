package ip.syssrc.conditional;

/**
 * Cashier
 *
 * Assignment 1.1
 *
 * @author H071211051 - Febi Fiantika <febifian23@gmail.com>
 *
 */
import java.util.Scanner;
public class Cashier {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalBelanja = 0;
        int jumlahBayar = 0;
        int kembalian = 0;
        try {
            System.out.println("Total Belanja : ");
            totalBelanja = in.nextInt();
            System.out.println("Jumlah yang dibayarkan : ");
            jumlahBayar = in.nextInt();
            in.close();
        } catch (Exception e) {
            System.out.println("Maaf, pastikan inputan anda adalah angka");
            return;
        } 
        if (jumlahBayar > totalBelanja) {
            kembalian = jumlahBayar - totalBelanja;
            System.out.println("Total Kembalian : " + kembalian);
            System.out.println("Dengan rincian sebagai berikut : ");

        }
        if (kembalian >= 100000) {
            int pecahan = (kembalian / 100000);
            kembalian -= (100000 * pecahan);
            System.out.println(pecahan + " lembar uang Rp. 100.000");

        }
        if (kembalian >= 50000) {
            int pecahan = (kembalian / 50000);
            kembalian -= (50000 * pecahan);
            System.out.println(pecahan + " lembar uang Rp. 50.000");

        }
        if (kembalian >= 20000) {
            int pecahan = (kembalian / 20000);
            kembalian -= (20000 * pecahan);
            System.out.println(pecahan + " lembar uang Rp. 20.000");
            
        }
        if (kembalian >= 10000) {
            int pecahan = (kembalian / 10000);
            kembalian -= (10000 * pecahan);
            System.out.println(pecahan + " lembar uang Rp. 10.000");

        }
        if (kembalian >= 5000) {
            int pecahan = (kembalian / 5000);
            kembalian -= (5000 * pecahan);
            System.out.println(pecahan + " lembar uang Rp. 5.000");

        }   
        if (kembalian >= 2000) {
            int pecahan = (kembalian / 2000);
            kembalian -= (2000 * pecahan);
            System.out.println(pecahan + " lembar uang Rp. 2.000");

        }
        if (kembalian >= 1000) {
            int pecahan = (kembalian / 1000);
            kembalian -= (1000 * pecahan);
            System.out.println(pecahan + " lembar uang Rp. 1.000");

        }
        if (kembalian >= 500) {
            int pecahan = (kembalian / 500);
            kembalian -= (500 * pecahan);
            System.out.println(pecahan + " buah uang Rp. 500");

        }
        if (kembalian >= 200) {
            int pecahan = (kembalian / 200);
            kembalian -= (200 * pecahan);
            System.out.println(pecahan + " buah uang Rp. 200");

        }
        if (kembalian >= 100) {
            int pecahan = (kembalian / 100);
            kembalian -= (100 * pecahan);
            System.out.println(pecahan + " buah uang Rp. 100");

        }
    }
}
