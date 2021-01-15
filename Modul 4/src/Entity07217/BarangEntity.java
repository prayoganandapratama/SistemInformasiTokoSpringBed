package Entity07217;

public class BarangEntity {
    public String namabarang,stok,harga;
    
    public BarangEntity(String namabarang,String harga,String stok){
        this.namabarang = namabarang;
        this.harga = harga;
        this.stok = stok;
    }

    public BarangEntity() {
    }

    public String getNamabarang() {
        return namabarang;
    }
    
    public String getHarga() {
        return harga;
    }

    public String getStok() {
        return stok;
    }

}
