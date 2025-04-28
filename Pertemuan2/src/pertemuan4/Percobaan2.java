package pertemuan4;

import javax.swing.JOptionPane;

public class Percobaan2 {
    
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Masukkan angka (1-7):");
        int hari = Integer.parseInt(input);

        String namaHari;

        switch (hari) {
            case 1:
                namaHari = "Minggu";
                break;
            case 2:
                namaHari = "Senin";
                break;
            case 3:
                namaHari = "Selasa";
                break;
            case 4:
                namaHari = "Rabu";
                break;
            case 5:
                namaHari = "Kamis";
                break;
            case 6:
                namaHari = "Jumat";
                break;
            case 7:
                namaHari = "Sabtu";
                break;
            default:
                namaHari = "Hari tidak valid! Harus 1 - 7.";
                break;
        }

        JOptionPane.showMessageDialog(null, "Hari ke-" + hari + " adalah: " + namaHari);
    }
}
