package com.mycompany.perustakaan_pbo;
import com.mycompany.perustakaan_pbo.models.Buku;
import com.mycompany.perustakaan_pbo.models.CakramDigital;
import com.mycompany.perustakaan_pbo.models.Koran;
import com.mycompany.perustakaan_pbo.models.Majalah;
import com.mycompany.perustakaan_pbo.services.BukuServices;
import com.mycompany.perustakaan_pbo.services.KoranService;
import com.mycompany.perustakaan_pbo.services.MajalahServices;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    static OpenLibrary openLibrary = new OpenLibrary();
    static Scanner scanner = new Scanner(System.in);
    static int pilih;

    public static void add() {
        String jenis, status, namaKoleksi, penerbit, tangter;
        int noKoleksi, pilihStatus;
        System.out.println("Data Apa yang ingin anda tambahkan : ");
        System.out.println("1.Buku\t2.Majalah\n3.Koran\t4.Cakram Digital");
        pilih = scanner.nextInt();
        switch (pilih) {
            case 1:
                BukuServices.tambahData();
                break;
            case 2:
                MajalahServices.tambahData();
                break;
            case 3:
                KoranService.tambahData();
                break;
            case 4:
                jenis = "Cakram Digital";
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
                System.out.println("Jenis Media[1.Biasa\t2.Bluray\t3.CD RIP]");
                System.out.print("Pilih : ");
                int pilihMedia = scanner.nextInt();
                String jenisMedia = "Biasa";
                switch (pilihMedia) {
                    case 1:
                        jenisMedia = "Biasa";
                        break;
                    case 2:
                        jenisMedia = "Bluray";
                        break;
                    case 3:
                        jenisMedia = "CD RIP";
                        break;
                }
                openLibrary.addKoleksi(new CakramDigital(noKoleksi, namaKoleksi, penerbit, tangter, jenis, status,
                        jenisMedia));
                break;
        }
    }

    public static void displayKoleksi() {
        char urut;
        int pilihUrut;
        System.out.println("Tampilkan");
        System.out.println("1.Buku\t2.Majalah\n3.Koran\t4.Cakram Digital");
        System.out.print("Pilih : ");
        pilih = scanner.nextInt();
        switch (pilih) {
            case 1:
                System.out.print("Apakah Ingin diurutkan?[y/t] : ");
                urut = scanner.next().charAt(0);
                if (urut == 'y' || urut == 'Y') {
                    System.out.println("Ingin diurutkan Berdasarkan?\n1.Title\t2.No Koleksi");
                    System.out.print("Pilih : ");
                    pilihUrut = scanner.nextInt();
                    switch (pilihUrut) {
                        case 1:
                            openLibrary.compare(1);
                            openLibrary.displayBuku();
                            break;
                        case 2:
                            openLibrary.compare(2);
                            openLibrary.displayBuku();
                            break;
                    }
                } else if (urut == 't' || urut == 'T') {
                    openLibrary.displayBuku();
                }
                break;
            case 2:
                System.out.print("Apakah Ingin diurutkan?[y/t] : ");
                urut = scanner.next().charAt(0);
                if (urut == 'y' || urut == 'Y') {
                    System.out.println("Ingin diurutkan Berdasarkan?\n1.Title\t2.No Koleksi");
                    System.out.print("Pilih : ");
                    pilihUrut = scanner.nextInt();
                    switch (pilihUrut) {
                        case 1:
                            openLibrary.compare(1);
                            openLibrary.displayMajalah();
                            break;
                        case 2:
                            openLibrary.compare(2);
                            openLibrary.displayMajalah();
                            break;
                    }
                } else if (urut == 't' || urut == 'T') {
                    openLibrary.displayMajalah();
                }
                break;
            case 3:
                System.out.print("Apakah Ingin diurutkan?[y/t] : ");
                urut = scanner.next().charAt(0);
                if (urut == 'y' || urut == 'Y') {
                    System.out.println("Ingin diurutkan Berdasarkan?\n1.Title\t2.No Koleksi");
                    System.out.print("Pilih : ");
                    pilihUrut = scanner.nextInt();
                    switch (pilihUrut) {
                        case 1:
                            openLibrary.compare(1);
                            openLibrary.displayKoran();
                            break;
                        case 2:
                            openLibrary.compare(2);
                            openLibrary.displayKoran();
                            break;
                    }
                } else if (urut == 't' || urut == 'T') {
                    openLibrary.displayKoran();
                }
                break;
            case 4:
                System.out.print("Apakah Ingin diurutkan?[y/t] : ");
                urut = scanner.next().charAt(0);
                if (urut == 'y' || urut == 'Y') {
                    System.out.println("Ingin diurutkan Berdasarkan?\n1.Title\t2.No Koleksi");
                    System.out.print("Pilih : ");
                    pilihUrut = scanner.nextInt();
                    switch (pilihUrut) {
                        case 1:
                            openLibrary.compare(1);
                            openLibrary.displayCakram();
                            break;
                        case 2:
                            openLibrary.compare(2);
                            openLibrary.displayCakram();
                            break;
                    }
                } else if (urut == 't' || urut == 'T') {
                    openLibrary.displayCakram();
                }
                break;
            default:
                System.out.println("Pilih yang ada Pada Pilihan");
                break;
        }
        System.out.println();
    }

    public static void runThis() {
        do {
            System.out.println("===== Open Library =====");
            System.out.println("1.Tambah Koleksi\n2.Display Koleksi\n3.Exit");
            System.out.print("Pilih : ");
            pilih = scanner.nextInt();
            switch (pilih) {
                case 1:
                    add();
                    break;
                case 2:
                    displayKoleksi();
                    break;
                case 3:
                    System.out.println("Terima Kasih!");
                    System.exit(1);
                    break;
                default:
                    System.out.println("Pilih yang ada pada pilihan!");
                    break;
            }
        } while (true);
    }

    public static void dummy() {
        openLibrary.addKoleksi(new Buku(1, "Petualangan Dimas", "BIN",
                "10 Maret 2001", "Buku", "Ada", "Dimas", "A0192",
                "A1029", "A82828", "PQO102", 2001));

        openLibrary.addKoleksi(new Buku(5, "Mau Hidup Sehat", "BIN",
                "10 Maret 2001", "Buku", "Ada", "Dimas", "A0192",
                "A1029", "A82828", "PQO102", 2001));

        openLibrary.addKoleksi(new Majalah(2,"Baju Baru",
                "SoKrenz","20 Maret 2020","Majalah","Ada",
                10,"Mingguan"));

        openLibrary.addKoleksi(new Majalah(6,"Celana Baru",
                "SoKrenz","20 Maret 2020","Majalah","Ada",
                10,"Mingguan"));

        openLibrary.addKoleksi(new Koran(3, "Kelakuan Tikus",
                "Bang Alex", "28 Maret 2020", "Koran", "Ada", "Harian"));

        openLibrary.addKoleksi(new Koran(7, "Corona Musnah",
                "Bang Alex", "28 Maret 2021", "Koran", "Ada", "Harian"));

        openLibrary.addKoleksi(new CakramDigital(4, "Si Bolang", "Trens 9",
                "30 Maret 2020", "Cakram Digital", "Rusak", "Bluray"));

        openLibrary.addKoleksi(new CakramDigital(8, "Narto", "Gloubal",
                "30 Maret 2020", "Cakram Digital", "Ada", "Bluray"));

    }

    public static void main(String[] args) throws IOException {
        dummy();
        runThis();
        //read in string
//        String data = new String(Files.readAllBytes(Paths.get("./user.json")));
//
//        //read as json array
//        JSONArray jsonArray = new JSONArray(data);
//        for (int i=0; i< jsonArray.length();i++){
//
//            //parse in json object
//            JSONObject object = jsonArray.getJSONObject(i);
//            or
//            //JSONPObject object =  jsonArray.getJSONObject(i);
//            String str = jsonArray.get(i).toString();
//            JSONObject object1 = new JSONObject(str);
//
//            String namaKoleksi = object1.getString(key."namaKoleksi");
//            String penerbit = object1.getString(key."penerbit");
//            String tangter = object1.getString(key."tangter");
//            String jenis = object1.getString(key."jenis");
//
//            int  noKoleksi = object1.getInt(key:"noKoleksi");
//            System.out.println("NamenamaKoleksi: "+ namaKoleksi);
//            System.out.println("noKoleksi: "+ noKoleksi);
//            System.out.println("penerbit: "+ penerbit);
//            System.out.println("tangter: "+ tangter);
//            System.out.println("jenis: "+ jenis);
    }


    }

