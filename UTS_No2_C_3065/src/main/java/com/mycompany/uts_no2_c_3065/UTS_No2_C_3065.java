/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.uts_no2_c_3065;

/**
 *
 * @author Nailah Qothrunnada Maryana Septeardi
 * NIM : 21103065
 * UTS No.2
 */
public class UTS_No2_C_3065 {

    public static void main(String[] args) {

        salaried_employee S = new salaried_employee("Nailah", 241425673, 4000000);
        commission_employee C = new commission_employee("Yogi", 24517827, 4300000, 2000000, 40);
        project_planner P = new project_planner("Angel", 24728927, 5000000, 3000000, 140);
        
        System.out.println("== DATA PEGAWAI PERUSAHAAN ==");
        S.cetaksalaried_employee();
        System.out.println("");
        C.cetakcommision_employee();
        System.out.println("");
        P.cetakproject_planner();
        System.out.println("");
        
    }
}
