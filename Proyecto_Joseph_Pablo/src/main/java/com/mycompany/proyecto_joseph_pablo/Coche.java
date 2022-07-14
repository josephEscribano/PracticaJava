/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_joseph_pablo;

/**
 *
 * @author jescribano
 */
public class Coche {
    private String matricula;
    private String marca;
    private String modelo;
    private String pintura;
    private String ruedas;
    private int km;
    private Usuario usuario;

    public Coche(String matricula, String marca, String modelo, String pintura, String ruedas, int km, Usuario usuario) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.pintura = pintura;
        this.ruedas = ruedas;
        this.km = km;
        this.usuario = usuario;
    }
    
    
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPintura() {
        return pintura;
    }

    public void setPintura(String pintura) {
        this.pintura = pintura;
    }

    public String getRuedas() {
        return ruedas;
    }

    public void setRuedas(String ruedas) {
        this.ruedas = ruedas;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
}
