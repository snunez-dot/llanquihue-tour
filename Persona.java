package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * Clase identifica a personas.
 * 
 */
public class Persona {
    private String nombre;
    private Rut rut;
    private Direccion direccion;

/**
 * 
 * @param nombre Nombre del cliente.
 * @param rut Rut del cliente.
 * @param direccion Dirección del cliente.
 */
    
    public Persona(String nombre, Rut rut, Direccion direccion) {
        this.nombre = nombre;
        this.rut = rut;
        this.direccion = direccion;
    }

/**
 * Data de persona, texto.
 * @return 
 */
    
    @Override
    public String toString() {
        return "Nombre: " + nombre + " | RUT: " + rut + "\nDireccion: " + direccion.toString();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Rut getRut() {
        return rut;
    }

    public void setRut(Rut rut) {
        this.rut = rut;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

}