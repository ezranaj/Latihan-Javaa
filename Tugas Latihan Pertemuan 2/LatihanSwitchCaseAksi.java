/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3;

import java.util.*;

/**
 *
 * @author ezran
 */
public class LatihanSwitchCaseAksi {
    public static void main(String[] args) {
        LatihanSwitchCase switchcase = new LatihanSwitchCase();
        
        switchcase.setInputData();
        switchcase.getJabatan();
        switchcase.setInputPend();
        switchcase.getPendidikan();
        switchcase.setInputJam_Kerja();
        switchcase.getLembur();
        switchcase.getTotal();
        
        System.out.println("\n\tHasil Akhir");
        System.out.println("======================================");
        System.out.println("Nama Karyawan \t\t: " + switchcase.nama);
        System.out.println("Honor Tetap \t\t: " + switchcase.honor);
        System.out.println("Tunjangan jabatan \t: " + switchcase.getJabatan());
        System.out.println("Tunjangan pendidikan \t: " + switchcase.getPendidikan());
        System.out.println("Honor Lembur \t\t: " + switchcase.getLembur());
        System.out.println("======================================");
        System.out.println("Total Honor \t\t: " + switchcase.getTotal());
    }
}
