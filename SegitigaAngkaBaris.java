/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package segitigaangkabaris;

/**
 *
 * @author AHMAD HARIS
 */
import java.util.Scanner;
public class SegitigaAngkaBaris {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.println("Program Segitiga Angka Dan Baris");
        System.out.print("Masukkan Angka = ");
        int angka = s.nextInt();
        for (int i = 0; i < angka; i++) {
            for (int j = 1; j <= i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println(" Baris " + i);
        }
    }
}
