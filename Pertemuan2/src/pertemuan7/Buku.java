package pertemuan7;

public class Buku {
    private String judul;
    private String penulis;
    private String isbn;
    private boolean tersedia;

    public Buku(String judul, String penulis, String isbn) {
        this.judul = judul;
        this.penulis = penulis;
        this.isbn = isbn;
        this.tersedia = true;
    }

    public void tampilkanInfo() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("ISBN: " + isbn);
        System.out.println("Status: " + (tersedia ? "Tersedia" : "Dipinjam"));
    }

    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }

    public String getJudul() {
        return judul;
    }

    public boolean isTersedia() {
        return tersedia;
    }
}
