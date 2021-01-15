package Model07217;
import Entity07217.BarangEntity;
import java.util.ArrayList;
public class BarangModel {
    public ArrayList<BarangEntity> databarang;
    
    public BarangModel(){
        databarang = new ArrayList<BarangEntity>();
    }
    public void insertBarang (BarangEntity barang){
        databarang.add(barang);
    }
    public void view()
    {
        
        for (BarangEntity barang : databarang)
        {
            System.out.println("Nama  Barang = "+barang.getNamabarang());
            System.out.println("Harga Barang = "+barang.getHarga());
            System.out.println("Stok  Barang = "+barang.getStok());
            System.out.println("==========================================");
        }
    }
    public void hapus(String namabarang)
    {
        for(int i=0;i<databarang.size();i++)
        {
            if(namabarang.equals(databarang.get(i).getNamabarang()))
            {
                databarang.remove(i);
                System.out.println("Barang Telah Di Hapus");
                System.out.println("==========================================");
            }
            else
            {
                System.out.println("BARANG TIDAK TERSEDIA");
                System.out.println("==========================================");
            }
        }
        
    }
    public void update(String namabarang,String newharga,String newstok)
    {
        for(int i=0;i<databarang.size();i++)
        {
            if(namabarang.equals(databarang.get(i).getNamabarang()))
            {
                databarang.get(i).harga=newharga;
                databarang.get(i).stok=newstok;
                System.out.println("Data Telah DI Update");
                System.out.println("==========================================");
            }
        }
    }
    public void update1(String namabarang,String newharga,String newstok){
        for(int i=0;i<databarang.size();i++)
                {
                    if(namabarang.equals(databarang.get(i).getNamabarang()))
                    {
                        update(namabarang,newharga,newstok);
                    }
                    else
                    {
                        System.out.println("BARANG TIDAK TERSEDIA");
                        System.out.println("==========================================");
                    }
                }
    }
    
}
