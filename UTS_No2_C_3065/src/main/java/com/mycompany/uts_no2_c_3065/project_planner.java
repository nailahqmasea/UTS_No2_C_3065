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
public class project_planner extends employess{
    
    int komisi, totalHasilProyek;
    
    public project_planner(String nama, int nip, int gaji, int komisi, int totalHasilProyek){
        super(nama, nip);
        this.komisi = komisi;
        this.totalHasilProyek = totalHasilProyek;
    }
    
    public int hitungGaji(){
        gaji = gaji + (komisi * totalHasilProyek) - (5/100 * gaji);
        return gaji;
    }
    
    public void cetakproject_planner(){
        super.cetakemployess();
        System.out.println("Komisi             : " + komisi);
        System.out.println("Total hasil Proyek : " + totalHasilProyek);
        System.out.println("Total gaji         : " + hitungGaji());
    }
}