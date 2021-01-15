package View07217;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class GUI07217Login {
    JFrame LogReg = new JFrame();
    JLabel top,image,namalogin,passwordlogin;
    JButton login,back;
    JRadioButton radioadmin,radiopelanggan;
    JTextField textpasswordlogin,textnamalogin;
    JPasswordField passwordlogin1;
    private boolean ceklogin = false;
    public GUI07217Login(){
        LogReg.setSize(700, 630);
        LogReg.setLayout(null);
        LogReg.getContentPane().setBackground(Color.GRAY);
        top = new JLabel("                  Selamat Datang    ");
        top.setBounds(50, 10, 600, 50);
        top.setFont(new Font("Times New Roman",Font.ITALIC,40));
        LogReg.add(top);
        top = new JLabel("                      Login Akun    ");
        top.setBounds(50, 80, 600, 50);
        top.setFont(new Font("Times New Roman",Font.ITALIC,40));
        LogReg.add(top);
        //button 
        radioadmin = new JRadioButton("Admin");
        radioadmin.setBounds(220, 180, 100, 30);
        radioadmin.setBackground(Color.CYAN);
        LogReg.add(radioadmin);
        //buttonpraktikan
        radiopelanggan = new JRadioButton("Pelanggan");
        radiopelanggan.setBounds(380, 180, 100, 30);
        radiopelanggan.setBackground(Color.CYAN);
        LogReg.add(radiopelanggan);
        
        namalogin = new JLabel("Nama");
        namalogin.setBounds(250, 210, 200, 30);
        LogReg.add(namalogin);
        textnamalogin = new JTextField();
        textnamalogin.setBounds(250, 240, 200, 30);
        LogReg.add(textnamalogin);
        passwordlogin = new JLabel("Password");
        passwordlogin.setBounds(250, 270, 200, 30);
        LogReg.add(passwordlogin);
        passwordlogin1 = new JPasswordField();
        passwordlogin1.setBounds(250, 300, 200, 30);
        LogReg.add(passwordlogin1);
        
        login = new JButton("Login");
        login.setBounds(500, 520, 80, 30);
        login.setFont(new Font("Arial",Font.BOLD,15));
        login.setBackground(Color.CYAN);
        LogReg.add(login);
       
        back = new JButton("Back");
        back.setBounds(100, 520, 80, 30);
        back.setFont(new Font("Arial",Font.BOLD,15));
        back.setBackground(Color.CYAN);
        LogReg.add(back);
       
        LogReg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LogReg.setVisible(true);
        LogReg.setLocationRelativeTo(null);
       
       back.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) {
                LogReg.dispose();
                GUI07217Home gui = new GUI07217Home();
            }         
        });
       radioadmin.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(ActionEvent ae) {
               if (radioadmin.isSelected()){
                   radiopelanggan.setSelected(false);
                   ceklogin = true;
               }
            }
        });
        radiopelanggan.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (radiopelanggan.isSelected()){
                   radioadmin.setSelected(false);
                   ceklogin = false;
               }
            }
            
        });
       login.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (ceklogin==true){
                    try{
                        allobjctrl07217.admin.dataAdmin();
                        allobjctrl07217.admin.login(textnamalogin.getText(), passwordlogin.getText());
                        String nama = allobjctrl07217.admin.adminEntity().getNama();
                        JOptionPane.showMessageDialog(null,"Selamat Datang "+nama,"information",JOptionPane.INFORMATION_MESSAGE);
                        GUI07217Admin admin = new GUI07217Admin();
                        LogReg.dispose();                        
                    }catch(Exception exception){
                        JOptionPane.showMessageDialog(null,"Nama atau password salah","information",JOptionPane.INFORMATION_MESSAGE);
                        kosong();
                    }
                }else{
                    try{
                        allobjctrl07217.pelanggan.login(textnamalogin.getText(), passwordlogin.getText());
                        String nama = allobjctrl07217.pelanggan.pelangganEntity().getNama();
                        JOptionPane.showMessageDialog(null,"Selamat Datang "+nama,"information",JOptionPane.INFORMATION_MESSAGE);
                        GUI07217Pelanggan pelangan = new GUI07217Pelanggan();
                        LogReg.dispose();
                    }catch(Exception exception){
                        JOptionPane.showMessageDialog(null,"Nama atau password salah","information",JOptionPane.INFORMATION_MESSAGE);
                        kosong();
                    }
                }
            }
        });
       
    }
    void kosong(){
       
        textnamalogin.setText(null);
        passwordlogin.setText(null);
    }
}
