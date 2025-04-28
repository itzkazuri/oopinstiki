package pertemuan4;
import javax.swing.JOptionPane;

public class Percobaan3 {
    public static void main(String[] args) {
        // Input tahun dari user
        String input = JOptionPane.showInputDialog("Masukkan tahun (1900-2020): ");
        int tahun = Integer.parseInt(input);
        
        // Cek batasan tahun
        if (tahun < 1900) {
            JOptionPane.showMessageDialog(null, "Maaf, tahun input dibawah 1900");
        } else if (tahun > 2020) {
            JOptionPane.showMessageDialog(null, "Maaf, tahun input diatas 2020");
        } else {
            // Cek tahun kabisat
            if ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)) {
                JOptionPane.showMessageDialog(null, tahun + " adalah tahun kabisat");
            } else {
                JOptionPane.showMessageDialog(null, tahun + " bukan tahun kabisat");
            }
        }
    }
}