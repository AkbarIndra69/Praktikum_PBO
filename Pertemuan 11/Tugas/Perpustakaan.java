/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPBO_11;

/**
 *
 * @author AKBAR
 */
public class Perpustakaan {
    public Buku[] daftarBuku;
    public int jumlahBuku;

    public Perpustakaan(int kapasitas) {
        daftarBuku = new Buku[kapasitas];
        jumlahBuku = 0;
    }

    public void tambahBuku(Buku buku) {
        if (jumlahBuku < daftarBuku.length) {
            daftarBuku[jumlahBuku] = buku;
            jumlahBuku++;
        } else {
            System.out.println("Perpustakaan Sudah Penuh Yaa");
        }
    }

    public void infoPerpustakaan() {
        System.out.println("Informasi Buku di Perpustakaan :");
        for (int i = 0; i < jumlahBuku; i++) {
            daftarBuku[i].infoBuku();
        }
    }
}

