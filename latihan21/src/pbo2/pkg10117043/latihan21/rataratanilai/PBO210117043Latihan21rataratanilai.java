/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117043.latihan21.rataratanilai;

import java.util.Scanner;

/**
 *NAMA                 : Yusrizal Falahan
 * Kelas                : PBO-2 
 * NIM                  : 10117043
 * Deskripsi Program    : Program ini berisi perintah untuk menghitung
 *                        rata-rata nilai
 * @author Acer
 */
public class PBO210117043Latihan21rataratanilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int totalN = 0;
           Scanner input = new Scanner(System.in);
        System.out.print("masukkan banyaknya mahasiswa :");
        int nsiswa = input.nextInt();
         for (int i = 1; i <= nsiswa; i++){
             System.out.print("nilai mahasiswa ke-" + i +": ");
             int nilai = input.nextInt();
             totalN+=nilai;
             
         }
         double nilairata = (double) totalN / nsiswa;
         System.out.println("\n" + "maka, rata-rata nilainya adalah" + nilairata);
         System.out.println("Developed by : YusrizalFalahan");
     

    }

}
