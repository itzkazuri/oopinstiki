/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan5;
import java.util.Scanner; 

        


public class looping {
    
    public static void main(String[] args){
        Scanner datain = new Scanner (System.in);
        System.out.println("masukan Jumlah Angka yang dicari rata rata");
        int putaran = Integer.parseInt(datain.nextLine());
        double total = 0;
        //buat array yang panjang nya sejumlah putaran
 
        for(int i = 0; i <= putaran; i ++){
            System.out.println("Masukan Putara ke: "+ i);
            total = total + Double.parseDouble(datain.next());
        }
        double rata2 = total / putaran;
        System.out.println("Rata-ratanya: "+ rata2 );
        
        for(int i = 10; i > 0; i--){
            System.out.println(i + "-");
        }
    }
}
