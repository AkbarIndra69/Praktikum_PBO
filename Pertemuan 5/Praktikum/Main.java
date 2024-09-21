/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author AKBAR
 */
public class Main {
    public static void main(String[] args) {
        Mobil mobil = new Mobil();
        mobil.nama = "Honda";
        mobil.kecepatan = 100;
        mobil.jumlahpintu = 4;
        System.out.println("Informasi Mobil :");
        mobil.tampilkanInfo();
        
        Motor motor = new Motor();
        motor.nama = "Kawasaki";
        motor.kecepatan = 80;
        motor.jenismesin = "4-tak";
        System.out.println("\nInformasi Motor :");
        motor.tampilkanInfo();
    }
}
