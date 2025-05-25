/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utsv2;

/**
 *
 * @author Kadek Juli
 */


import java.util.Scanner;

public class Anjing extends Binatang {
    private String ras;

    public Anjing() {
        super();
        this.ras = "";
    }

    public Anjing(String nama, String ras) {
        super(nama);
        this.ras = ras;
    }

    public void setRas(String ras) {
        this.ras = ras;
    }

    public String getRas() {
        return ras;
    }

    @Override
    public String bersuara() {
        return "menggonggong";
    }

    // Method untuk input data anjing
    public void inputData(Scanner sc) {
        System.out.print("Masukkan nama anjing: ");
        super.setNama(sc.next());

        System.out.print("Masukkan ras anjing: ");
        this.ras = sc.next();
    }
}
