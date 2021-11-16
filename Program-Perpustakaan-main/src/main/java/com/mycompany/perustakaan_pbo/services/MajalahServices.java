package com.mycompany.perustakaan_pbo.services;

import com.mycompany.perustakaan_pbo.OpenLibrary;
import com.mycompany.perustakaan_pbo.models.Majalah;

import java.util.Scanner;

public class MajalahServices {

    static String jenis;
    static String status;
    static String namaKoleksi;
    static String penerbit;
    static String tangter;
    static int noKoleksi;
    static int pilihStatus;-

    static Scanner scanner = new Scanner(System.in);
    static OpenLibrary openLibrary = new OpenLibrary();

    static public void tambahData(){
        jenis = "Majalah";
        System.out.print("Masukkan Nomor Koleksi : ");
        noKoleksi = scanner.nextInt();
        System.out.print("Masukkan Judul : ");
        namaKoleksi = scanner.next();
        System.out.print("Masukkan Pihak Penerbit : ");
        penerbit = scanner.next();
        System.out.print("Masukkan Tanggal Terbit : ");
        tangter = scanner.next();
        System.out.println("Status[1.Ada\t2.Rusak\t3.Hilang]");
        System.out.print("Pilih : ");
        pilihStatus = scanner.nextInt();
        switch (pilihStatus) {
            case 1:
                status = "Ada";
                break;
            case 2:
                status = "Rusak";
                break;
            case 3:
                status = "Hilang";
                break;
            default:
                status = "Koleksi";
                break;
        }
        System.out.print("Masukkan No Edisi : ");
        int noEdisi = scanner.nextInt();
        System.out.println("Jenis Terbit[1.Mingguan\t2.Bulanan]");
        System.out.print("Pilih : ");
        int jenisTerbit = scanner.nextInt();
        String jenisMajalah;
        switch (jenisTerbit) {
            case 1:
                jenisMajalah = "Mingguan";
                break;
            case 2:
                jenisMajalah = "Bulanan";
                break;
            default:
                jenisMajalah = "";
                break;
        }
        openLibrary.addKoleksi(new Majalah(noKoleksi, namaKoleksi, penerbit, tangter, jenis, status, noEdisi,
                jenisMajalah));
    }
}
