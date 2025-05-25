/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utsv1;

/**
 *
 * @author Kadek Juli
 */
public class Mobil {
    protected boolean  mesinBeroperasi;
    
    public Mobil(){
        this.mesinBeroperasi = false;
    }
    
    public Mobil(boolean mesinBeroperasi){
        this.mesinBeroperasi = mesinBeroperasi;
    }
    
    public boolean start(){
        mesinBeroperasi = true;
        return mesinBeroperasi;
    }
    
    public boolean stop(){
        mesinBeroperasi = true;
        return mesinBeroperasi;
    }
    
    public boolean statusOperasionalmesin(){
        return mesinBeroperasi;
    }
}
