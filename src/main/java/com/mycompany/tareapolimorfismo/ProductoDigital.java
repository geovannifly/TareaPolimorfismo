/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareapolimorfismo;

/**
 *
 * @author cpere
 */
public class ProductoDigital implements Producto {

    private String nombre;
    private String formato;
    private double precio;

    public ProductoDigital(String nombre, String formato, double precio) {
        this.nombre = nombre;
        this.formato = formato;
        this.precio = precio;
    }

    @Override
    public String getNombre() {
        return "Producto Digital: "+nombre + ", formato: " + formato;
    }

    @Override
    public double getPrecio() {
        return precio;
    }
}
