/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikum6;

/**
 *
 * @author AKBAR
 */
import java.util.ArrayList;
import java.util.List;

class KeranjangBelanja {
    private List<Produk> daftarProduk;

    public KeranjangBelanja() {
        daftarProduk = new ArrayList<>();
    }

    public void tambahProduk(Produk produk) {
        daftarProduk.add(produk);
    }

    public double hitungTotalHargaSetelahDiskon() {
        double total = 0;
        for (Produk produk : daftarProduk) {
            total += produk.getHarga() - produk.hitungDiskon();
        }
        return total;
    }

    public void tampilkanProduk() {
        for (Produk produk : daftarProduk) {
            System.out.println(produk.getNama() + " dengan harga setelah diskon: "  + (produk.getHarga() - produk.hitungDiskon()));
        }
    }
}