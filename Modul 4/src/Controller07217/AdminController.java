package Controller07217;
import Entity07217.AdminEntity07217;

public class AdminController implements ControllerInterface {
    
    int indexLogin = 0;
    public AdminController(){
    }
    public void dataAdmin()
    {
        String nama[] = {"yoga","nanda"};
        String password[] = {"01","02"};
        for(int i=0;i<nama.length;i++)
        {
            AllObjectModel.adminModel.insertAdmin(new AdminEntity07217(nama[i],password[i]));
        }
    }
    public AdminEntity07217 adminEntity(){
        return AllObjectModel.adminModel.showDataAdmin(indexLogin);
    }
    public void viewAdmin(){
        AllObjectModel.adminModel.view();
    }
    @Override
    public void login (String nama , String password){
        AllObjectModel.adminModel.cekData(nama ,password);
    }    
}
