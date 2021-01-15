package View07217;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class GUI07217Hapus {
    JFrame del = new JFrame();
    JLabel delete1,namabaranglabel;
    JTextField textnamabarangdelete;
    JButton delete,back;
    
    public GUI07217Hapus(){
        del.setSize(500, 500);
        del.setLayout(null);
        del.getContentPane().setBackground(Color.GRAY);
        delete1 = new JLabel("Delete");
        delete1.setBounds(160, 30, 600, 50);
        delete1.setFont(new Font("Times New Roman",Font.BOLD,30));
        del.add(delete1);        
        namabaranglabel = new JLabel("Nama Barang");
        namabaranglabel.setBounds(150, 80, 100, 30);
        namabaranglabel.setFont(new Font("Consolas",Font.BOLD,15));
        del.add(namabaranglabel);
        textnamabarangdelete = new JTextField();
        textnamabarangdelete.setBounds(150, 120, 200, 30);
        del.add(textnamabarangdelete);
        delete = new JButton("Delete");
        delete.setBounds(200, 180, 100, 40);
        delete.setFont(new Font("Arial",Font.BOLD,15));
        delete.setBackground(Color.YELLOW);
        del.add(delete);
        back = new JButton("back");
        back.setBounds(30, 360, 80, 30);
        back.setFont(new Font("Arial",Font.BOLD,12));
        back.setBackground(Color.ORANGE);
        del.add(back);
        
        
        del.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        del.setVisible(true);
        del.setLocationRelativeTo(null);
        back.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) {
                del.dispose();
                GUI07217Admin gui = new GUI07217Admin();
            }         
        });
        delete.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                try{
                        allobjctrl07217.barang.hapus(textnamabarangdelete.getText());                        
                        JOptionPane.showMessageDialog(null,"Data Berhasil Di Hapus","information",JOptionPane.INFORMATION_MESSAGE);
                     }catch(Exception exception){
                        JOptionPane.showMessageDialog(null,"Barang Tidak Tersedia","information",JOptionPane.INFORMATION_MESSAGE);
                        
            }
       
    }
});
}
}
