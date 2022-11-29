/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.uts_no2_c_3062;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Judecca_GilangFibarkah_21103062 
 */
public class UTS_NO2_C_3062 {

    public static void main(String[] args) {
        
        SalariedEmployee_3062 gil_3062 = new SalariedEmployee_3062();
        CommisionEmployee_3062 lang_3062 = new CommisionEmployee_3062();
        ProjectPlanner_3062 fib_3062 = new ProjectPlanner_3062();
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        
        try{
            System.out.println("Data Pegawai");
            System.out.print("Nama: ");
            gil_3062.nama_3062 = br.readLine();
            System.out.print("NIP: ");
            gil_3062.nip_3062 = br.readLine();
            System.out.print("Gaji Pokok: ");
            gil_3062.gajiPokok_3062 = Float.parseFloat(br.readLine());
            gil_3062.TampilData_3062();
            
            System.out.print("Nama: ");
            lang_3062.nama_3062 = br.readLine();
            System.out.print("NIP: ");
            lang_3062.nip_3062 = br.readLine();
            System.out.print("GajiPokok: ");
            lang_3062.gajiPokok_3062 = Float.parseFloat(br.readLine());
            System.out.print("Komisi: ");
            lang_3062.Komisi_3062 = Float.parseFloat(br.readLine());
            System.out.print("Total Penjualan: ");
            lang_3062.TotalPenjualan_3062 = Float.parseFloat(br.readLine());
            lang_3062.TotalGaji_3062();
            lang_3062.TampilData_3062();
            
            System.out.print("Nama: ");
            fib_3062.nama_3062 = br.readLine();
            System.out.print("NIP: ");
            fib_3062.nip_3062 = br.readLine();
            System.out.print("Gaji Pokok: ");
            fib_3062.gajiPokok_3062 = Float.parseFloat(br.readLine());
            System.out.print("Komisi: ");
            fib_3062.Komisi_3062 = Float.parseFloat(br.readLine());
            System.out.print("Total Hasil Proyek: ");
            fib_3062.TotalHslProyek_3062 = Float.parseFloat(br.readLine());
            fib_3062.TotalGaji_3062();
            fib_3062.TampilData_3062();           
        }
        
        catch(Exception ex){
            System.out.println(ex);
        }
    }
}
