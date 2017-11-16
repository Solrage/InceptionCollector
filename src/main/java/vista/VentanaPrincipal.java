package vista;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaPrincipal extends JFrame {

    private ImageIcon imagen;
    private JLabel im;
    private JButton iniciar;

    public VentanaPrincipal() {
        BorderLayout distribucion = new BorderLayout();
        this.setLayout(distribucion);
        setTitle("Inception Collector");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        this.imagen = new ImageIcon("imagen\\logo.jpg");
        this.im = new JLabel();
        this.im.setIcon(imagen);
        this.add(im, BorderLayout.CENTER);
        this.im.setHorizontalAlignment(JLabel.CENTER);
        this.iniciar = new JButton("iniciar");
        this.iniciar.addActionListener(
                (ActionEvent e) -> {
                    abrirVentana();
                }
        );
        this.add(iniciar, BorderLayout.SOUTH);
        this.iniciar.setHorizontalAlignment(JLabel.CENTER);
        this.setVisible(true);
    }

    private void abrirVentana() {
        VentanaAnadirColeccionable nuevaVentana = new VentanaAnadirColeccionable();
        VentanaColeccionable nuevaVentana2 = new VentanaColeccionable();
        VentanaEditar nuevaVentana3 = new VentanaEditar();
        VentanaColeccion nuevaVentana4 = new VentanaColeccion();
        VentanaVisualizador nuevaVentana5 = new VentanaVisualizador();
        nuevaVentana2.abrirVentana(this);
        nuevaVentana3.abrirVentana(this);
        nuevaVentana4.abrirVentana(this);
        nuevaVentana5.abrirVentana(this);
    }
}
