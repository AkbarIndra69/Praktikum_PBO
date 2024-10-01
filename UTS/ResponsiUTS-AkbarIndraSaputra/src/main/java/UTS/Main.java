/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author AKBAR
 */
public class Main {
    public static void main(String[] args) {
        Produk laptop = new Elektronik("Laptop", 15000000, 2);
        System.out.println("Output Produk");
        laptop.tampilkanInfo();
        
        Pegawai akbar = new PegawaiTetap("Akbar", 5000000, 1000000);
        System.out.println("\nOutput Pegawai");
        akbar.tampilkanInfo();

        Produk snack = new Makanan("Snack", 15000, "2023-12-30");
        System.out.println("\nOutput Polimorfisme");
        snack.tampilkanInfo();

        Pegawai andi = new PegawaiKontrak("Andi", 3000000, 12);
        System.out.println("");
        andi.tampilkanInfo();
    }
}