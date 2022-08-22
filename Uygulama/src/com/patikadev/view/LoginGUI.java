package com.patikadev.view;

import com.patikadev.helper.Config;
import com.patikadev.helper.Helper;
import com.patikadev.model.Operator;
import com.patikadev.model.User;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginGUI extends JFrame {

    private JPanel wrapper;
    private JPanel wtop;
    private JPanel wbottom;
    private JTextField fld_user_uname;
    private JTextField fld_user_pass;
    private JButton btn_login;

    public LoginGUI(){
        add(wrapper);
        setSize(400,400);
        setLocation(Helper.screenCenterPoint("x", getSize()) ,Helper.screenCenterPoint("y", getSize()));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setResizable(false);
        setVisible(true);
        btn_login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Helper.isFieldEmpty(fld_user_uname) || Helper.isFieldEmpty(fld_user_pass)){
                    Helper.showMessage("fill");
                }else {
                    User u = User.getFetch(fld_user_uname.getText(),fld_user_pass.getText());
                    if(u == null){
                        Helper.showMessage("Kullanıcı bulunamadı");
                    }else {
                        switch (u.getType()){
                            case "operator":
                                OperatorGui opGUI = new OperatorGui((Operator) u);
                                break;
                            case "educator":
                                EducatorGUI edGUI = new EducatorGUI();
                                break;
                            case "student":
                                StudentGUI stGUI = new StudentGUI();
                                break;
                        }
                        dispose();
                    }
                }
            }
        });
    }

    public static void main(String[] args) {
        Helper.setLayout();
        LoginGUI login = new LoginGUI();
    }


}
