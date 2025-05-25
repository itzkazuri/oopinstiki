/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utsv2;

/**
 *
 * @author Kadek Juli
 */
public abstract class Binatang {
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
        return nama;
    }

    public abstract String bersuara();
}