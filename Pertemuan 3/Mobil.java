/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspbo_3;

/**
 *
 * @author AKBAR
 */
public class Mobil {
    String merk;
    String model;
    int tahun;
    String warna;
    
    public Mobil(String merk, String model, int tahun, String warna) {
        this.merk = merk;
        this.model = model;
        this.tahun = tahun;
        this.warna = warna;
    }
    public String GetMerk(){
        return merk;
    }
    
    public void SetMerk(String merk){
        this.merk = merk;
    }
    
    public String GetModel(){
        return model;
    }
    
    public void SetModel(String model){
        this.model = model;
    }
    
    public int GetTahun(){
        return tahun;
    }
    
    public void SetTahun(int tahun){
        this.tahun = tahun;
    }
    
    public String GetWarna(){
        return warna;
    }
    
    public void SetWarna(String warna) {
        this.warna = warna;
    }
    
    public void displayinfo(){
        System.out.println("Terdapat Mobil dengan Merk : " + merk + ", " + "Model : " + model + ", " + "Tahun : " + tahun + ", " + "Warna : " + warna);
    }
    
    public void engine(){
        System.out.println("Mesin Mobil " + merk + " " + model + " " + "Menyala dengan baik");
    }
}