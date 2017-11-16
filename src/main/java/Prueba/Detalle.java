/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author SolRage
 */
public class Detalle extends JFrame {

    private Inicio ventanaInicio;

    private JPanel panelDetalle;

    private JPanel panelDescripcion;
    private JTextArea txtDescripcion;

    public Detalle(Inicio ventanaInicio) {
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
            initPanelDetalles();
            initPanelDescripcion();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.setVisible(true);
        this.requestFocus();
    }

    private void initPanelDetalles() {

    }

    private void initPanelDescripcion() {

        JLabel lblDescripcion = new JLabel("Descripcion");
        txtDescripcion = new JTextArea();
        txtDescripcion.setEditable(false);
        txtDescripcion.setRows(7);
        txtDescripcion.setLineWrap(true);
        txtDescripcion.setWrapStyleWord(true);

        JPanel panelDatos = new JPanel();
        panelDatos.setLayout(new GridLayout(7, 1));
        panelDatos.add(lblDescripcion);
        panelDescripcion.add(panelDatos, BorderLayout.WEST);
    }
}
