/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareapolimorfismo;

/**
 *
 * @author cpere
 */
public class Libro extends ProductoFisico {

    private String autor;
    private String nombre;
    private int numPaginas;

    public Libro(String autor, String nombre, int numPaginas, double peso) {
        super(peso);
        this.autor = autor;
        this.nombre = nombre;
        this.numPaginas = numPaginas;
    }

    @Override
    public String getNombre() {
        return "Libro: " + nombre + " - " + numPaginas + " páginas";
    }

    @Override
    public double getPrecio() {
        return numPaginas * 0.05;
    }

}
