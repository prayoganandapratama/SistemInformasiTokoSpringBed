package View07217;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class GUI07217Admin {
    JFrame admin = new JFrame();
    JButton input,back,hapus,view;
    
    public GUI07217Admin(){
        admin.setSize(720, 600);
        admin.setLayout(null);
        admin.getContentPane().setBackground(Color.GRAY);
        
        input = new JButton("Input Barang");
        input.setBounds(200, 100, 300, 50);
        input.setBackground(Color.GREEN);
        admin.add(input);
        
        view = new JButton("View");
        view.setBounds(200, 200, 300, 50);
        view.setBackground(Color.GREEN);
        admin.add(view);
        
        hapus = new JButton("Hapus");
        hapus.setBounds(200, 300, 300, 50);
        hapus.setBackground(Color.GREEN);
        admin.add(hapus);
        
        back = new JButton("back");
        back.setBounds(200, 500, 300, 50);
        back.setBackground(Color.CYAN);
        admin.add(back);
        
        admin.setVisible(true);
        admin.setLocationRelativeTo(null);
        admin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        input.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) {
                admin.dispose();
                GUI07217Barang gui = new GUI07217Barang();
            }         
        });
        back.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) {
                admin.dispose();
                GUI07217Login gui = new GUI07217Login();
            }         
        });
        view.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) {
                admin.dispose();
                GUI07217ViewAdmin gui = new GUI07217ViewAdmin();
            }         
        });
        hapus.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) {
                admin.dispose();
                GUI07217Hapus gui = new GUI07217Hapus();
            }         
        });
    }
    
}
