package com.mycompany.perustakaan_pbo.services;

import com.mycompany.perustakaan_pbo.OpenLibrary;
import com.mycompany.perustakaan_pbo.models.Buku;

import java.util.Scanner;

public class BukuServices {

    static final Scanner scanner = new Scanner(System.in);
    static final OpenLibrary openLibrary = new OpenLibrary();

    static public void tambahData(){
        String jenis = "Buku";
        System.out.print("Masukkan Nomor Koleksi : ");
        int noKoleksi = scanner.nextInt();
        System.out.print("Masukkan Judul : ");
        String namaKoleksi = scanner.nextLine();
        System.out.print("Masukkan Pihak Penerbit : ");
        String penerbit = scanner.nextLine();
        System.out.print("Masukkan Tanggal Terbit : ");
        String tangter = scanner.nextLine();
        System.out.println("Status: \n1.Ada \n2.Rusak \n3.Hilang\n\n");
        System.out.print("Pilih : ");
        int statusPilihan = scanner.nextInt();
        String status = statusSwitcher(statusPilihan);
        System.out.print("Masukkan Pengarang : ");
        String pengarang = scanner.nextLine();
        System.out.print("Masukkan ISSN : ");
        String issn = scanner.nextLine();
        System.out.print("Masukkan ISBN : ");
        String isbn = scanner.nextLine();
        System.out.print("Masukkan DOI : ");
        String doi = scanner.nextLine();
        System.out.print("Masukkan Arxiv ID : ");
        String arxivId = scanner.nextLine();
        System.out.print("Masukkan Tahun Masuk : ");
        int tahunMasuk = scanner.nextInt();
        openLibrary.addKoleksi(new Buku(noKoleksi, namaKoleksi, penerbit, tangter, jenis, status, pengarang,
                issn, isbn, doi, arxivId, tahunMasuk));
    }

    static String statusSwitcher(int status){
        String result = switch (status) {
            case 1 -> "Ada";
            case 2 -> "Rusak";
            case 3 -> "Hilang";
            default -> "Koleksi";
        };
        return result;
    }

}
