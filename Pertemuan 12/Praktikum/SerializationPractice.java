/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author AKBAR
 */
public class SerializationPractice {
    public static void main(String[] args) {
        String filePath = "produk.ser";
        
        //membuat objek
        Produk produk = new Produk("Laptop", 15000000, 10);
        
        //menyimpan objek ke file serialisasi
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(produk);
            System.out.println("Objek Produk berhasil disimpan ke file : " + filePath);
        } catch (IOException e) {
            System.out.println("Terjadi kesalah saat menyimpan objek.");
            e.printStackTrace();
        }
        

        // Membaca objek dari file (Deserialisasi) 
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) { 
            Produk deserializedProduk = (Produk)ois.readObject(); 
            System.out.println("\nObjek Produk berhasil dibaca dari file:"); 
            deserializedProduk.tampilkanInfo(); 
        } catch (IOException | ClassNotFoundException e) 
{ 
            System.out.println("Terjadi kesalahan saat membaca objek."); 
            e.printStackTrace(); 
        } 
    }
}
