/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPBO_11;

/**
 *
 * @author AKBAR
 */
public class Buku {
    public String judul;
    public Pengarang pengarang;

    public Buku(String judul, Pengarang pengarang) {
        this.judul = judul;
        this.pengarang = pengarang;
    }

    public void infoBuku() {
        System.out.println("\nJudul Buku : " + judul);
        if (pengarang != null) {
            pengarang.infoPengarang();
        }
    }
}
