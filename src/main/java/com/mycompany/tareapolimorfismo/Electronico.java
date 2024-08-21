/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareapolimorfismo;

/**
 *
 * @author cpere
 */
public class Electronico extends ProductoFisico {

    private String nombre;
    private String marca;
    private int garantiaMeses;

    public Electronico(String nombre, String marca, int garantiaMeses, double peso) {
        super(peso);
        this.nombre = nombre;
        this.marca = marca;
        this.garantiaMeses = garantiaMeses;
    }

    @Override
    public String getNombre() {
        return "Electrónico: "+nombre+" - marca: " + marca + " - " + garantiaMeses + " meses de garantía";
    }

    @Override
    public double getPrecio() {
        return (1 + garantiaMeses * 0.02);
    }
}
