package vista;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class VentanaAnadirColeccionable extends JFrame{
    private JFrame parent;
    private JLabel labelIdetificacion;
    private JTextField identificacion;
    private JLabel labelImagen;
    private JTextField imagen;
    private JLabel labelEstado;
    private PanelEstado panelEstado;
    private JLabel labelCalificacion;
    private PanelCalificacion panelCalificacion;
    private JLabel labelDescripcion;
    private JTextArea descripcion;
    private PanelBotonesAnadir panelBotones;

    public VentanaAnadirColeccionable() {
        GridLayout distribucion = new GridLayout(12,1);
        this.setLayout(distribucion);
        this.setTitle("Inception Collector");
        this.setSize(300, 530);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.labelIdetificacion = new JLabel("Identificacion");
        this.add(labelIdetificacion);
        this.identificacion = new JTextField();
        this.add(identificacion);
        this.labelImagen = new JLabel("Imagen");
        this.add(labelImagen);
        this.imagen = new JTextField();
        this.add(imagen);
        this.labelEstado = new JLabel("Estado");
        this.add(labelEstado);
        this.panelEstado = new PanelEstado();
        this.add(panelEstado);
        this.labelCalificacion = new JLabel("Calificacion");
        this.add(labelCalificacion);
        this.panelCalificacion = new PanelCalificacion();
        this.add(panelCalificacion);
        this.labelDescripcion = new JLabel("Descripcion");
        this.add(labelDescripcion);
        this.descripcion = new JTextArea();
        this.add(descripcion);
        this.panelBotones = new PanelBotonesAnadir();
        this.add(panelBotones);
        this.setVisible(true);
    }
    
    public void abrirVentana(JFrame parent){
        this.parent = parent;
        this.parent.dispose();
    }
    
}
