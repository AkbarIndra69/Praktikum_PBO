/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum9;

/**
 *
 * @author AKBAR
 */
public class Main {
    public static void main(String[] args) {
        Kendaraan mobil = new Mobil();
        Kendaraan sepeda = new Sepeda();
        
        System.out.println("Mobil");
        mobil.berjalan();
        mobil.info();
        
        System.out.println("\nSepeda");
        sepeda.berjalan();
        sepeda.info();
    }
}
