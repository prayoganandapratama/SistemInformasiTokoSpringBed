package Controller07217;
import Entity07217.BarangEntity;
public class BarangController {
    int index1 = 0;
    public BarangController(){
    }
    public void insert(String namabarang,String harga,String stok){
        AllObjectModel.barang.insertBarang(new BarangEntity(namabarang,harga,stok));
    }
    public void viewbarang(){
        AllObjectModel.barang.view();
    }
    public void hapus(String namabarang){
        AllObjectModel.barang.hapus(namabarang);
    }
    public void update(String namabarang,String harga,String stok){
        AllObjectModel.barang.update1(namabarang, harga, stok);
    }
}
