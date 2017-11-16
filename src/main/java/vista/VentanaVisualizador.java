/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.GridLayout;
import javax.swing.JFrame;

/**
 *
 * @author SolRage
 */
public class VentanaVisualizador  extends JFrame{
     private JFrame parent;
     
     private PanelVisualizador panelVisual;

    public VentanaVisualizador() {
        GridLayout distribucion = new GridLayout(12,1);
        this.setLayout(distribucion);
        this.setTitle("Inception Collector");
        this.setSize(300, 520);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(this);
        this.setResizable(false);
        
        this.panelVisual = new PanelVisualizador();
        this.add(panelVisual);
        this.setVisible(true);
        
    }
     
      public void abrirVentana(JFrame parent){
        this.parent = parent;
        this.parent.dispose();
      }
}
