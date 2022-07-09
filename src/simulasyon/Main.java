/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simulasyon;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author emir7
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Simulation panel = new Simulation();
        JFrame jf = new JFrame();
        jf.setResizable(false);
       jf.add(panel);
       jf.setBackground(Color.WHITE);
       //jf.setLocationRelativeTo(null);
       jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       jf.setSize(800, 700);
       jf.setVisible(true);
        
    }
    
}
