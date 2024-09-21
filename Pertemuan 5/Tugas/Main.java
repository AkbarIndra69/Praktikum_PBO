/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikum5;

/**
 *
 * @author AKBAR
 */
public class Main {
    public static void main(String[] args) {
        Anjing guguk = new Anjing();
        guguk.nama = "Doggy";
        guguk.jenis = "K9";
        guguk.suara = "guk-guk-guk";
        guguk.kembangbiak = "Vivipar";
        System.out.println("Informasi Anjing :");
        guguk.tampilkanInfo();
        
        Kucing miaw = new Kucing();
        miaw.nama = "Puss";
        miaw.jenis = "Sphynx";
        miaw.suara = "miawwww";
        miaw.kembangbiak = "Vivipar";
        System.out.println("\nInformasi Kucing :");
        miaw.tampilkanInfo();
        
    }
}
