
package Pertemuan3;
 
import javax.swing.JOptionPane;


public class percobaan2 {
   public static void main(String[] args) {
        String nama = JOptionPane.showInputDialog(null, "Masukkan Nama Anda:", "Input Nama", JOptionPane.PLAIN_MESSAGE);

        // Menampilkan dialog untuk memasukkan NIM
        String nim = JOptionPane.showInputDialog(null, "Masukkan NIM Anda:", "Input NIM", JOptionPane.PLAIN_MESSAGE);

        // Validasi jika user menekan "Cancel" atau tidak mengisi apa pun
            // Menampilkan hasil dalam JOptionPane
            String pesan = "Nama Anda: " + nama + "\nNIM Anda: " + nim;
            JOptionPane.showMessageDialog(null, pesan, "Data Mahasiswa", JOptionPane.INFORMATION_MESSAGE);
    }
}

