package Model07217;

import Entity07217.AdminEntity07217;
import java.util.ArrayList;
public class AdminModel07217 implements ModelInterface07217
{
        
        private ArrayList<AdminEntity07217> adminEntityArrayList;
        
        public AdminModel07217()
    {
        adminEntityArrayList = new ArrayList<AdminEntity07217>();
    }
        public void insertAdmin(AdminEntity07217 admin)
    {
        adminEntityArrayList.add(admin);
    }
    @Override
    public void view()
    {
        for (AdminEntity07217 admin : adminEntityArrayList)
        {
            System.out.print(admin.getNama());
            System.out.print(admin.getPassword());
            System.out.println();
        }
    }
    public int cekData(String nama, String password){
        int loop = 0;
        for(AdminEntity07217 admin : adminEntityArrayList){
            if(admin.getNama().equals(nama) && admin.getPassword().equals(password)){
            break;
            }else{
                loop++;
            }
        }
        return loop;
   }
}
