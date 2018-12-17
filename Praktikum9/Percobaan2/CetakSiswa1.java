/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum9.Percobaan2;

/**
 *
 * @author widya
 */
public class CetakSiswa1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Siswa1 sis=new Siswa1(12345, "Jonowati");
        System.out.println("NIS : "+sis.getNis());
        System.out.println("Nama    : "+sis.getNama());
    }
    
}
