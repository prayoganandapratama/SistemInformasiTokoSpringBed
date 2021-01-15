package Entity07217;

public class PelangganEntity07217 extends AbstractEntity07217 {
    String alamat;
    String no_telp;
    
    public PelangganEntity07217(String nama,String password,String alamat, String no_telp){
        super (nama,password);
        this.alamat = alamat;
        this.no_telp = no_telp;
    }
    
    @Override
     public String getNama(){
         return nama;
     }
     public String getAlamat() {
        return alamat;
    }
    public String getNoTelp() {
        return no_telp;
    }
}
