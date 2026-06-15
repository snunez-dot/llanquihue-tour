package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 
 */
public class Direccion {
    private String calle;
    private String ciudad;
    private String region;
    private int numero;

    /**
     * Constructor clase Dirección
     * 
     * @param calle nombre de la calle de residencia del cliente.
     * @param ciudad ciudad de residencia del cliente.
     * @param region región de residencia del cliente.
     * @param numero número de la direccion de residencia del cliente.
     */
    
    public Direccion(String calle, String ciudad, String region, int numero) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.region = region;
        this.numero = numero;
    }
    
    /**
     * 
     * @return Dirección texto.
     */
    
    @Override 
    public String toString(){
        String info = calle + " " + numero + ", " + ciudad + ". " + "Region de " + region + ".";
        return info;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
} 
