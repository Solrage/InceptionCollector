/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author SolRage
 */
public class Visualizador extends JFrame {

    private Inicio ventanaInicio;

    private JPanel panelVisualizador;

    public Visualizador(Inicio ventanaInicio) {
        this.ventanaInicio = ventanaInicio;
        initComponents();
    }

    private void initComponents() {
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                ventanaInicio.setVisible(true);
            }
        });

        this.setSize(850, 520);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("InceptionCollector");
        try {
            initPanelVisualizador();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.setVisible(true);
        this.requestFocus();

    }

    private void initPanelVisualizador() throws Exception {

    }
}
