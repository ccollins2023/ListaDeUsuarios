package com.misoft.listadeusuarios;

public class Usuario {
    private String nombre;
    private int edad;

    // Constructor para inicializar los atributos
    public Usuario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos getters para acceder a los atributos
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}

