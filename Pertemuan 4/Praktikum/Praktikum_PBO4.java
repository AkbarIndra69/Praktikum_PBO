/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author AKBAR
 */
public class Praktikum_PBO4 {
   
    public static void main(String[] args) {
        Kendaraan mobil = new Kendaraan("Buroq", 100, "Turbo");
        System.out.println("Informasi Kendaraan: ");
        mobil.tampilkaninfokendaraan();
       
        Mobil car = new Mobil("Lambo", 30, "Listrik", 10);
        System.out.println("\nInformasi Mobil: ");
        car.tampilkaninfomobil();
    
        Mobil car2 = new Mobil("Porshce", 200, "Diesel", 2);
        System.out.println("\nInformasi Mobil: ");
        car2.tampilkaninfomobil();
    }
    
}