/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPBO_11;

/**
 *
 * @author AKBAR
 */
public class Main {
    public static void main(String[] args) {

        Pengarang pengarang1 = new Pengarang("Ahmad Tohari");
        Pengarang pengarang2 = new Pengarang("Andrea Hirata");
        Pengarang pengarang3 = new Pengarang("Laksmi Pamuntjak");

        Buku buku1 = new Buku("Laskar Pelangi", pengarang2);
        Buku buku2 = new Buku("Ronggeng Dukuh Paruk", pengarang1);
        Buku buku3 = new Buku("Amba", pengarang3);

        Perpustakaan perpustakaan = new Perpustakaan(5);
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);
        perpustakaan.tambahBuku(buku3);

        perpustakaan.infoPerpustakaan();
    }
}
