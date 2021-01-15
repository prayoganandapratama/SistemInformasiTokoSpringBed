package View07217;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GUI07217Daftar {
    JFrame LogReg = new JFrame();
    JTextField textnamalogin,textnotelp,textalamat;
    JLabel top,labelnotelp,labelalamat,labelnamadaftar,labelpassworddaftar;
    JPasswordField passworddaftar;
    JButton login,daftar,back;
    public GUI07217Daftar() {
        LogReg.setSize(700, 650);
        LogReg.setLayout(null);
        LogReg.getContentPane().setBackground(Color.GRAY);
        top = new JLabel("    Daftar Akun     ");
        top.setBounds(150, 60, 600, 50);
        top.setFont(new Font("Consolas",Font.BOLD,40));
        LogReg.add(top);
        labelnamadaftar= new JLabel("Nama");
        labelnamadaftar.setBounds(250, 210, 100, 30);
        LogReg.add(labelnamadaftar);
        textnamalogin = new JTextField();
        textnamalogin.setBounds(250, 240, 200, 30);
        LogReg.add(textnamalogin);
        labelpassworddaftar= new JLabel("Password");
        labelpassworddaftar.setBounds(250, 270, 100, 30);
        LogReg.add(labelpassworddaftar);
        passworddaftar = new JPasswordField();
        passworddaftar.setBounds(250, 300, 200, 30);
        LogReg.add(passworddaftar);
        labelnotelp = new JLabel("No Telepon");
        labelnotelp.setBounds(250, 330, 100, 30);
        LogReg.add(labelnotelp);
        textnotelp = new JTextField();
        textnotelp.setBounds(250, 360, 200, 30);
        LogReg.add(textnotelp);
        labelalamat = new JLabel("alamat");
        labelalamat.setBounds(250, 390, 200, 30);
        LogReg.add(labelalamat);
        textalamat = new JTextField();
        textalamat.setBounds(250, 420, 200, 30);
        LogReg.add(textalamat);
        
        daftar = new JButton("Daftar");
        daftar.setBounds(500, 520, 80, 30);
        daftar.setFont(new Font("Arial",Font.BOLD,15));
        daftar.setBackground(Color.GREEN);
        LogReg.add(daftar);
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
        
        daftar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae){ 
            try{
                String nama = textnamalogin.getText();
                String password = passworddaftar.getText();
                String alamat = textalamat.getText();
                int no_telp = textnotelp.getColumns();
                allobjctrl07217.pelanggan.insertPelanggan(nama, password, alamat,no_telp);
                JOptionPane.showMessageDialog(null, "Registrasi Sukses","information",JOptionPane.INFORMATION_MESSAGE);
                kosong();
            }catch(Exception exception){
                JOptionPane.showMessageDialog(null, "Format Penulisan Salah","Registrasi Gagal",JOptionPane.INFORMATION_MESSAGE);
                kosong();
            }
            }
        });
        
    }
    void kosong(){
        textnamalogin.setText(null);
        passworddaftar.setText(null);
        textalamat.setText(null);
        textnotelp.setText(null);
    }
}
