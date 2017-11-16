package vista;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelIzquierdoColeccionable extends JPanel{
    private JLabel imagen;
    private JTextField calificacion;
    private ImageIcon im;
    private SubPanelColeccionable subPanel;
    
    public PanelIzquierdoColeccionable(){
        BoxLayout distribucion = new BoxLayout(this,BoxLayout.Y_AXIS);
        this.setLayout(distribucion);
        this.imagen = new JLabel();
        this.im = new ImageIcon("imagen\\logo.jpg");
        this.imagen.setIcon(im);
        this.add(imagen);
        this.calificacion = new JTextField();
        this.calificacion.setEnabled(false);
        this.add(calificacion);
        this.subPanel = new SubPanelColeccionable();
        this.add(subPanel);
    }
}
