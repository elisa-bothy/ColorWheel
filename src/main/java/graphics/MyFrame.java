/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graphics;

import java.awt.Color;
import java.awt.Dimension;
import java.beans.PropertyChangeListener;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Elisa Bothy
 */
public class MyFrame extends JFrame {
    MyColorChooser mcc;
    JPanel jp;
    Color chooseColor;
    public MyFrame(){
        mcc = new MyColorChooser();
        jp = new JPanel();
        initGui();
        
        this.pack();
        //centrer fenêtre
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }

    private void initGui() {
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        this.add(mcc);
        mcc.getSelectionModel().addChangeListener((ChangeEvent ce) -> {
            chooseColor = mcc.getColor();
            jp.setBackground(chooseColor);
        });
        
        System.out.println("chooseColor = " + chooseColor);
        jp.setPreferredSize(new Dimension(300, 400));
        this.add(jp);
    }
}
