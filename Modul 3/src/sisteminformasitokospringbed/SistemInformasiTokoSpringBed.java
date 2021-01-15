package sisteminformasitokospringbed;

import Entity07217.*;
import Controller07217.*;
import java.util.Scanner;
import java.util.InputMismatchException;
public class SistemInformasiTokoSpringBed {
    private static AdminController admin = new AdminController();
    private static Scanner input = new Scanner (System.in);
    private static PelangganController pelanggan = new PelangganController();
    private static BarangController barang = new BarangController();
    static int cekAdmin;
    static int cekPelanggan;
    public static void main(String[] args) {
        System.out.println("Sistem Informasi Toko Spring Bed Teddy !!");
        System.out.println("==========================================");
        int pil;
        do{
        System.out.println("1. Daftar");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Pilih = ");
            pil = input.nextInt();
            System.out.println("==========================================");
            switch(pil){
                case 1: if(pil == 1){
                           daftarpelanggan() ;
            }
                    break;
                case 2 : if(pil == 2){
                            int pilLogin = 0;
            System.out.print("1. Login Admin" + "\n2. Login pelanggan" + "\n Pilih : ");
                pilLogin = input.nextInt();
                if(pilLogin == 1){
                    loginAdmin();
                }else{
                    loginPelanggan();
                }
            }
                    
                    break;
            }System.out.println("==========================================");
        }while (pil!=3);
    }
    static void daftarpelanggan()
    {
        try{
        System.out.print("Input Nama = ");
        String nama = input.next();
        System.out.print("Input Password = ");
        String password = input.next();
        System.out.print("Alamat = ");
        String alamat = input.next();
        System.out.print("Input notelp = ");
        int no_telp = input.nextInt();
        pelanggan.insertPelanggan(nama, password, alamat, no_telp);
        System.out.println("Daftar Sukses !!");
        }catch (Exception ex){
          System.out.println("Format Pengisian Salah !!"+ex);
        }   
    }
    static void barang(){
        System.out.print("INPUT NAMA BARANG = "); 
        String namabarang = input.next(); 
        System.out.print("INPUT HARGA = ");
        String harga = input.next();
        System.out.print("JUMLAH STOK BARANG = ");
        String stok = input.next();
        barang.insert(namabarang, harga, stok);
        System.out.println("==========================================");
        
    }
    static void view()
    {
        barang.viewbarang();
    }
    static void hapus(String namabarang)
    {
        barang.hapus(namabarang);
    }
    static void update(String namabarang,String harga,String stok)
    {
        barang.update(namabarang, harga, stok);
    }
    static void loginPelanggan()
    {
        int pil;
        System.out.print("Nama Pelanggan : ");
        String nama = input.next();
        System.out.print("Password : ");
        String password = input.next();
        cekPelanggan = AllObjectModel.pelangganModel.cekData(nama, password);
        do
        {
            System.out.println("1. Data Barang Yang Tersedia");
            System.out.println("2. Exit");
            System.out.print("Pilih = ");
            pil = input.nextInt();
            System.out.println("==========================================");
            switch(pil)
            {
            case 1: System.out.println("BARANG YANG TERSEDIA");
                    System.out.println("==========================================");
                    view();
                ;
                break;
            }
        }
        while (pil!=2);
    }
    static void loginAdmin(){
        int pil;
        System.out.print("Masukkan Nama Admin : ");
        String nama = input.next();
        System.out.print("Password Admin : ");
        String password = input.next();
        cekAdmin = AllObjectModel.adminModel.cekData(nama, password);
        do{
            System.out.println("1. Input Data Barang");
            System.out.println("2. View Data Barang");
            System.out.println("3. Hapus Data Barang");
            System.out.println("4. Update Data Barang");
            System.out.println("5. Exit");
            System.out.print("Pilih = ");
            pil = input.nextInt();
            System.out.println("==========================================");
            switch(pil){
                case 1 : barang();
                    break;
                case 2 : System.out.println("BARANG YANG TERSEDIA");
                         System.out.println("==========================================");
                         view();
                    break;
                case 3 : System.out.print("Inputkan Namabarang = ");
                         String namabarang = input.next();
                         hapus(namabarang);
                    break;
                case 4 : 
                    System.out.print("Inputkan Namabarang : ");
                    namabarang = input.next();
                    System.out.print("Inputkan Harga Baru : ");
                    String newharga = input.next();
                    System.out.print("Inputkan Jumlah Stok : ");
                    String newstok = input.next();
                    update(namabarang,newharga,newstok);
                    break;
            }
        }
        while(pil!=5);
    }
    
        
}