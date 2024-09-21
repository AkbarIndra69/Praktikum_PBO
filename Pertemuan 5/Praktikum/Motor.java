/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author AKBAR
 */
public class Motor extends Kendaraan {
    String jenismesin;
    
    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Jenis Mesin : " + jenismesin);
    }
}
