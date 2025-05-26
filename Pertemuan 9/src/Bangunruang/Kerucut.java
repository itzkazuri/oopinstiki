/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bangunruang;

/**
 *
 * @author Kadek Juli
 */
public class Kerucut {
    private double jariJari;
    private double tinggi;

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getVolume() {
        return (1.0 / 3.0) * Math.PI * jariJari * jariJari * tinggi;
    }
}