/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utsv1;



import java.util.Scanner;

public class MPV extends Mobil {
   private int jumlahPenumpang;
   
   public MPV() {
    super();
    this.jumlahPenumpang = 0;
}
   public MPV(boolean mesinBeroperasi, int jumlahPenumpang){
       super(mesinBeroperasi);
       this.jumlahPenumpang = jumlahPenumpang;
   }
   
   public void setJumlahPenumpang(int jumlahPenumpang){
       this.jumlahPenumpang = jumlahPenumpang;
   }
   
   public int getJumlahPenumpang(){
       return jumlahPenumpang;
   }
   
   public void inputJumlahPenumpang(Scanner sc){
       System.out.print("masukan jumlah penumpang: ");
       this.jumlahPenumpang = sc.nextInt();
   }
   
   public void inputStatusMesin(Scanner sc){
       System.out.print("apakah mesin menyala true/false ");
       this.mesinBeroperasi = sc.nextBoolean();
   }
}


