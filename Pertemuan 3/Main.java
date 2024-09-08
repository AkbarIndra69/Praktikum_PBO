/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspbo_3;


/**
 *
 * @author AKBAR
 */
public class Main {
    public static void main(String[] args) {
        Mobil BMW = new Mobil("BMW", "M3 GTR GT", 2001, "Putih");
        Mobil Porsche = new Mobil("Porsche","Carrera GT", 2004, "Hitam");
        
        BMW.displayinfo();
        BMW.engine();
        Porsche.displayinfo();
        Porsche.engine();
       
        System.out.println("\n");
       
        BMW.SetWarna("Biru");
        Porsche.SetWarna("Chrome");
        System.out.println("Setelah Berubah Warna :");
        
        BMW.displayinfo();
        BMW.engine();
        Porsche.displayinfo();
        Porsche.engine();

    }
}

