/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author david.agudeloo
 */
public class Estacion {
    //atributos:
    private ArrayList<Bicicleta> bicicletas = new ArrayList<>();
    private String color;
    private int sizeMax=25;
    
    //constructor:
    public Estacion(String color) {
        this.color = color;
        for (int i = 0; i < 20 ; i++){
            bicicletas.add(new Bicicleta(color, i+1));
        }
    }
    
    //métodos:
    public Bicicleta retirarBici(){
        return bicicletas.remove(0);
    }
    
    public void ingresarBici(Bicicleta bici){
        if(bicicletas.size()<25){
            bicicletas.add(bici);
        }
        else{
            System.out.println("La estación está llena. Busque otra :(");
        }
        
    }
}
