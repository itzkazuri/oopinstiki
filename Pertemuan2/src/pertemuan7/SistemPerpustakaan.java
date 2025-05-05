package pertemuan7;

import java.util.Scanner;

public class SistemPerpustakaan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data buku
        System.out.println("=== INPUT DATA BUKU ===");
        System.out.print("Judul Buku: ");
        String judulBuku = scanner.nextLine();
        System.out.print("Penulis: ");
        String penulis = scanner.nextLine();
        System.out.print("ISBN: ");
        String isbn = scanner.nextLine();
        Buku buku = new Buku(judulBuku, penulis, isbn);

        // Input data anggota
        System.out.println("\n=== INPUT DATA ANGGOTA ===");
        System.out.print("ID Anggota: ");
        String id = scanner.nextLine();
        System.out.print("Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Alamat: ");
        String alamat = scanner.nextLine();
        Anggota anggota = new Anggota(id, nama, alamat);

        // Input data peminjaman
        System.out.println("\n=== INPUT DATA PEMINJAMAN ===");
        System.out.print("Tanggal Pinjam (YYYY-MM-DD): ");
        String tglPinjam = scanner.nextLine();
        System.out.print("Tanggal Kembali (YYYY-MM-DD): ");
        String tglKembali = scanner.nextLine();
        Peminjaman peminjaman = new Peminjaman(anggota, buku, tglPinjam, tglKembali);

        // Tampilkan semua informasi
        System.out.println("\n=== INFORMASI BUKU ===");
        buku.tampilkanInfo();

        System.out.println("\n=== INFORMASI ANGGOTA ===");
        anggota.tampilkanInfo();

        System.out.println("\n=== DETAIL PEMINJAMAN ===");
        peminjaman.tampilkanDetailPeminjaman();

        scanner.close();
    }
}
