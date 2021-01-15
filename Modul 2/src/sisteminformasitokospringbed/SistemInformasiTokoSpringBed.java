package sisteminformasitokospringbed;
import Entity07217.*;
import Model07217.*;
import java.util.ArrayList;
import java.util.Scanner;
public class SistemInformasiTokoSpringBed {
private static AdminModel07217 adminModel = new AdminModel07217();
private static PelangganModel07217 pelangganModel = new PelangganModel07217();
static public ArrayList <BarangEntity> databarang = new ArrayList();
static int cekAdmin;
static int cekPelanggan;
static Scanner input = new Scanner(System.in);
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
                case 1:
                    if(pil == 1){
                            daftarpelanggan();
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
        System.out.print("Input Nama = ");
        String nama = input.next();
        System.out.print("Input Password = ");
        String password = input.next();
        System.out.print("Alamat = ");
        String alamat = input.next();
        System.out.print("Input notelp = ");
        String no_telp = input.next();
        pelangganModel.insertPelanggan(new PelangganEntity07217(nama,password,alamat,no_telp));
    }

    static void dataAdmin()
    {
        String nama[] = {"yoga","nanda"};
        String password[] = {"01","02"};
        for(int i=0;i<nama.length;i++)
        {
            adminModel.insertAdmin(new AdminEntity07217(nama[i],password[i]));
        }
    }
    static void barang(){
        System.out.print("INPUT NAMA BARANG = "); 
        String namabarang = input.next(); 
        System.out.print("INPUT HARGA = ");
        String harga = input.next();
        System.out.print("JUMLAH STOK BARANG = ");
        String stok = input.next();
        System.out.println("==========================================");
        databarang.add(new BarangEntity(namabarang,harga,stok));
    }
    static void view(){
        System.out.println("---BARANG YANG TERSEDIA---");
        System.out.println("==========================================");
        for(int i=0;i<databarang.size();i++)
        {
            System.out.println("Nama Barang = "+databarang.get(i).getNamabarang());
            System.out.println("Harga = "+databarang.get(i).getHarga());
            System.out.println("Stok = "+databarang.get(i).getStok());
            System.out.println("==========================================");
        }
    }
    static void hapus(String namabarang)
    {
        for(int i=0;i<databarang.size();i++)
        {
            if(namabarang.equals(databarang.get(i).getNamabarang()))
            {
                databarang.remove(i);
                System.out.println("Data Telah Di Hapus");
                System.out.println("==========================================");
            }
            else
            {
                System.out.println("Barang Tidak Tersedia");
                System.out.println("==========================================");
            }
        }
    }
    static void update(String namabarang,String newharga,String newstok)
    {
        for(int i=0;i<databarang.size();i++)
        {
            if(namabarang.equals(databarang.get(i).getNamabarang()))
            {
                databarang.get(i).harga = newharga;
                databarang.get(i).stok = newstok;
                System.out.println("Data Telah DI Update");
                System.out.println("==========================================");
            }
        }
    }
    static void loginAdmin(){
        int pil;
        System.out.print("Masukkan Nama Admin : ");
        String nama = input.next();
        System.out.print("Password Admin : ");
        String password = input.next();
        cekAdmin = adminModel.cekData(nama,password);
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
                case 2 : view();
                    break;
                case 3 : System.out.print("Inputkan Namabarang = ");
                         String namabarang = input.next();
                         hapus(namabarang);
                    break;
                case 4 : 
                    System.out.print("Inputkan Namabarang = ");
                    namabarang = input.next();
                    for(int i=0;i<databarang.size();i++)
                    {
                        if(namabarang.equals(databarang.get(i).getNamabarang()))
                        {
                            System.out.print("Inputkan Harga Baru = ");
                            String newharga = input.next();
                            System.out.print("Inputkan Stok Baru = ");
                            String newstok = input.next();
                            System.out.println("==========================================");
                            update(namabarang,newharga,newstok);
                        }
                        else
                        {
                            System.out.println("Barang Tidak Tersedia");
                            System.out.println("==========================================");
                        }
                    }
                    break;
            }
        }
        while(pil!=5);
    }
    static void loginPelanggan()
    {
        int pil;
        System.out.print("Nama Pelanggan : ");
        String nama = input.next();
        System.out.print("Password : ");
        String password = input.next();
        cekPelanggan = pelangganModel.cekData(nama, password);
        do
        {
            System.out.println("1. Data Barang Yang Tersedia");
            System.out.println("2. Exit");
            System.out.print("Pilih = ");
            pil = input.nextInt();
            System.out.println("==========================================");
            switch(pil)
            {
            case 1: view();
                ;
                break;
            }
        }
        while (pil!=2);
    }
}
