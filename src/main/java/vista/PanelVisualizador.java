/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author SolRage
 */
public class PanelVisualizador extends JPanel {

    private JButton[] arrBtn = new JButton[6];
    private JPanel panelVisual;
    private JLabel lblVisual;

    public PanelVisualizador() {
        lblVisual = new JLabel();
        lblVisual.setText("");

        panelVisual = new JPanel(new GridLayout(5, 2, 20, 5));
        

        for (int i = arrBtn.length - 1; i >= 0; i--) {
            arrBtn[i] = new JButton("" + (i + 1));
            panelVisual.add(arrBtn[i]);
            this.add(panelVisual);
        }
    }
}
