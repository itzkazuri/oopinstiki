/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Kadek Juli
 */
public class Binatang {
    protected String nama;

    public Binatang() {
        this.nama = "";
    }

    public Binatang(String nama) {
        this.nama = nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public String bersuara() {
        return "Binatang bersuara.";
    }
}
