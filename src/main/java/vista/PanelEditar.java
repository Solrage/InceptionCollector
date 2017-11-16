/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author SolRage
 */
public class PanelEditar extends JPanel{
    private JLabel lblTitulo;
    private JTextField txtTitulo;
    private JLabel lblImagen;
    private JTextField txtImagen;
    
    public PanelEditar(){
        BoxLayout distribucion = new BoxLayout(this, BoxLayout.Y_AXIS);
        this.setLayout(distribucion);
        this.lblTitulo = new JLabel();
        this.add(lblTitulo);
        
        this.txtTitulo = new JTextField();
        this.txtTitulo.setEnabled(false);
        this.add(txtTitulo);
        
        this.lblImagen = new JLabel();
        this.add(lblImagen);
        
        this.txtImagen = new JTextField();
        this.txtImagen.setEnabled(false);
        this.add(txtImagen);
    }
            
    
   
        
}
