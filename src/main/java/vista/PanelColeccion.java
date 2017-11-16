/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author SolRage
 */
public class PanelColeccion extends JPanel {

    private JPanel panelColeccion;
    private PanelSubColeccion panelSub;

    public PanelColeccion() {

            panelColeccion = new JPanel(new GridLayout(5, 2, 20, 5));
            
            panelSub = new PanelSubColeccion();
            this.add(panelColeccion);
            
        }
    }
