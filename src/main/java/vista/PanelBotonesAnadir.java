package vista;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelBotonesAnadir extends JPanel{
    private JButton botonAnadir;
    private JButton botonCancelar;

    public PanelBotonesAnadir() {
        FlowLayout distribucion = new FlowLayout();
        this.setLayout(distribucion);
        this.botonAnadir = new JButton("añadir");
        this.add(botonAnadir);
        this.botonCancelar = new JButton("cancelar");
        this.add(botonCancelar);
    }
    
    
}
