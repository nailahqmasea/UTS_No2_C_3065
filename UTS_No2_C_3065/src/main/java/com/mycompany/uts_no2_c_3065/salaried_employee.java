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

public class salaried_employee extends employess{
    
    int upahMingguan, gaji;
    
    public salaried_employee(String nama, int nip, int upahMingguan){
        super(nama, nip);
        this.upahMingguan = upahMingguan;
    }
    
    public int hitungGaji(){
        gaji = upahMingguan;
        return gaji;
    }
    
    public void cetaksalaried_employee(){
        super.cetakemployess();
        System.out.println("Upah Mingguan      : " + hitungGaji());
    }
    
}
