package Controller07217;
import Entity07217.PelangganEntity07217;
public class PelangganController implements ControllerInterface{
    AllObjectModel allobject = new AllObjectModel();
    int indexLogin = 0;
    public PelangganController(){
        }
    
    @Override
    public void login (String nama , String password){
        AllObjectModel.pelangganModel.cekData(nama, password);
    }
    public void insertPelanggan (String nama,String password,String alamat,int no_telp){
        PelangganEntity07217 pelangganModel = new PelangganEntity07217(nama, password, alamat, no_telp);
        allobject.pelangganModel.insertPelanggan(pelangganModel);
    }
    public PelangganEntity07217 pelangganEntity(){
        return AllObjectModel.pelangganModel.getPelangganEntityArrayList(indexLogin);
    }
}
