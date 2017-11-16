package vista;

import java.awt.ComponentOrientation;
import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class PanelEstado extends JPanel{
    private JRadioButton noIniciado;
    private JRadioButton iniciado;
    private JRadioButton terminado;
    private JRadioButton noAplica;
    
    public PanelEstado() {
        FlowLayout distribucion = new FlowLayout();
        this.setLayout(distribucion);
        this.noIniciado = new JRadioButton("no iniciado", false);
        this.noIniciado.setHorizontalAlignment(JRadioButton.LEADING);
        this.noIniciado.setVerticalTextPosition(JRadioButton.TOP);
        this.noIniciado.setHorizontalTextPosition(JRadioButton.CENTER);
        this.noIniciado.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        this.add(noIniciado);
        this.iniciado = new JRadioButton("iniciado", false);
        this.iniciado.setHorizontalAlignment(JRadioButton.LEADING);
        this.iniciado.setVerticalTextPosition(JRadioButton.TOP);
        this.iniciado.setHorizontalTextPosition(JRadioButton.CENTER);
        this.iniciado.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        this.add(iniciado);
        this.terminado = new JRadioButton("terminado", false);
        this.terminado.setHorizontalAlignment(JRadioButton.LEADING);
        this.terminado.setVerticalTextPosition(JRadioButton.TOP);
        this.terminado.setHorizontalTextPosition(JRadioButton.CENTER);
        this.terminado.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        this.add(terminado);
        this.noAplica = new JRadioButton("no aplica", false);
        this.noAplica.setHorizontalAlignment(JRadioButton.LEADING);
        this.noAplica.setVerticalTextPosition(JRadioButton.TOP);
        this.noAplica.setHorizontalTextPosition(JRadioButton.CENTER);
        this.noAplica.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        this.add(noAplica);
        ButtonGroup bGroup = new ButtonGroup();
        bGroup.add(noIniciado);
        bGroup.add(iniciado);
        bGroup.add(terminado);
        bGroup.add(noAplica);
    }
    
}
