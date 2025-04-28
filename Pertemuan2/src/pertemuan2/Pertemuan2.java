package pertemuan2;

import java.util.Scanner;

public class Pertemuan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input NIM
        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();

        // Input Nama Lengkap
        System.out.print("Masukkan Nama Lengkap: ");
        String namaLengkap = input.nextLine();

        // Output hasil
        System.out.println("\n=== Data Mahasiswa ===");
        System.out.println("NIM          : " + nim);
        System.out.println("Nama Lengkap : " + namaLengkap);

        input.close();
    }
}
