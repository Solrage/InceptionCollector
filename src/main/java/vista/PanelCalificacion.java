package vista;

import java.awt.ComponentOrientation;
import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class PanelCalificacion extends JPanel{
    private JRadioButton boton1;
    private JRadioButton boton2;
    private JRadioButton boton3;
    private JRadioButton boton4;
    private JRadioButton boton5;

    public PanelCalificacion() {
        FlowLayout distribucion = new FlowLayout();
        this.setLayout(distribucion);
        this.boton1 = new JRadioButton("1", false);
        this.boton1.setHorizontalAlignment(JRadioButton.LEADING);
        this.boton1.setVerticalTextPosition(JRadioButton.TOP);
        this.boton1.setHorizontalTextPosition(JRadioButton.CENTER);
        this.boton1.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        this.add(boton1);
        this.boton2 = new JRadioButton("2", false);
        this.boton2.setHorizontalAlignment(JRadioButton.LEADING);
        this.boton2.setVerticalTextPosition(JRadioButton.TOP);
        this.boton2.setHorizontalTextPosition(JRadioButton.CENTER);
        this.boton2.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        this.add(boton2);
        this.boton3 = new JRadioButton("3", false);
        this.boton3.setHorizontalAlignment(JRadioButton.LEADING);
        this.boton3.setVerticalTextPosition(JRadioButton.TOP);
        this.boton3.setHorizontalTextPosition(JRadioButton.CENTER);
        this.boton3.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        this.add(boton3);
        this.boton4 = new JRadioButton("4", false);
        this.boton4.setHorizontalAlignment(JRadioButton.LEADING);
        this.boton4.setVerticalTextPosition(JRadioButton.TOP);
        this.boton4.setHorizontalTextPosition(JRadioButton.CENTER);
        this.boton4.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        this.add(boton4);
        this.boton5 = new JRadioButton("5", false);
        this.boton5.setHorizontalAlignment(JRadioButton.LEADING);
        this.boton5.setVerticalTextPosition(JRadioButton.TOP);
        this.boton5.setHorizontalTextPosition(JRadioButton.CENTER);
        this.boton5.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        this.add(boton5);
        ButtonGroup bGroup = new ButtonGroup();
        bGroup.add(boton1);
        bGroup.add(boton2);
        bGroup.add(boton3);
        bGroup.add(boton4);
        bGroup.add(boton5);
    }
    
    
}
