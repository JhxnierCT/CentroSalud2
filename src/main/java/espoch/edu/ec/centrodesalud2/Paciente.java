/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espoch.edu.ec.centrodesalud2;

/**
 *
 * @author SO-LAB1-PC21
 */
public class Paciente {
    static int contadorID = 1;
    int id;
    String nombre;
    int edad;
    String cedula;
    String tipoAtencion; // "EMERGENCIA" o "CONSULTA"

    public Paciente(String nombre, int edad, String cedula, String tipoAtencion) {
        this.id = contadorID++;
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
        this.tipoAtencion = tipoAtencion;
    }

    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Edad: " + edad +
               ", Cédula: " + cedula + ", Tipo: " + tipoAtencion;
    }
    
}
    

