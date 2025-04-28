package modul5;

public class Mahasiswa {
    private String nim;
    private String nama_mahasiswa;
    private int nilai_akhir;
    private int tahunMasuk;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama_mahasiswa() {
        return nama_mahasiswa;
    }

    public void setNama_mahasiswa(String nama_mahasiswa) {
        this.nama_mahasiswa = nama_mahasiswa;
    }

    public int getNilai_akhir() {
        return nilai_akhir;
    }

    public void setNilai_akhir(int nilai_akhir) {
        this.nilai_akhir = nilai_akhir;
    }

    public int getTahunMasuk() {
        return tahunMasuk;
    }

    public void setTahunMasuk(int tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }
}
