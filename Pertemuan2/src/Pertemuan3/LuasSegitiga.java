
package Pertemuan3;

import javax.swing.JOptionPane;

public class LuasSegitiga {
    public static void main(String[] args) {
        // Meminta pengguna memasukkan alas dan tinggi segitiga melalui JOptionPane
        String alasStr = JOptionPane.showInputDialog(null, "Masukkan alas segitiga:", "Input Alas");
        String tinggiStr = JOptionPane.showInputDialog(null, "Masukkan tinggi segitiga:", "Input Tinggi");
        
        // Konversi input ke tipe data double
        double alas = Double.parseDouble(alasStr);
        double tinggi = Double.parseDouble(tinggiStr);
        
        // Menghitung luas segitiga
        double luas = 0.5 * alas * tinggi;
        
        // Menampilkan hasil perhitungan dalam JOptionPane
        String pesan = "Luas segitiga adalah: " + luas;
        JOptionPane.showMessageDialog(null, pesan, "Hasil Perhitungan", JOptionPane.INFORMATION_MESSAGE);
    }
}
