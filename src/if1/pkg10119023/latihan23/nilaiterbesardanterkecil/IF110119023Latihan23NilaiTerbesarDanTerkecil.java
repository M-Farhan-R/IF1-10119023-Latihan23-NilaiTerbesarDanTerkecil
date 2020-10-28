/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package if1.pkg10119023.latihan23.nilaiterbesardanterkecil;

/**
 *
 * @author 
 * NAMA              : Muhammad Farhan R <farhan.10119023@mahasiswa.unikom.ac.id>
 * KELAS             : IF1
 * NIM               : 10119023
 * Deskripsi Program : Progran mencari nilai tebesar dan terkecil
 *
 */
import java.util.Scanner;
import java.util.Scanner.*;
public class IF110119023Latihan23NilaiTerbesarDanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Scanner scan3 = new Scanner(System.in);
        
        System.out.println("=====Program Nilai Terbesar dan Nilai Terkecil Mahasiswa=====");
        
        System.out.print("Masukkan Nama Petugas              : ");
        String nama = scan1.next();
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        int mhs = scan2.nextInt();
        
        int[] nilai = new int[mhs];
        for(int i=0;i<mhs;i++){
            System.out.print("Masukkan Nilai Mahasiswa ke-"+(i+1)+" = ");
            nilai[i] = scan3.nextInt();
        }
        int max = nilai[0];
        int min = nilai[0];
        
        System.out.println("");
        System.out.println("=====Hasil Nilai Mahasiswa=====");
        for(int i=0;i<mhs;i++){
            if(min>nilai[i]){
                min = nilai[i];
            }
            
            if(max<nilai[i]){
                max = nilai[i];
            }
            System.out.println("Nilai Mahasiswa ke-"+(i+1)+" = "+nilai[i]);
        }
        System.out.println("");
        System.out.println("Nilai Terbesar adalah "+max);
        System.out.println("Nilai Terkecil adalah "+min);
    }

}
