/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikum5;

/**
 *
 * @author AKBAR
 */
public class Vivipar extends Hewan {
    String kembangbiak;
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Berkembang Biak dengan cara : " + kembangbiak);
    }
}
