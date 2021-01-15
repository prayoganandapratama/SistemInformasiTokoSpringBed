package View07217;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class GUI07217Barang {
    JFrame input = new JFrame();
    JTextField textnamabarang,textharga,textstok;
    JLabel top,labelnamabarang,labelharga,labelstok;
    JButton back,clik;
    public GUI07217Barang(){
        input.setSize(700, 650);
        input.setLayout(null);
        input.getContentPane().setBackground(Color.GRAY);
        top = new JLabel("    Input Barang     ");
        top.setBounds(150, 60, 600, 50);
        top.setFont(new Font("Consolas",Font.BOLD,40));
        input.add(top);
        labelnamabarang= new JLabel("Nama Barang");
        labelnamabarang.setBounds(250, 210, 200, 30);
        input.add(labelnamabarang);
        textnamabarang = new JTextField();
        textnamabarang.setBounds(250, 240, 200, 30);
        input.add(textnamabarang);
        labelharga= new JLabel("Harga");
        labelharga.setBounds(250, 270, 200, 30);
        input.add(labelharga);
        textharga = new JTextField();
        textharga.setBounds(250, 320, 200, 30);
        input.add(textharga);
        labelstok= new JLabel("Stok");
        labelstok.setBounds(250, 360, 100, 30);
        input.add(labelstok);
        textstok = new JTextField();
        textstok.setBounds(250, 400, 200, 30);
        input.add(textstok);
        back = new JButton("Back");
        back.setBounds(100, 520, 80, 30);
        back.setFont(new Font("Arial",Font.BOLD,15));
        back.setBackground(Color.CYAN);
        input.add(back);
        
        clik = new JButton("Clik");
        clik.setBounds(500, 520, 80, 30);
        clik.setFont(new Font("Arial",Font.BOLD,15));
        clik.setBackground(Color.CYAN);
        input.add(clik);
        
        input.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        input.setVisible(true);
        input.setLocationRelativeTo(null);
        
        back.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) {
                input.dispose();
                GUI07217Admin gui = new GUI07217Admin();
            }         
        });
        clik.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                String namabarang = textnamabarang.getText();
                String harga = textharga.getText();
                String stok = textstok.getText();
                allobjctrl07217.barang.insert(namabarang, harga, stok);
                JOptionPane.showMessageDialog(null, "Data Telah di Inputkan","information",JOptionPane.INFORMATION_MESSAGE);
                kosong();
            }
            
        });
    }
    void kosong(){
        textnamabarang.setText(null);
        textharga.setText(null);
        textstok.setText(null);
    }
}
