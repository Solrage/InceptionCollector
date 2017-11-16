package vista;

import java.awt.FlowLayout;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JPanel;

public class SubPanelColeccionable extends JPanel{
    private JTextField estado;
    private JCheckBox obtenido;
    
    public SubPanelColeccionable(){
        FlowLayout distribucion = new FlowLayout();
        this.setLayout(distribucion);
        this.estado = new JTextField("iniciado");
        this.estado.setEnabled(false);
        this.add(estado);
        this.obtenido = new JCheckBox("obtenido");
        this.add(obtenido);
    }
}
