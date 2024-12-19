package Application;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Login extends JFrame implements ActionListener{
    JButton submit,back;
    JTextField tfname;
    Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0,0,600,450);
        add(image);
        setVisible(true);

        JLabel Headings = new JLabel("Simple Minds");
        Headings.setBounds(700, 20, 300, 45);
        Headings.setFont( new Font("Arial", Font.BOLD,18));
        Headings.setForeground(new Color(255,123,234));
        add(Headings);

        JLabel name = new JLabel("Enter your name");
        name.setBounds(810, 80, 300, 45);
        name.setFont(new Font("Times New Roman", Font.BOLD, 14));
        name.setForeground(new Color(255,123,234));
        add(name);

        tfname = new JTextField();
        tfname.setBounds(780, 150, 200, 30);
        add(tfname);

        submit = new JButton("Submit");
        submit.setBounds(780, 200, 80, 30);
        submit.setBackground(new Color(255, 99, 71));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);

        back = new JButton("Back");
        back.setBounds(900, 200, 80, 30);
        back.setBackground(new Color(255, 99, 71));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        setSize(1200,500);
        setLocation(200,200);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == submit){
            String name = tfname.getText();
            setVisible(false);
            new Submit(name);
        } else if(ae.getSource() == back){
            setVisible(false);
        }
    }
    public static void main(String[] args) {
        new Login();
    }
}
