package pertemuan7;

public class Anggota {
    private String id;
    private String nama;
    private String alamat;

    public Anggota(String id, String nama, String alamat) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
    }

    public void tampilkanInfo() {
        System.out.println("ID Anggota: " + id);
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
    }

    public String getNama() {
        return nama;
    }
}
