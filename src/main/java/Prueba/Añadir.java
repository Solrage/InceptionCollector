/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author SolRage
 */
public class Añadir extends JFrame {

    private Inicio ventanaInicio;

    private JPanel panelAñadir;
    private JLabel lbFoto;
    private JTextField txtIdentificacion;
    private JTextField txtImagen;
    private JRadioButton rbEstado;
    private JRadioButton rbCalificacion;
    private JCheckBox cbObtenido;
    private JTextArea txtDescripcion;
    
    private JButton btnGuardar;
    private JButton btnCancelar;

    public Añadir(Inicio ventanaInicio) {
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
            initPanelAñadir();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.setVisible(true);
        this.requestFocus();
    }

    private void initPanelAñadir() throws Exception {
        
        panelAñadir = new JPanel();
        panelAñadir.setBorder(new EmptyBorder(20,20,20,20));
        panelAñadir.setLayout(new GridLayout(2,1,0,10));
        panelAñadir.setPreferredSize(new Dimension(300,520));
        this.add(panelAñadir, BorderLayout.CENTER);
        
        
    }
}
