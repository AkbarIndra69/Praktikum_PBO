/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas12;

/**
 *
 * @author AKBAR
 */
import java.io.Serializable;

public class Buku implements Serializable {
    private String judul;
    private String pengarang;
    private int tahunTerbit;
    
    public Buku(String judul, String pengarang, int tahunTerbit) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }
    
    @Override
    public String toString() {
        return "Judul: " + judul + ", Pengarang: " + pengarang + ", Tahun Terbit: " + tahunTerbit;
    }
    
    // Method untuk format penyimpanan ke txt
    public String toFileString() {
        return judul + ";" + pengarang + ";" + tahunTerbit;
    }
}