/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
/**
 *
 * @author SolRage
 */
public class PanelBotonEditar extends JPanel{
    
    private JButton btnGuardar;
    private JButton btnCancelar;
    
    public PanelBotonEditar(){
        FlowLayout distribucion = new FlowLayout();
        this.setLayout(distribucion);
        this.btnGuardar = new JButton("Guardar");
        this.add(btnGuardar);
        this.btnCancelar = new JButton("Cancelar");
        this.add(btnCancelar);
    }
}
