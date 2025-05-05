package pertemuan7;

public class Peminjaman {
    private Anggota anggota;
    private Buku buku;
    private String tanggalPinjam;
    private String tanggalKembali;

    public Peminjaman(Anggota anggota, Buku buku, String tanggalPinjam, String tanggalKembali) {
        this.anggota = anggota;
        this.buku = buku;
        this.tanggalPinjam = tanggalPinjam;
        this.tanggalKembali = tanggalKembali;
        buku.setTersedia(false);
    }

    public void tampilkanDetailPeminjaman() {
        System.out.println("Data Peminjaman:");
        System.out.println("Nama Anggota: " + anggota.getNama());
        System.out.println("Judul Buku: " + buku.getJudul());
        System.out.println("Tanggal Pinjam: " + tanggalPinjam);
        System.out.println("Tanggal Kembali: " + tanggalKembali);
    }

    public void kembalikanBuku() {
        buku.setTersedia(true);
        System.out.println("Buku " + buku.getJudul() + " telah dikembalikan.");
    }
}
