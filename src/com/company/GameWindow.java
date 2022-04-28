package com.company;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class GameWindow extends JFrame {

    private JPanel layout, chessBoard, menu;
    private JButton[][] squares = new JButton[8][8];
    private JButton numbers, letters;

    public GameWindow() {

        JFrame gameWindow = new JFrame("Chess");
        gameWindow.setSize(1920,1080);
        gameWindow.setLayout(null);
        gameWindow.getContentPane().setBackground(Color.BLACK);

        chessBoard = new JPanel();
        menu = new JPanel();

        chessBoard.setBounds(140,110,640,640);
        menu.setBounds(900,110,500,640);
        menu.setBackground(Color.BLACK);
        menu.setBorder(new LineBorder(Color.WHITE));
        chessBoard.setLayout(new GridLayout(0,8));
        chessBoard.setBorder(new LineBorder(Color.BLACK));



        for (int i = 0; i < 8; i++){
            numbers = new JButton();
            for (int j = 0; j < 8; j++) {
                squares[i][j] = new JButton();
                if ((i+j) % 2 == 0) {
                    squares[i][j].setBackground(Color.WHITE);
                }
                else {
                    squares[i][j].setBackground(Color.BLACK);
                }

                // Kanskje endre for loop slik at det blir lettere å legge til brikker, og flytte brikker
                // Fiks plassering for brikker

                JButton b=new JButton(new ImageIcon("C:\\Users\\sanje_8hf4b1p\\chess\\resources\\wpawn.png"));
                b.setSize(80,80);
                b.setOpaque(false);
                b.setContentAreaFilled(false);
                b.setBorderPainted(false);
                gameWindow.add(b);

                chessBoard.add(squares[i][j]);


            }

            numbers.setText(String.valueOf(i+1));
            numbers.setBounds(60, 670-(80*i), 80,80);
            numbers.setOpaque(false);
            numbers.setContentAreaFilled(false);
            numbers.setBorderPainted(false);

            letters = new JButton();
            letters.setText(String.valueOf((char)(i+65)));
            letters.setBounds(140+(80*i), 30,80,80);
            letters.setOpaque(false);
            letters.setContentAreaFilled(false);
            letters.setBorderPainted(false);

            gameWindow.add(letters);
            gameWindow.add(numbers);
        }

        gameWindow.add(chessBoard);
        gameWindow.add(menu);
        gameWindow.setVisible(true);
        gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
