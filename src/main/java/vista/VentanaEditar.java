/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author SolRage
 */
public class VentanaEditar extends JFrame{
    private JFrame parent;
    private JLabel lblTitulo;
    private JTextField txtTitulo;
    
    private JLabel lblImagen;
    private JTextField txtImagen;
    
    private PanelBotonEditar panelBotones;
    
    
    public VentanaEditar(){
        GridLayout distribucion = new GridLayout(12,1);
        this.setLayout(distribucion);
        this.setTitle("Inception Collector");
        this.setSize(280, 520);
        this.setResizable(false);
        this.setLocationRelativeTo(this);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        this.lblTitulo = new JLabel("Titulo");
        this.add(lblTitulo);
        this.txtTitulo = new JTextField();
        this.add(txtTitulo);
        
        this.lblImagen = new JLabel("Imagen");
        this.add(lblImagen);
        this.txtImagen = new JTextField();
        this.add(txtImagen);
        
        this.panelBotones = new PanelBotonEditar();
        this.add(panelBotones);
        this.setVisible(true);
        
    }
    
    public void abrirVentana(JFrame parent){
        this.parent = parent;
        this.parent.dispose();
    }
}
