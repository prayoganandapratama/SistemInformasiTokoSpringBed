package Model07217;
import Entity07217.PelangganEntity07217;
import java.util.ArrayList;
public class PelangganModel07217 implements ModelInterface07217 {
    private ArrayList<PelangganEntity07217> pelangganEntityArrayList;
    
    public PelangganModel07217()
    {
        pelangganEntityArrayList = new ArrayList<PelangganEntity07217>();
    }
    
    public void insertPelanggan(PelangganEntity07217 pelanggan)
    {
        pelangganEntityArrayList.add(pelanggan);
    }
    
    @Override
    public void view(){
        for(PelangganEntity07217 pelanggan : pelangganEntityArrayList)
        {
            System.out.print(pelanggan.getNama());
            System.out.print(pelanggan.getPassword());
            System.out.print(pelanggan.getAlamat());
            System.out.print(pelanggan.getNoTelp());
            System.out.println();
        }
    }

    public int cekData(String nama, String password){
        int loop = 0;
        while (!pelangganEntityArrayList.get(loop).getNama().equals(nama) && 
                !pelangganEntityArrayList.get(loop).getPassword().equals(password)){
            loop++;
        }
        return loop;
    }
}
