/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebagui4;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Angel
 */
public class Ventana1 extends JFrame{
    private JTextField campo1,campo2,campo3;
    private JPasswordField pass;
    private String contra;

    public Ventana1(){
        super("Prueaba de JTextField y JPasswordField");
        this.setLayout(new FlowLayout());
        campo1 = new JTextField(10);
        add(campo1);
        campo2 = new JTextField("Escribeme aquí");
        add(campo2);
        campo3 = new JTextField("Campo de texto no editable",21);
        add(campo3);
        pass=new JPasswordField("Texto Oculto");
        add(pass);
        
        ManejadorCampoTexto manejar =new ManejadorCampoTexto();
        campo1.addActionListener(manejar);
        campo2.addActionListener(manejar);
        campo3.addActionListener(manejar);
        pass.addActionListener(manejar);
    }
      
    private class ManejadorCampoTexto implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String cadena="";
            if(e.getSource()==campo1){
                contra=String.format("%s",e.getActionCommand());
                cadena=String.format("CampoTexto1: %s",e.getActionCommand());                    
            }else if(e.getSource()==campo2){
                cadena=String.format("CampoTexto2: %s",e.getActionCommand());
            }else if(e.getSource()==campo3){
                cadena=String.format("CampoTexto3: %s",e.getActionCommand());
            }else if(e.getSource()==pass){
                if(e.getActionCommand().equals(contra)){
                    cadena="Contraseña valida";
                }
                else{
                    cadena="Contraseña invalida";
                }
                
            }
            JOptionPane.showMessageDialog(null, cadena);
        
    }
    
}
}
