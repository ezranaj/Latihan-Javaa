/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_4;

/**
 *
 * @author ezran
 */
public class InisialisasiArray2 {
    public static void main(String[] args) {
        int i, j;
        int [][] nilai_akhir = {{150, 159, 230}, {100, 125, 150}, {210, 125, 156}};
        
        System.out.println("Data yg diinput ke Elemen Array\n");
        for (i=0;i<3;i++){
            for (j=0;j<3;j++){
                System.out.print("Nilai Akhir index ["+i+"]["+j+"] = ");
                System.out.println(" = " + nilai_akhir[i][j]);
            }
        }
    }
}
