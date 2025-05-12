/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espoch.edu.ec.centrodesalud2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author SO-LAB1-PC21
 */
public class CentroSalud {
    Stack<Paciente> pilaEmergencias = new Stack<>();
    Queue<Paciente> colaConsulta = new LinkedList<>();
    ArrayList<Paciente> listaDiaria = new ArrayList<>();
    ArrayList<Paciente> atendidosEmergencia = new ArrayList<>();
    ArrayList<Paciente> atendidosConsulta = new ArrayList<>();

    // Registrar paciente
    public void registrarPaciente(Scanner sc) {
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Edad: ");
        int edad = Integer.parseInt(sc.nextLine());
        System.out.print("Cédula: ");
        String cedula = sc.nextLine();
        System.out.print("Tipo de atencion (EMERGENCIA/CONSULTA): ");
        String tipoAtencion = sc.nextLine().toUpperCase();

        Paciente p = new Paciente(nombre, edad, cedula, tipoAtencion);
        listaDiaria.add(p);

        if (tipoAtencion.equals("EMERGENCIA")) {
            pilaEmergencias.push(p);
        } else {
            colaConsulta.add(p);
        }
        System.out.println("Paciente registrado: " + p);
    }

    // Atender paciente de emergencia
    public void atenderEmergencia() {
        if (!pilaEmergencias.isEmpty()) {
            Paciente atendido = pilaEmergencias.pop();
            atendidosEmergencia.add(atendido);
            System.out.println("Atendiendo emergencia: " + atendido);
        } else {
            System.out.println("No hay pacientes en emergencia.");
        }
    }

    // Atender paciente de consulta general
    public void atenderConsulta() {
        if (!colaConsulta.isEmpty()) {
            Paciente atendido = colaConsulta.poll();
            atendidosConsulta.add(atendido);
            System.out.println("Atendiendo consulta general: " + atendido);
        } else {
            System.out.println("No hay pacientes en consulta general.");
        }
    }

    // Mostrar todos los pacientes registrados en el día
    public void mostrarPacientesRegistrados() {
        System.out.println("Pacientes registrados hoy:");
        for (Paciente p : listaDiaria) {
            System.out.println(p);
        }
    }

    // Reporte final de pacientes atendidos por tipo
    public void mostrarReporteFinal() {
        System.out.println("\n--- Reporte Final ---");
        System.out.println("Pacientes atendidos en Emergencia:");
        for (Paciente p : atendidosEmergencia) {
            System.out.println(p);
        }
        System.out.println("Pacientes atendidos en Consulta General:");
        for (Paciente p : atendidosConsulta) {
            System.out.println(p);
        }
    }

    
}
