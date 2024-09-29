/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author AKBAR
 */
public class Hewan {
    public void bersuara(){
        System.out.println("Hewan Bersuara : ");
    }
    
    public void makan(String makanan) {
        System.out.println("Hewan Makan " + makanan);
    }
    
    public void makan(String makanan, int porsi) {
        System.out.println("Hewan makan " + makanan + ","+ porsi + " porsi" );
    }
}
