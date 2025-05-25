/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utsv1;

import java.util.Scanner;

public class Main {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       
       
       MPV mpv1 = new MPV();
       System.out.println("input data MPV1");
       mpv1.inputJumlahPenumpang(sc);
       mpv1.inputStatusMesin(sc);
       
       
       MPV mpv2 = new MPV();
       System.out.println("\nInput Data mpv2");
       mpv2.inputJumlahPenumpang(sc);
       mpv2.inputStatusMesin(sc);
       
       System.out.println("\n--- output mesin ------");
       System.out.println("jumlah penumpang " + mpv1.getJumlahPenumpang());
       System.out.println("Status operasional mesin " + mpv1.statusOperasionalmesin());
       System.out.println("jumlah penumpang " + mpv2.getJumlahPenumpang());
       System.out.println("jumlah penumpang  " + mpv2.statusOperasionalmesin());
       
       
   }
   
      
}
