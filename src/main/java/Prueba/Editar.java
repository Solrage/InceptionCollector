/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author SolRage
 */
@SuppressWarnings({"serial", "unused"})
public class Editar extends JFrame implements ActionListener {

    private Inicio ventanaInicio;

    private JPanel panelEditar;
    private JLabel lbFoto;
    private JTextField txtTitulo;
    private JTextField txtImagen;

    private JButton btnGuardar;
    private JButton btnCancelar;

    public Editar(Inicio ventanaInicio) {
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

        this.setSize(530, 520);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("InceptionCollector");
        try{
            initPanelEditar();
        }catch (Exception e){
            e.printStackTrace();
        }
        this.setVisible(true);
        this.requestFocus();
    }

    private void initPanelEditar() throws Exception{
        panelEditar = new JPanel();
        panelEditar.setLayout(new BorderLayout());
        panelEditar.setBorder(new EmptyBorder(20, 20, 20, 20));
        panelEditar.setPreferredSize(new Dimension(280, 520));
        this.add(panelEditar, BorderLayout.CENTER);

        JLabel lbEmpty = new JLabel(" ");

        JLabel lblTitulo = new JLabel("Titulo");
        txtTitulo = new JTextField();
        txtTitulo.setBackground(Color.WHITE);
        txtTitulo.setEditable(false);

        JLabel lblImagen = new JLabel("Imagen");
        txtImagen = new JTextField();
        txtImagen.setBackground(Color.WHITE);
        txtImagen.setEditable(false);

        btnGuardar = new JButton("Guardar");
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.addActionListener((ActionListener) this);

        btnCancelar = new JButton("Cancelar");
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.addActionListener((ActionListener) this);

        JPanel panelDatos = new JPanel();
        panelDatos.setLayout(new GridLayout(7, 1));
        panelDatos.add(lblTitulo);
        panelDatos.add(txtTitulo);
        panelDatos.add(lblImagen);
        panelDatos.add(txtImagen);
        panelEditar.add(panelDatos, BorderLayout.CENTER);

        JPanel panelInferior = new JPanel();
        panelInferior.setLayout(new BorderLayout());
        panelEditar.add(panelInferior, BorderLayout.SOUTH);

        JPanel panelBotonesInferior = new JPanel();
        panelBotonesInferior.setBorder(new EmptyBorder(20, 0, 0, 0));
        panelBotonesInferior.setLayout(new GridLayout(1, 4));
        panelBotonesInferior.add(btnGuardar);
        panelBotonesInferior.add(lbEmpty);
        panelBotonesInferior.add(btnCancelar);
        panelInferior.add(panelBotonesInferior, BorderLayout.SOUTH);
    }

    public void actionPerformed(ActionEvent e) {
         if(btnGuardar == e.getSource()){
             
         }else if(btnGuardar == e.getSource()){
             
         }
    }

    public Inicio getVentanaInicio() {
        return ventanaInicio;
    }
}
