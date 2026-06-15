/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * Rut del usuario
 */
public class Rut {

    private String numero;

    public Rut(String numeroRUT) {
        if (!numeroRUT.matches("[0-9]+-[0-9Kk]")) {
            throw new IllegalArgumentException("Formato de RUT no válido.");
        }

        this.numero = numeroRUT;
    }

    public String getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return numero;
    }
}  
