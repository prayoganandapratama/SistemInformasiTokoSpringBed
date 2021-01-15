package sisteminformasitokospringbed;
import java.util.Scanner;
import java.util.ArrayList;
public class SistemInformasiTokoSpringBed {
static Scanner input = new Scanner(System.in);
static ArrayList<Yoga07217BarangEntity>databarang = new ArrayList();
    public static void main(String[] args) 
    {
        System.out.println("Selamat Datang Di Toko Spring Bed Teddy !!");
        System.out.println("==========================================");
        int pil;
        do{
            System.out.println("1. Input Barang");
            System.out.println("2. View Stok Barang");
            System.out.println("3. Delete");
            System.out.println("4. Update");
            System.out.println("5. Exit");
            System.out.print("Pilih = ");
            pil = input.nextInt();
            System.out.println("==========================================");
            switch(pil){
                case 1 : Yoga07217_barang();
                break;
                case 2 : Yoga07217_view();
                break;
                case 3 : System.out.println("Data yang ingin di hapus");
                         String Yoga07217_nama= input.next(); 
                         hapus(Yoga07217_nama);
                break;
                case 4 :System.out.print("Inputkan nama  = ");
                    Yoga07217_nama = input.next();
                    System.out.print("Inputkan Jumlah Stok Tersisa = ");
                    String newYoga07217_stok = input.next();
                    System.out.print("Inputkan Harga Baru Barang = ");
                    String newYoga07217_harga = input.next();
                    update(Yoga07217_nama,newYoga07217_stok,newYoga07217_harga);
                break;
            }
            System.out.println("==========================================");
        }while(pil!=5);
    }
   static void Yoga07217_barang()
   {
       System.out.print("INPUT NAMA BARANG = "); 
       String Yoga07217_nama = input.next(); 
       System.out.print("INPUT HARGA = ");
       String Yoga07217_harga = input.next();
       System.out.print ("GARANSI BERAPA TAHUN = ");
       String Yoga07217_garansi =input.next();
       System.out.print("TEBAL BARANG = ");
       String Yoga07217_tebal = input.next();
       System.out.print("UKURAN BARANG = ");
       String Yoga07217_ukuran = input.next();
       System.out.print("Jumlah Stok Barang = ");
       String Yoga07217_stok = input.next();
       databarang.add(new Yoga07217BarangEntity (Yoga07217_nama,Yoga07217_harga,Yoga07217_garansi,Yoga07217_tebal,Yoga07217_ukuran,Yoga07217_stok));
   }
    static void Yoga07217_view()
    {
        for(int i=0;i<databarang.size();i++)
        {
                System.out.println("NAMA BARANG = "+databarang.get(i).getYoga07217_nama());
                System.out.println("HARGA       = "+databarang.get(i).getYoga07217_harga());
                System.out.println("GARANSI     = "+databarang.get(i).getYoga07217_garansi());
                System.out.println("TEBAL       = "+databarang.get(i).getYoga07217_tebal());
                System.out.println("UKURAN      = "+databarang.get(i).getYoga07217_ukuran());
                System.out.println("JUMLAH STOK = "+databarang.get(i).getYoga07217_stok());
                System.out.println("==========================================");
        }
          
    }
   static int caribarang(String Yoga07217_nama)
   {
       int indexbarang = -1;
       for(int i=0;i<databarang.size(); i++)
       {
           if(Yoga07217_nama.equals(databarang.get(i).getYoga07217_nama()))
           {
               indexbarang = i;
           }
       }
       return indexbarang;
   }
   static void hapus(String Yoga07217_nama)
   {
       databarang.remove(caribarang(Yoga07217_nama));
       System.out.println("Data Telah Di Hapus");
       System.out.println("==========================================");
   }
   static void update(String Yoga07217_nama,String newYoga07217_stok,String newYoga07217_harga)
    {
        for(int i=0;i<databarang.size();i++)
        {
            if(Yoga07217_nama.equals(databarang.get(i).getYoga07217_nama()))
            {
                databarang.get(i).Yoga07217_stok=newYoga07217_stok;
                databarang.get(i).Yoga07217_harga=newYoga07217_harga;
                System.out.println("Data Telah DI Update");
            }
            else
            {
                System.out.println("==========================================");
                System.out.println("SALAH MEMASUKKAN DATA");
                System.out.println("==========================================");
            }
        }
    }
}