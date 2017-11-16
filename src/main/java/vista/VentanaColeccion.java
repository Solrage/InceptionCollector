/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JFrame;

/**
 *
 * @author SolRage
 */
public class VentanaColeccion extends JFrame{
     private JFrame parent;
     
     private PanelColeccion panelColeccion;
     private PanelBotonesColeccion panelbtnColeccion;

    public VentanaColeccion() {
        GridLayout distribucion = new GridLayout(12,1);
        this.setLayout(distribucion);
        this.setPreferredSize(new Dimension(280,520));
        this.setTitle("Inception Collector");
        this.setSize(500, 520);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        
        this.panelColeccion = new PanelColeccion();
        this.add(panelColeccion);
        
        this.panelbtnColeccion = new PanelBotonesColeccion();
        this.add(panelbtnColeccion);
        this.setVisible(true);
    }
     
      public void abrirVentana(JFrame parent){
        this.parent = parent;
        this.parent.dispose();
      }
}
