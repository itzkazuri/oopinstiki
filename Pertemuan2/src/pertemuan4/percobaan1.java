/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4;

import javax.swing.JOptionPane;

public class percobaan1 {
    
    public static void main(String[] args) {
        String nilai = JOptionPane.showInputDialog("Masukkan Nilai:");
        int nilaiAngka = Integer.parseInt(nilai);

        if ((nilaiAngka >= 80) && (nilaiAngka <= 100)) {
            JOptionPane.showMessageDialog(null, "Predikat kamu adalah: A");
        } else if ((nilaiAngka >= 65) && (nilaiAngka < 80)) {
            JOptionPane.showMessageDialog(null, "Predikat kamu adalah: B");
        } else if ((nilaiAngka >= 55) && (nilaiAngka < 65)) {
            JOptionPane.showMessageDialog(null, "Predikat kamu adalah: C");
        } else if ((nilaiAngka >= 40) && (nilaiAngka < 55)) {
            JOptionPane.showMessageDialog(null, "Predikat kamu adalah: D");
        } else if ((nilaiAngka >= 0) && (nilaiAngka < 40)) {
            JOptionPane.showMessageDialog(null, "Predikat kamu adalah: E");
        } else {
            JOptionPane.showMessageDialog(null, "Nilai tidak valid! Harus antara 0 - 100.");
        }
        
        
    }
}
