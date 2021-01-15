package Entity07217;

public class AdminEntity07217 extends AbstractEntity07217 {
    
     public AdminEntity07217(String nama,String password) {
        super (nama,password);
    }
     @Override
     public String getNama(){
         return nama;
     }
}