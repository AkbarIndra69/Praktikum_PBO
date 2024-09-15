/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author AKBAR
 */
public class Mobil extends Kendaraan {
    private int jumlahpintu;
    
    public Mobil(String nama, int kecepatanMaks, String jenisMesin, int jumlahpintu) {
        super(nama, kecepatanMaks, jenisMesin);
        this.jumlahpintu = jumlahpintu;
    }
    
    public void tampilkaninfomobil() {
        System.out.println("Nama Mobil : " + getNama());
        System.out.println("Kecepatan Maksimum Mobil : " + kecepatanMaks + " km/h");
        System.out.println("Jenis Mesin : " + jenisMesin);
        System.out.println("Jumlah Pintu : " + jumlahpintu);
    }
}
