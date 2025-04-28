package modul5;

import javax.swing.JOptionPane;

public class Modul5 {
    public static void main(String[] args) {
        StringBuilder output = new StringBuilder();
        
        while (true) {
            // Input using JOptionPane
            String nim = JOptionPane.showInputDialog(null, "Masukkan NIM:");
            if (nim == null) break; // Cancel pressed
            
            String nama = JOptionPane.showInputDialog(null, "Masukkan Nama:");
            if (nama == null) break;
            
            String nilaiStr = JOptionPane.showInputDialog(null, "Masukkan Nilai Akhir:");
            if (nilaiStr == null) break;
            
            String tahunStr = JOptionPane.showInputDialog(null, "Masukkan Tahun Masuk:");
            if (tahunStr == null) break;

            try {
                // Create Mahasiswa object
                Mahasiswa mhs = new Mahasiswa();
                mhs.setNim(nim);
                mhs.setNama_mahasiswa(nama);
                mhs.setNilai_akhir(Integer.parseInt(nilaiStr));
                mhs.setTahunMasuk(Integer.parseInt(tahunStr));

                // Append to output
                output.append("NIM: ").append(mhs.getNim()).append("\n")
                      .append("Nama: ").append(mhs.getNama_mahasiswa()).append("\n")
                      .append("Nilai: ").append(mhs.getNilai_akhir()).append("\n")
                      .append("Tahun Masuk: ").append(mhs.getTahunMasuk()).append("\n\n");

                // Ask to add more or finish
                int choice = JOptionPane.showConfirmDialog(null, 
                    "Data:\n" + output + "\nTambah data lagi?", 
                    "Konfirmasi", 
                    JOptionPane.YES_NO_OPTION);
                
                if (choice == JOptionPane.NO_OPTION) {
                    JOptionPane.showMessageDialog(null, "Data akhir:\n" + output);
                    break;
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, 
                    "Masukkan angka yang valid untuk Nilai dan Tahun!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}