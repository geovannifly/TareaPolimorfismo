/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.tareapolimorfismo;

/**
 *
 * @author cpere
 */
public class TareaPolimorfismo {

    public static void main(String[] args) {
        CarritoCompras carrito = new CarritoCompras();

        Producto libro = new Libro("El Quijote", "Cervantes", 864, 0.5);
        Producto electronico = new Electronico("iPhone 14", "Apple", 12, 0.2);
        Producto digital = new ProductoDigital("Curso de Java", "PDF", 450.50);

        carrito.agregarProducto(libro);
        carrito.agregarProducto(electronico);
        carrito.agregarProducto(digital);

        
        System.out.println(libro.getNombre());
        System.out.println(electronico.getNombre());
        System.out.println(digital.getNombre());
        
        System.out.println("Precio total del carrito: " + carrito.calcularTotal());


    }
}
