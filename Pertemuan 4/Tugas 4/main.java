/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasMinggu4;

/**
 *
 * @author AKBAR
 */
public class main {
    public static void main(String [] args){
        Pekerja Agus = new Pekerja("Agus", 38, "Arsitek", 2500000);
        
        System.out.println(Agus.toString());
        Agus.setNama("Yudi");
        System.out.println("\nPekerja Setelah berganti nama : ");
        System.out.println(Agus.toString());
    }
}
