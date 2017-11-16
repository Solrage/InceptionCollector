package vista;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaColeccionable extends JFrame{
    private JFrame parent;
    private JLabel titulo;
    private PanelIzquierdoColeccionable panelIzquierdo;
    private PanelDerechoColeccionable panelDerecho;
    
    public VentanaColeccionable() {
        BorderLayout distribucion = new BorderLayout();
        this.setLayout(distribucion);
        this.setTitle("Inception Collector");
        this.setSize(400, 475);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        
        this.titulo = new JLabel("TITULO");
        Font auxFont=titulo.getFont(); 
        titulo.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 30));
        this.titulo.setHorizontalAlignment(JLabel.CENTER);
        this.add(titulo, BorderLayout.NORTH);
        this.panelIzquierdo = new PanelIzquierdoColeccionable();
        this.panelIzquierdo.setPreferredSize(new Dimension(173, 100));
        this.add(panelIzquierdo, BorderLayout.WEST);
        this.panelDerecho = new PanelDerechoColeccionable();
        this.panelDerecho.setPreferredSize(new Dimension(223, 100));
        this.add(panelDerecho, BorderLayout.EAST);
        this.setVisible(true);
    }
    
    public void abrirVentana(JFrame parent){
        this.parent = parent;
        this.parent.dispose();
    }
}
