package com.darkrain.app.frame;

import javax.swing.*;
import java.awt.*;

/**
 * Created by laurentc on 22/04/15.
 */
public class MainFrame extends JFrame {

    public MainFrame()
    {
        initUI();
    }

    private void initUI()
    {
        JButton newGame = new JButton("Nouvelle partie");
        JButton continueGame = new JButton("Continuer");
        JButton admin = new JButton("Administration");

        GridLayout gdl = new GridLayout(0, 3);
        setLayout(gdl);
        add(newGame);
        add(continueGame);
        add(admin);

        setTitle("PapeRPGen");
        setSize(600, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
