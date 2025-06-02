package latihan9;

/**
 *
 * @author Kadek Juli
 */
class Buku {
    private String buku;
    private String pengarang;
    private int tahunTerbit;

    public String getBuku() {
        return buku;
    }

    public void setBuku(String buku) {
        this.buku = buku;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public Buku(String buku, String pengarang, int tahunTerbit) {
        this.buku = buku;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }

    public Buku() {
        this.buku = "";
        this.pengarang = "";
        this.tahunTerbit = 0;
    }
}

public class Latihan9 {
    public static void main(String[] args) {
        Buku buku1 = new Buku();
        buku1.setBuku("Laskar Pelangi");
        buku1.setPengarang("Andrea Hirata");
        buku1.setTahunTerbit(2005);

        Buku buku2 = new Buku("Harry Potter 1", "J.K. Rowling", 2000);

        // Cetak data buku1
        System.out.println("Data Buku 1:");
        System.out.println("Judul: " + buku1.getBuku());
        System.out.println("Pengarang: " + buku1.getPengarang());
        System.out.println("Tahun Terbit: " + buku1.getTahunTerbit());

        // Cetak data buku2
        System.out.println("\nData Buku 2:");
        System.out.println("Judul: " + buku2.getBuku());
        System.out.println("Pengarang: " + buku2.getPengarang());
        System.out.println("Tahun Terbit: " + buku2.getTahunTerbit());
    }
}
