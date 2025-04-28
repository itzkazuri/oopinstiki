package pertemuan.pkg3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Pertemuan3 {
    public static void main(String[] args) { 
        BufferedReader datain = new BufferedReader(new InputStreamReader(System.in));
        String nama = "";
        String nim = "";

        try { //BufferedReader harus pakai Try catch IOException
            // Meminta input nama
            System.out.print("Silahkan masukkan Nama Anda: ");
            nama = datain.readLine();

            // Meminta input NIM
            System.out.print("Silahkan masukkan NIM Anda: ");
            nim = datain.readLine();
        } catch (IOException e) { //Bila Terjadi IOException, print error nya
            System.out.println("Terjadi kesalahan input: " + e.getMessage());
        }

        // Menampilkan output dengan format yang benar
        System.out.println("\n=== Data Mahasiswa ===");
        System.out.println("Nama Anda adalah: " + nama);
        System.out.println("NIM Anda adalah: " + nim);
    }
}
