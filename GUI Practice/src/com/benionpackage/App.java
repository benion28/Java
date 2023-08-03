package com.benionpackage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private JButton registerButton;
    private JPanel panelMain;
    private JLabel firstNameLabel;
    private JTextField firstNameTextField;
    private JLabel lastNameLabel;
    private JTextField lastNameTextField;
    private JLabel usernameLabel;
    private JTextField usernameTextField;
    private JLabel password1Label;
    private JPasswordField password1Field;
    private JLabel password2Label;
    private JPasswordField password2Field1;
    private JRadioButton maleRadioButton;
    private JRadioButton femaleRadioButton;
    private JLabel genderLabel;
    private JLabel aboutLabel;
    private JTextArea aboutTextArea;
    private JCheckBox acceptCheckBox;

    public App() {
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hello From Benion");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new App().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
