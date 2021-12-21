package com.company;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class GameWindow extends JFrame {

    private JPanel layout, chessBoard, menu;
    private JButton[][] squares = new JButton[8][8];

    public GameWindow() {

        JFrame gameWindow = new JFrame("Chess");
        gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameWindow.setSize(1920,1080);
        gameWindow.setLayout(null);
        gameWindow.getContentPane().setBackground(Color.BLACK);

        layout = new JPanel();
        chessBoard = new JPanel();
        menu = new JPanel();

        layout.setBounds(60,30,800,800);
        chessBoard.setBounds(140,110,640,640);
        layout.setBackground(new Color(150,75,0));
        menu.setBounds(900,30,400,800);
        chessBoard.setLayout(new GridLayout(0,9));
        chessBoard.setBorder(new LineBorder(Color.black));

        gameWindow.add(chessBoard);
        gameWindow.add(layout);
        gameWindow.add(menu);
        gameWindow.setVisible(true);
    }
}
