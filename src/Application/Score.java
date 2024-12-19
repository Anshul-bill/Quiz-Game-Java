package Application;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Score extends JFrame implements ActionListener {

    Score(String name, int score){
        setBounds(400,150,750,550);
        setLayout(null);
        getContentPane().setBackground(Color.white);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,200,300,250);
        add(image);

        JLabel heading = new JLabel("Thank you "+name+" for playing");
        heading.setBounds(45, 30, 700, 30);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 26));
        add(heading);

        JLabel lblscore = new JLabel("Your Score is "+score);
        lblscore.setBounds(350, 200, 300, 30);
        lblscore.setFont(new Font("Tahoma", Font.PLAIN, 26));
        add(lblscore);
        setVisible(true);

        JButton submit = new JButton("Play Again");
        submit.setBounds(400,270,120,30);
        submit.addActionListener(this);
        add(submit);
    }

    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
    }
    public static void main(String[] args) {
        new Score("User",0);
    }
}
