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

        chessBoard = new JPanel();
        menu = new JPanel();

        chessBoard.setBounds(140,110,640,640);
        menu.setBounds(900,110,500,640);
        menu.setBackground(Color.BLACK);
        menu.setBorder(new LineBorder(Color.WHITE));
        chessBoard.setLayout(new GridLayout(0,8));
        chessBoard.setBorder(new LineBorder(Color.BLACK));

        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++) {
                squares[i][j] = new JButton();
                if ((i+j) % 2 == 0) {
                    squares[i][j].setBackground(Color.WHITE);
                }
                else {
                    squares[i][j].setBackground(Color.BLACK);
                }
                chessBoard.add(squares[i][j]);
            }
        }

        gameWindow.add(chessBoard);
        gameWindow.add(menu);
        gameWindow.setVisible(true);
    }
}
