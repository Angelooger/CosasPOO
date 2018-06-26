/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaventanas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Angel
 */
public class PruebaVentanas extends JFrame implements ActionListener{

    private JButton boton1;
    
    public PruebaVentanas(){
        super("GUI básica");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        boton1=new JButton("Abrir una nueva ventana");
        
        boton1.addActionListener(this);
        boton1.setActionCommand("Open");
        add(boton1);
        this.setSize(300,300);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PruebaVentanas ventana= new PruebaVentanas();
        ventana.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando;
        comando=e.getActionCommand();
        if(comando.equals("Open")){
            this.dispose();
            new OtraVentana();
        }
    }
    
}
