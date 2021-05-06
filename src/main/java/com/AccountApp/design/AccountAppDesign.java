package com.AccountApp.design;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AccountAppDesign {
    private JButton button_msg;
    private JPanel JPanelMain;

    public AccountAppDesign() {
        button_msg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Hello my app");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("AccountAppDesign");
        frame.setContentPane(new AccountAppDesign().JPanelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
