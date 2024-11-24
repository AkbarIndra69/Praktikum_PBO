/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas12;

/**
 *
 * @author AKBAR
 */
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class SistemManajemenBuku {
    private static final String TEXT_FILE = "buku.txt";
    private static final String SER_FILE = "buku.ser";
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;
        
        do {
            System.out.println("\n=== MENU MANAJEMEN BUKU ===");
            System.out.println("1. Tambah Buku Baru");
            System.out.println("2. Tampilkan Daftar Buku");
            System.out.println("3. Keluar");
            System.out.print("Pilihan Anda: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // consume newline
            
            switch (pilihan) {
                case 1:
                    tambahBuku(scanner);
                    break;
                case 2:
                    tampilkanBuku();
                    break;
                case 3:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 3);
        
        scanner.close();
    }
    
    private static void tambahBuku(Scanner scanner) {
        System.out.print("Masukkan judul: ");
        String judul = scanner.nextLine();
        
        System.out.print("Masukkan pengarang: ");
        String pengarang = scanner.nextLine();
        
        System.out.print("Masukkan tahun terbit: ");
        int tahunTerbit = scanner.nextInt();
        
        Buku buku = new Buku(judul, pengarang, tahunTerbit);
        
        // Simpan ke file txt
        try (PrintWriter writer = new PrintWriter(new FileWriter(TEXT_FILE, true))) {
            writer.println(buku.toString());
            System.out.println("\nBuku berhasil disimpan ke " + TEXT_FILE);
        } catch (IOException e) {
            System.out.println("Error saat menyimpan ke file txt: " + e.getMessage());
        }
        
        // Simpan ke file serialisasi
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(SER_FILE))) {
            ArrayList<Buku> bukuList = new ArrayList<>();
            
            // Baca data yang sudah ada (jika ada)
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(SER_FILE))) {
                bukuList = (ArrayList<Buku>) ois.readObject();
            } catch (Exception e) {
                // File belum ada atau kosong, buat list baru
                bukuList = new ArrayList<>();
            }
            
            bukuList.add(buku);
            oos.writeObject(bukuList);
            System.out.println("Buku berhasil disimpan ke " + SER_FILE);
            
        } catch (IOException e) {
            System.out.println("Error saat menyimpan ke file serialisasi: " + e.getMessage());
        }
    }
    
    private static void tampilkanBuku() {
        System.out.println("\n=== DAFTAR BUKU DARI FILE TXT ===");
        try (BufferedReader reader = new BufferedReader(new FileReader(TEXT_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error saat membaca file txt: " + e.getMessage());
        }
        
        System.out.println("\n=== DAFTAR BUKU DARI FILE SERIALISASI ===");
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(SER_FILE))) {
            ArrayList<Buku> bukuList = (ArrayList<Buku>) ois.readObject();
            for (Buku buku : bukuList) {
                System.out.println(buku);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error saat membaca file serialisasi: " + e.getMessage());
        }
    }
}