/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan5;

import java.util.Scanner;

public class loopingwhile {
       public static void main(String[] args) {
        Scanner datain = new Scanner(System.in);
        System.out.println("Masukkan jumlah angka yang ingin dihitung rata-ratanya:");
        int putaran = Integer.parseInt(datain.nextLine());

        double total = 0;
        int i = 1;

        while (i <= putaran) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            double angka = Double.parseDouble(datain.nextLine());
            total += angka;
            i++;
        }

        double rata2 = total / putaran;
        System.out.println("Rata-ratanya: " + rata2);

        datain.close();
    
       }
}
