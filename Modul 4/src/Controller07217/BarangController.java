package Controller07217;
import Entity07217.BarangEntity;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;
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
     public void updatebarang(String namabarang,String newharga,String newstok) {
        AllObjectModel.barang.update(namabarang, newharga, newstok);
    }
    
    public BarangEntity getdatabarang(int index){
        return AllObjectModel.barang.getDatabarang(index);
    }
    public BarangEntity barangEntity(){
        return AllObjectModel.barang.getBarang(index1);
    }
    public DefaultTableModel daftarbarang(){
        DefaultTableModel dtmdaftarbarang = new DefaultTableModel();
        Object[] kolom = {"index", "Nama Barang", "Harga", "Jumlah Stok"};
        dtmdaftarbarang.setColumnIdentifiers(kolom);
        int size = AllObjectModel.barang.alldatabarang().size();
        for (int i = 0; i < size; i++){
             Object[] data = new Object[10];
            data[0] = i;
            data[1] = AllObjectModel.barang.alldatabarang().get(i).getNamabarang();
            data[2] = AllObjectModel.barang.alldatabarang().get(i).getHarga();
            data[3] = AllObjectModel.barang.alldatabarang().get(i).getStok();
            dtmdaftarbarang.addRow(data);
        }
        return dtmdaftarbarang;
    }
}
