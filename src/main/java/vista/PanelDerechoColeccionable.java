package vista;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class PanelDerechoColeccionable extends JPanel{
    private JLabel subTitulo;
    private JTextArea descripcion;
    
    public PanelDerechoColeccionable() {
        BoxLayout distribucion = new BoxLayout(this,BoxLayout.Y_AXIS);
        this.setLayout(distribucion);
        this.subTitulo = new JLabel("                          descripcion");
        this.subTitulo.setHorizontalAlignment(JLabel.CENTER);
        this.add(subTitulo);
        this.descripcion = new JTextArea(225, 400);
        this.add(descripcion);
    }
}
