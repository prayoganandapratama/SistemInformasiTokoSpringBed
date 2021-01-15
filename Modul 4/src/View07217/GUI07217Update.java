package View07217;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.*;
public class GUI07217Update {
    JFrame update1 = new JFrame();
    JLabel update2,labelnamabarang,labelharga,labelstok;
    JTextField textnamabarang,textharga,textstok;
    JButton update,back;
    public GUI07217Update(int index){
        update1.setSize(700, 650);
        update1.setLayout(null);
        update1.getContentPane().setBackground(Color.GRAY);
        labelnamabarang= new JLabel("Nama Barang");
        labelnamabarang.setBounds(250, 210, 200, 30);
        update1.add(labelnamabarang);
        textnamabarang = new JTextField();
        textnamabarang.setBounds(250, 240, 200, 30);
        update1.add(textnamabarang);
        labelharga= new JLabel("Harga");
        labelharga.setBounds(250, 270, 200, 30);
        update1.add(labelharga);
        textharga = new JTextField();
        textharga.setBounds(250, 320, 200, 30);
        update1.add(textharga);
        labelstok= new JLabel("Stok");
        labelstok.setBounds(250, 360, 100, 30);
        update1.add(labelstok);
        textstok = new JTextField();
        textstok.setBounds(250, 400, 200, 30);
        update1.add(textstok);
        
        update = new JButton("Update");
        update.setBounds(500, 520, 100, 30);
        update.setFont(new Font("Arial",Font.BOLD,15));
        update.setBackground(Color.YELLOW);
        update1.add(update);
        back = new JButton("back");
        back.setBounds(100, 520, 80, 30);
        back.setFont(new Font("Arial",Font.BOLD,12));
        back.setBackground(Color.ORANGE);
        update1.add(back);
        
        update1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        update1.setVisible(true);
        update1.setLocationRelativeTo(null);
        
        textnamabarang.setText(allobjctrl07217.barang.getdatabarang(index).getNamabarang());
        textnamabarang.setText(allobjctrl07217.barang.getdatabarang(index).getHarga());
        textnamabarang.setText(allobjctrl07217.barang.getdatabarang(index).getStok());
        
        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String newharga = textharga.getText();
                String newstok = textstok.getText();
                allobjctrl07217.barang.updatebarang(textnamabarang.getText(), textharga.getText(),textstok.getText());
                JOptionPane.showMessageDialog(null, "Data Telah DiPerbarui", "information", JOptionPane.INFORMATION_MESSAGE);
                kosong();
            }
        });
        back.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) {
                update1.dispose();
                GUI07217Admin gui = new GUI07217Admin();
            }         
        });
        
    }
    void kosong() {
        textharga.setText(null);
        textstok.setText(null);
    }
}    
