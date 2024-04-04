/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3;

import java.util.*;

/**
 *
 * @author ezranaj
 */
public class LatihanSwitchCase {
    
    public String nama, pend;
    public int honor = 300000, jabatan, pendidikan, jam_kerja;
    public double tunjangan_jabatan, tunjangan_pend, lembur, total_honor;
    
    Scanner input = new Scanner(System.in);
    
    public void setInputData(){
        System.out.print("Masukkan Nama Karyawan \t: ");
        nama = input.nextLine();
        System.out.print("Masukkan Golongan Karyawan \t: ");
        jabatan = input.nextInt();
    }
    
    public double getJabatan(){
        switch(jabatan){
            case 1 -> tunjangan_jabatan = (0.05*honor);
            case 2 -> tunjangan_jabatan = (0.1*honor);
            case 3 -> tunjangan_jabatan = (0.15*honor);
            default -> {
                tunjangan_jabatan = (0); 
                System.out.println("Pilihan tidak tersedia");
                break;
            }
        }
        System.exit(0);
        return tunjangan_jabatan;
    }
    
    public void setInputPend(){
        System.out.print("Masukkan Pendidikan Karyawan \t: ");
        pendidikan = input.nextInt();
    }
    
    public double getPendidikan(){
        switch(pendidikan){
            case 1 -> {
                pend = "SMA";
                tunjangan_pend = (0.025*honor);
            }
            case 2 -> {
                pend = "D3";
                tunjangan_pend = (0.05*honor);
            }
            case 3 -> {
                pend = "S1";
                tunjangan_pend = (0.75*honor);
            }
            default ->  {
               tunjangan_pend = (0); 
               System.out.println("Pilihan tidak tersedia"); 
               break;
            } 
        }
        System.exit(0);
        return tunjangan_pend;
    }
    
    public void setInputJam_Kerja(){
        System.out.print("Masukkan Jam Kerja Karyawan \t: ");
        jam_kerja = input.nextInt();
    }
    
    public double getLembur(){
        if (jam_kerja > 8){
            lembur = (2500*(jam_kerja - 8));
        }
        else {
            lembur = 0;
        }
        return lembur;
    }
    
    public double getTotal(){
        total_honor = honor + tunjangan_jabatan + tunjangan_pend + lembur;
        return total_honor;
    }
}
