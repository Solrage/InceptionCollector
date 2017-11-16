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
public class PanelBotonesColeccion extends JPanel {

    private JButton btnEditar;

    public PanelBotonesColeccion() {
        FlowLayout distribucion = new FlowLayout();
        this.setLayout(distribucion);
        this.btnEditar = new JButton("Editar");
        this.add(btnEditar);
    }
}
