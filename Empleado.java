package model;
import model.Persona;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author keisi
 */



public class Empleado extends Persona {
    private String cargo;
    public Empleado(String nombre, Rut rut, Direccion direccion, String cargo) {
        super(nombre, rut, direccion); //
        this.cargo = cargo;
    }
    
/**
 * Super, texto escrito de cargo.
 * @return 
 */
    
    @Override
    public String toString() {
        return super.toString() + "\nCargo:" + cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    
}
    
    

