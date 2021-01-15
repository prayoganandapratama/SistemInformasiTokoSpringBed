package View07217;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class GUI07217Home {
   JFrame LogReg = new JFrame();
   JLabel top,image;
   JButton login,reg;
    public GUI07217Home(){
        
        LogReg.setSize(700, 630);
        LogReg.setLayout(null);
        LogReg.getContentPane().setBackground(Color.GRAY);
        top = new JLabel("              Selamat Datang    ");
        top.setBounds(50, 10, 600, 50);
        top.setFont(new Font("Times New Roman",Font.ITALIC,40));
        LogReg.add(top);
        top = new JLabel("          Toko SpringBed Teddy    ");
        top.setBounds(50, 80, 600, 50);
        top.setFont(new Font("Times New Roman",Font.ITALIC,40));
        LogReg.add(top);
        //button 
       reg = new JButton("Daftar Akun");
       reg.setBounds(200, 200, 300, 50);
       reg.setFont(new Font("Consolas",Font.BOLD,20));
       reg.setBackground(Color.LIGHT_GRAY);
       LogReg.add(reg);
       login = new JButton("Login");
       login.setBounds(200, 300, 300, 50);
       login.setFont(new Font("Consolas",Font.BOLD,20));
       login.setBackground(Color.LIGHT_GRAY);
       LogReg.add(login); 
        
        
        
        
        LogReg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LogReg.setVisible(true);
        LogReg.setLocationRelativeTo(null);
        
        reg.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) {
                        GUI07217Daftar register = new GUI07217Daftar();
                        LogReg.dispose();                
            }            
        });
        login.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) {
                        GUI07217Login register = new GUI07217Login();
                        LogReg.dispose();                
            }            
        });
    }
    
}
