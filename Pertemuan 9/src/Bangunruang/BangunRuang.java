/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bangunruang;

import java.util.Scanner;

/**
 *
 * @author Kadek Juli
 */
public class BangunRuang {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan = 0;

        do {
            System.out.println("=== Program Hitung Volume ===");
            System.out.println("Pilih bangun ruang:");
            System.out.println("1. Kerucut");
            System.out.println("2. Persegi (Balok)");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan (1/2/3): ");
            pilihan = scanner.nextInt();

            if (pilihan == 1) {
                Kerucut kerucut = new Kerucut();
                System.out.print("Jari-jari alas (cm)? ");
                kerucut.setJariJari(scanner.nextDouble());
                System.out.print("Tinggi kerucut (cm)? ");
                kerucut.setTinggi(scanner.nextDouble());
                System.out.printf("Volume kerucut adalah %.2f cm³\n", kerucut.getVolume());

            } else if (pilihan == 2) {
                Persegi persegi = new Persegi();
                System.out.print("Panjang (cm)? ");
                persegi.setPanjang(scanner.nextDouble());
                System.out.print("Lebar (cm)? ");
                persegi.setLebar(scanner.nextDouble());
                System.out.print("Tinggi (cm)? ");
                persegi.setTinggi(scanner.nextDouble());
                System.out.printf("Volume persegi adalah %.2f cm³\n", persegi.getVolume());

            } else if (pilihan == 3) {
                System.out.println("Terima kasih! Program selesai.");
            } else {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }

            System.out.println(); // Baris kosong untuk estetika

        } while (pilihan != 3);

        scanner.close();
    }
}