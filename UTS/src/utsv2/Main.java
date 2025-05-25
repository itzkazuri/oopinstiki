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

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Anjing a = new Anjing();
        System.out.println("Input Data Anjing:");
        a.inputData(sc);

        System.out.println("\n--- Output Sesuai Soal ---");
        System.out.println("Binatang BerSuara.");
        System.out.println("Nama Anjing: " + a.getNama());
        System.out.println("Ras Anjing: " + a.getRas());
        System.out.println("Anjing " + a.bersuara() + ".");
    }
}