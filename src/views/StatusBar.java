/*
 * File: StatusBar.java
 * Created Date: 2021-09-24 13:51:43
 * Author: Sallai Andras
 * Github: https://github.com/andteki
 * -----
 * Last Modified: 2022-11-21
 * Modified By: Nyiri István
 * -----
 * Copyright (c) 2021 Sallai Andras
 * 
 * GNU GPL v2
 */

package views;

import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

public class StatusBar extends JPanel {
   
    // Ezen lesz a státuszsáv
    JLabel statusLabel;

    // Ez az osztály konstruktora
    public StatusBar(int width) {        
        setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
        size(width, 25);
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
       
        statusLabel = new JLabel("Kész");
        this.setmessage("Kész");
        this.add(statusLabel);
    } // A StatusBar konstruktor vége
    
    //Ez állítja be a méretét státuszsornak
    public void size(int x, int y) {
        // A setMaximumSize() függvény csak Demension osztály képes fogadni

        setMaximumSize(new Dimension(x, y));
        setMinimumSize(new Dimension(x, y));
        setPreferredSize(new Dimension(x, y));
    } //A size függvény vége

    //A státuszsor tartalmát állítjuk be
    public void setmessage(String message) {
        // A statusz üzenetnek külön függvényt csináltunk.
        this.statusLabel.setText(message);
    }
}
