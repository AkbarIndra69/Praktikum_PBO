/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11;

/**
 *
 * @author AKBAR
 */
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Klub klub = new Klub("Klub Ing");

        Anggota anggota1 = new Anggota("Hudson");
        Anggota anggota2 = new Anggota("Zacky");
        Anggota anggota3 = new Anggota("Bryan");

        klub.tambahAnggota(anggota1);
        klub.tambahAnggota(anggota2);
        klub.tambahAnggota(anggota3);

        klub.infoKlub();
    }
}
