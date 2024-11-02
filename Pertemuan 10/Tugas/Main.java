/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikum_10;

/**
 *
 * @author AKBAR
 */
public class Main {
    public static void main(String[] args) {
        
        Elektronik radio = new Elektronik();
        double hargaElektronik = 200000;
        double pajakElektronik = radio.hitungPajak(hargaElektronik);
        System.out.println("Pajak Elektronik : Rp." + pajakElektronik);

        Makanan kue = new Makanan();
        double hargaMakanan = 50000;
        double pajakMakanan = kue.hitungPajak(hargaMakanan);
        System.out.println("Pajak Makanan : Rp." + pajakMakanan);
    }
}