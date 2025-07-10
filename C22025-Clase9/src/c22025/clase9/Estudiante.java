/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c22025.clase9;

/**
 *
 * @author viti
 */
public class Estudiante {
    private String nombre;
    private int cedula;
    private String carnet;

    public Estudiante(String nombre, int cedula, String carnet) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.carnet = carnet;
    }
    
    public void grita(){
        System.out.println("estoy gritando por dentro");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", cedula=" + cedula + ", carnet=" + carnet + '}';
    }
    
    
    
    
}
