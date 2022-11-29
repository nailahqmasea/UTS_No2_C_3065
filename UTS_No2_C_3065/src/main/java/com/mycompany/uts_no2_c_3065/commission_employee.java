/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no2_c_3065;

/**
 *
 * @author Nailah Qothrunnada Maryana Septeardi
 * NIM : 21103065
 * UTS 2022 No.2
 */
public class commission_employee extends employess{
    
    int komisi, totalPenjualan;
    
    public commission_employee(String nama, int nip, int gaji, int komisi, int totalPenjualan){
        super(nama, nip);
        this.komisi = komisi;
        this.totalPenjualan = totalPenjualan;
    }
    
    public int hitungGaji(){
        gaji = gaji + (komisi * totalPenjualan);
        return gaji;
    }
    
    public void cetakcommision_employee(){
        super.cetakemployess();
        System.out.println("Komisi             : " + komisi);
        System.out.println("Total penjualan    : " + totalPenjualan);
        System.out.println("Total gaji         : " + hitungGaji());
    }
    
}
