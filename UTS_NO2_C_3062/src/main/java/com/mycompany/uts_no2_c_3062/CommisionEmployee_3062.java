/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no2_c_3062;

/**
 *
 * @author Judecca_GilangFibarkah_21103062
 */
public class CommisionEmployee_3062 extends Employees_3062 {
    public float Komisi_3062;
    public float TotalPenjualan_3062;
    public float Totalgaji_3062;
    
     public CommisionEmployee_3062(){
        
    }
    
    public float TotalGaji_3062(){
        Totalgaji_3062 = gajiPokok_3062 + (Komisi_3062 * TotalPenjualan_3062);
        return Totalgaji_3062;
    }
    
    public void TampilData_3062(){
        System.out.println("Komisi Karyawan");
        Tampil_3062();
        System.out.println("Total Gaji: " + Totalgaji_3062);
    }
}
