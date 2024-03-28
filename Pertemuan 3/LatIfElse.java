/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3;

import java.util.Scanner;

/**
 *
 * @author ezran
 */
public class LatIfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String keterangan, nama;
        int nilai;
        
        System.out.print("Masukkan Nama Siswa : ");
        nama = input.nextLine();
        System.out.print("Nilai Akhir : ");
        nilai = input.nextInt();
        if(nilai >= 70){
            keterangan = "Lulus";
        }
        else {
            keterangan = "Gagal";
        }    
        System.out.println("\tHasl Akhir");
        System.out.println("===============================");
        System.out.println("Nama Siswa      : " + nama);
        System.out.println("Nilai Akhir     : " + nilai);
        System.out.println("Keterangann     : " + keterangan);
        System.out.println("===============================");

        
    }
}
