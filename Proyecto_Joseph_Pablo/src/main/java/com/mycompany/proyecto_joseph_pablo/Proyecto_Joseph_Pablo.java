/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto_joseph_pablo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;


/**
 *
 * @author jescribano
 */
public class Proyecto_Joseph_Pablo{
    
    public static void main(String[] args) {
        
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
          
        
        JPanel panel = new JPanel();
        
        JLabel matricula = new JLabel("Matricula"); 
        JTextField tfMatricula = new JTextField(10);
        JLabel marca = new JLabel("Marca");
        JTextField tfMarca = new JTextField(10);
        JLabel modelo = new JLabel("Modelo");
        JTextField tfModelo = new JTextField(10);
        JLabel pintura = new JLabel("Pintura");
        JTextField tfPintura = new JTextField(10);
        JLabel ruedas = new JLabel("Ruedas");
        JTextField tfRuedas = new JTextField(10);
        JLabel Km = new JLabel("Km");
        JTextField tfKm = new JTextField(10);
        JLabel conductor = new JLabel("Conductor");
        JTextField tfConductor = new JTextField(10);
        
        panel.add(matricula);
        panel.add(tfMatricula);
        panel.add(marca);
        panel.add(tfMarca);
        panel.add(modelo);
        panel.add(tfModelo);
        panel.add(pintura);
        panel.add(tfPintura);
        panel.add(ruedas);
        panel.add(tfRuedas);
        panel.add(Km);
        panel.add(tfKm);
        panel.add(conductor);
        panel.add(tfConductor);
        
        frame.add(panel);
        JButton guardar = new JButton("Guardar");       
        JButton cancelar = new JButton("Cancelar");
        
        //Usuario
        
             
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
        frame.setSize(200, 175);
        frame.setLayout(new FlowLayout());
        JButton btnAceptar = new JButton("Aceptar");
        JButton btnCancelar = new JButton("Cancelar");
        JLabel lblNombre = new JLabel("Nombre");
        JLabel lblApellidos = new JLabel("Apellidos");
        JLabel lblDNI = new JLabel("DNI");
        JLabel lblEdad = new JLabel("Edad");
        JTextField txtNombre = new JTextField();
        txtNombre.setColumns(10);
        JTextField txtApellidos = new JTextField();
        txtApellidos.setColumns(10);
        JTextField txtDNI = new JTextField();
        txtDNI.setColumns(12);
        JTextField txtEdad = new JTextField();
        txtEdad.setColumns(12);
        frame.getContentPane().add(lblNombre);
        frame.getContentPane().add(txtNombre);
        frame.getContentPane().add(lblApellidos);
        frame.getContentPane().add(txtApellidos);
        frame.getContentPane().add(lblDNI);
        frame.getContentPane().add(txtDNI);
        frame.getContentPane().add(lblEdad);
        frame.getContentPane().add(txtEdad);
        frame.getContentPane().add(btnAceptar);
        frame.getContentPane().add(btnCancelar);
        btnAceptar.addActionListener((ActionEvent e) -> {
            System.out.println("Aceptar");
        });
        btnCancelar.addActionListener((ActionEvent e) -> {
            System.out.println("Cancelar");
        });
        frame.setVisible(true);   
        
        
        guardar.addActionListener((ActionEvent e) -> {
            System.out.println("Guardar");
        });
        
        cancelar.addActionListener((ActionEvent e) -> {
            System.out.println("Cancelar");
        });
    }

   
}
