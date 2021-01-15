package View07217;
import Entity07217.BarangEntity;
import Controller07217.BarangController;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class GUI07217ViewAdmin {
    private static BarangController databarang = new BarangController();
    JFrame view = new JFrame();
    JTable tabel = new JTable();
    JScrollPane scrollbarang = new JScrollPane(tabel);
    JLabel barang;
    JButton back,update;
    public int index;
    public GUI07217ViewAdmin(){
        view.setSize(720, 600);
        view.setLayout(null);
        view.getContentPane().setBackground(Color.PINK);
        barang = new JLabel("Data Barang");
        barang.setFont(new Font("Times New Roman",Font.BOLD,30));
        barang.setBounds(90, 30, 200, 30);
        view.add(barang);
        scrollbarang.setBounds(50, 80, 580, 380);
        tabel.setModel(databarang.daftarbarang());
        view.add(scrollbarang);
        update = new JButton("Update");
        update.setBounds(400, 520, 100, 30);
        update.setFont(new Font("Arial",Font.BOLD,15));
        update.setBackground(Color.CYAN);
        view.add(update);
        back = new JButton("Back");
        back.setBounds(100, 520, 80, 30);
        back.setFont(new Font("Arial",Font.BOLD,15));
        back.setBackground(Color.CYAN);
        view.add(back);
        view.setVisible(true);
        view.setLocationRelativeTo(null);
        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                view.dispose();
                GUI07217Update update = new GUI07217Update(index);
            }
        });
        back.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) {
                view.dispose();
                GUI07217Admin gui = new GUI07217Admin();
            }         
        });
    }
}
