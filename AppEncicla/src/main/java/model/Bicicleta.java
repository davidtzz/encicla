/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author david.agudeloo
 */
public class Bicicleta {
    //atributos:
    private String color;
    private int numero;
    private Persona person;
    private String estacion;
    //adicional;
    //private boolean varada;
    
    //constructor:

    public Bicicleta() {
    }

    public Bicicleta(String color, int numero) {
        this.color = color;
        this.numero = numero;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Persona getPerson() {
        return person;
    }

    public void setPerson(Persona person) {
        this.person = person;
    }

    public String getEstacion() {
        return estacion;
    }

    public void setEstacion(String estacion) {
        this.estacion = estacion;
    }

    @Override
    public String toString() {
        return "Bicicleta{" + "color=" + color + ", numero=" + numero + ", person=" + person + ", estacion=" + estacion + '}';
    }
    
    
}
