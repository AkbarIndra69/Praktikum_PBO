/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikum6;

/**
 *
 * @author AKBAR
 */
public class Main {
    public static void main(String[] args) {
        KeranjangBelanja keranjang = new KeranjangBelanja();

        Produk buku = new Buku("Buku Tebak-tebakan Super Lucu dan Gokilll ", 50000);
        Produk elektronik = new Elektronik("Lampu Pemanas Ayam", 30000);
        Produk pakaian = new Pakaian("Kaos Dalam", 20000);

        keranjang.tambahProduk(buku);
        keranjang.tambahProduk(elektronik);
        keranjang.tambahProduk(pakaian);

        keranjang.tampilkanProduk();

        System.out.println("Total harga setelah diskon: " + keranjang.hitungTotalHargaSetelahDiskon());
    }
}