package Application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Submit extends JFrame implements ActionListener{
    String name;
    JButton start,back;
    Submit(String name){
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel welcome = new JLabel("Welcome "+name+" to Simple Mind");
        welcome.setBounds(60, 20, 300, 45);
        welcome.setFont( new Font("Arial", Font.BOLD,18));
        welcome.setForeground(new Color(255,123,234));
        add(welcome);

        JLabel rules = new JLabel();
        rules.setBounds(20, 80, 600, 450);
        rules.setFont( new Font("Times New Roman", Font.BOLD,18));
        rules.setText(
            "<html>"+ 
                "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
                "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
                "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
                "4. Crying is allowed but please do so quietly." + "<br><br>" +
                "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
                "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
                "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
            "<html>"
        );
        add(rules);

        back = new JButton("Back");
        back.setBounds(480, 500, 80, 30);
        back.setBackground(new Color(255, 99, 71));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        start = new JButton("start");
        start.setBounds(180, 500, 80, 30);
        start.setBackground(new Color(255, 99, 71));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);

        setSize(800,650);
        setVisible(true);
        setLocation(300, 120);
    }

    public void actionPerformed(ActionEvent ae ){
        if(ae.getSource() == start){
            setVisible(false);
            new Quiz(name);
        } else if (ae.getSource() == back){
            setVisible(false);
            new Login();
        }
    }
    public static void main(String[] args) {
        new Submit("User");
    }
}
