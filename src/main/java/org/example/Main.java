package org.example;
import java.awt.*;
import java.util.*;
import javax.swing.*;



public class Main extends JFrame {
    JLabel title;
    JTextArea text;
    public Main() throws FontFormatException {
        this.setSize(new Dimension(1000, 750));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setTitle("ABOUT ME");
        this.getContentPane().setBackground(Color.green);
        title = new JLabel("ABOUT ME ", JLabel.CENTER);
        title.setForeground(new Color(0x2039BA));
        title.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 50));
        text = new JTextArea("-DAVID PAN\n-I GO TO AGINCOURT CI AT THE TORONTO DISTRICT SCHOOL BOARD\n-MY FAVOURITE PROGRAMMING LANGUAGE IS PROBABLY JAVA CUZ IM MOST FAMILIAR WITH IT IDK THO\n-LEAST FAV SPORT IS PROB SWIMMING I DONT KNOW HOW TO SWIM AND IT AINT SO FUN TBH\n-DREAM JOB IS PROBABLY A GAME DEV\n-LEAST FAV SUBJECT IS DEF CS CUZ MY TEACHER IS KINDA MID\n-I WORKED A LOT DURING MY SUMMER");
        text.setLineWrap(true);
        text.setWrapStyleWord(true);
        text.setForeground(new Color(0x800000));
        text.setBackground(Color.yellow);
        text.setFont(new Font("Ariel", Font.BOLD, 25));
        text.setEditable(false);
        text.setCaretColor(Color.white);
        text.setHighlighter(null);
        text.setBorder(BorderFactory.createLineBorder(Color.blue, 10, true));

        this.add(title);
        title.setBounds(0, 20, 1000,200);
        this.add(text);
        text.setBounds(250, 150, 500, 500);
        this.setVisible(true);
    }
    public static void main(String[] args) throws FontFormatException {
        new Main();


    }
}