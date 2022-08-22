package swinggui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Example extends JFrame {
    private JPanel wrapper;
    private JPanel wtop;
    private JTextField fld_username;
    private JTextField fld_password;
    private JButton btn_login;

    public Example(){

        for(UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()){
            if("Nimbus".equals(info.getName())){
                try {
                    UIManager.setLookAndFeel(info.getClassName());
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (InstantiationException e) {
                    throw new RuntimeException(e);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (UnsupportedLookAndFeelException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        setContentPane(wrapper);
        setSize(450,350);
        setTitle("Uygulama Adı");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Açık olan uygulamayı kapatmak için kullanılır
        setResizable(false);

        int x = (Toolkit.getDefaultToolkit().getScreenSize().width - getSize().width) / 2;  // Uygulamanın ekranda görüneceği konumu belirliyoruz
        int y = (Toolkit.getDefaultToolkit().getScreenSize().height - getSize().height) / 2;  // Yaptığımız işlem ekranı ortalayacak şekilde çalışır
        setLocation(x,y);

        setVisible(true);

        btn_login.addActionListener(new ActionListener() { // Kullanılan inteface fonksiyonel interface olduğu için lambda kullanılabilir
            @Override
            public void actionPerformed(ActionEvent e) {
                if(fld_username.getText().length() == 0 || fld_password.getText().length() == 0){
                    JOptionPane.showMessageDialog(null,"Tüm alanları doldurun", "Hata" , JOptionPane.INFORMATION_MESSAGE);
                }


            }
        });
    }
}
