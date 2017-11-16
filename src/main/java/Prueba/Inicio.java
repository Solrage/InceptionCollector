/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author SolRage
 */

@SuppressWarnings({"serial","unused"})
public class Inicio extends JFrame implements ActionListener{
    
    private Datos datos;
    
    private Coleccion ventanaColeccion;
    private Detalle ventanaDetalle;
    private Añadir ventanaAñadir;
    private Editar ventanaEditar;
    private Visualizador ventanaVisualizador;

    private JLabel lbLogo;
    
    private JButton btnColeccion;
    private JButton btnDetalle;
    private JButton btnAñadir;
    private JButton btnEditar;
    private JButton btnVisualizador;

    public Inicio(Datos datos) {
        this.datos = datos;
        initComponents();

    }

    private void initComponents() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.setSize(600, 400);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("InceptionCollector");
        try{
            this.setIconImage((Image) ImageIO.read(this.getClass().getResource("/No Image250.png")));
        }catch (Exception e){
            e.printStackTrace();
        }
        this.setLayout(new BorderLayout());

        JPanel panelLogo = new JPanel();
        panelLogo.setLayout(new BorderLayout());
        panelLogo.setBorder(new EmptyBorder(10,10,10,10));
        
        JPanel panelBotones = new JPanel();
        panelBotones.setBorder(new EmptyBorder(20, 10, 20, 10));
        panelBotones.setLayout(new GridLayout(5, 1, 0, 10));

        
        btnColeccion = new JButton("Coleccion");
        btnColeccion.addActionListener((ActionListener)this);
        panelBotones.add(btnColeccion);
        
        btnDetalle = new JButton("Detalle");
        btnDetalle.addActionListener((ActionListener)this);
        panelBotones.add(btnDetalle);
        
        btnAñadir = new JButton("Añadir");
        btnAñadir.addActionListener((ActionListener)this);
        panelBotones.add(btnAñadir);
        
        btnEditar = new JButton("Editar");
        btnEditar.addActionListener((ActionListener)this);
        panelBotones.add(btnEditar);
        
        btnVisualizador = new JButton("Visualizador");
        btnVisualizador.addActionListener((ActionListener)this);
        panelBotones.add(btnVisualizador);
        
        this.add(panelBotones,BorderLayout.CENTER);
        
        this.setVisible(true);
        this.requestFocus();
    }
    
        public Datos getDatos(){
            return datos;
        }
    
        public void actionPerformed(ActionEvent e){
            if(btnColeccion == e.getSource()){
                ventanaColeccion = new Coleccion(this);
            }else if(btnDetalle == e.getSource()){
                ventanaDetalle = new Detalle(this);
            }else if (btnAñadir == e.getSource()){
                ventanaAñadir = new Añadir(this);
            }else if (btnEditar == e.getSource()){
                ventanaEditar = new Editar(this);
            }else if (btnVisualizador == e.getSource()){
                ventanaVisualizador = new Visualizador(this);
            this.dispose();
        }
}
}


