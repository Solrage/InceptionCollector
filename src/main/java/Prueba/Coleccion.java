/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author SolRage
 */
public class Coleccion extends JFrame implements ActionListener {

    private Inicio ventanaInicio;

    private JPanel panelColeccion;
    private JButton btnVisual;

    private JPanel panelInferior;
    private JButton btnEditar;

    public Coleccion(Inicio ventanaInicio) {
        this.ventanaInicio = ventanaInicio;
        initComponents();

    }

    private void initComponents() {
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                ventanaInicio.setVisible(true);
                Coleccion.this.dispose();
            }
        });

        this.setSize(850, 520);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("InceptionCollector");
        try{
            initPanelColeccion();
//            initPanelInferior();
        }catch(Exception e){
            e.printStackTrace();
        }
        this.setVisible(true);
        this.requestFocus();
    }

    private void initPanelColeccion() throws Exception{
//        panelColeccion = new JPanel();
//        panelColeccion.setBorder(new EmptyBorder(20, 20, 20, 20));
//        panelColeccion.setLayout(new BorderLayout());
//        panelColeccion.setPreferredSize(new Dimension(280, 520));
//        this.add(panelColeccion, BorderLayout.CENTER);
//
//        btnVisual = new JButton();
//        btnVisual.setLayout(new GridLayout(2, 5, 15, 5));
//        btnVisual.setPreferredSize(new Dimension(50,25));
//        btnVisual.add(new JButton(""));
//        panelColeccion.add(btnVisual);
//        this.add(panelColeccion, BorderLayout.CENTER);
    }

//    private void initPanelInferior() {
//
////        btnEditar = new JButton();
////        btnEditar.setContentAreaFilled(false);
////        btnEditar.setToolTipText("Editar");
////        btnEditar.addActionListener((ActionListener) this);
////        panelInferior.add(btnEditar, BorderLayout.SOUTH);
////
////        JPanel panelBotonInferior = new JPanel();
////        panelBotonInferior.setBorder(new EmptyBorder(20,0,0,0));
////        panelBotonInferior.setLayout(new GridLayout(1,4));
////        panelBotonInferior.add(btnEditar);
////        panelBotonInferior.add(panelBotonInferior, BorderLayout.SOUTH);
//    }

    public void actionPerformed(ActionEvent e) {
        if (btnEditar == e.getSource()) {
        }
    }
}
