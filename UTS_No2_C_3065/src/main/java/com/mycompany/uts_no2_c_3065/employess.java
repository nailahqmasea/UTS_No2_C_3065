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
public class employess {
   
    protected int nip, gaji;
    protected String nama;
    
    public employess(String nama, int nip){
        this.nama = nama;
        this.nip = nip;
    }
    
    public int hitungGaji(){
        return gaji;
    }
    
    public void cetakemployess(){
        System.out.println("Nama               : " + nama);
        System.out.println("NIP                : " + nip);
    }
    
}
