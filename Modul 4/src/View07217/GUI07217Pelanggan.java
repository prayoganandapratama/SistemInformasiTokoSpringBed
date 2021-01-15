package View07217;
import Entity07217.BarangEntity;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class GUI07217Pelanggan {
    JFrame pelanggan = new JFrame();
    JButton back,view;
    JTextArea area = new JTextArea();
    public GUI07217Pelanggan(){
        pelanggan.setSize(720, 600);
        pelanggan.setLayout(null);
        pelanggan.getContentPane().setBackground(Color.GRAY);
        
        view = new JButton("view");
        view.setBounds(200, 200, 300, 50);
        view.setBackground(Color.GREEN);
        pelanggan.add(view);
        back = new JButton("back");
        back.setBounds(200, 300, 300, 50);
        back.setBackground(Color.CYAN);
        pelanggan.add(back);
        
        pelanggan.setVisible(true);
        pelanggan.setLocationRelativeTo(null);
        pelanggan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        back.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) {
                pelanggan.dispose();
                GUI07217Login gui = new GUI07217Login();
            }         
        });
        view.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                pelanggan.dispose();
                GUI07217ViewPelanggan gui = new GUI07217ViewPelanggan();
            }
        });
        
    }
   
}
