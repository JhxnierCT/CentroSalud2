/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package espoch.edu.ec.centrodesalud2;

import java.util.Scanner;

/**
 *
 * @author SO-LAB1-PC21
 */
public class CentrodeSalud2 {

    public static void main(String[] args) {
        CentroSalud centro = new CentroSalud();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENÚ CENTRO DE SALUD ---");
            System.out.println("1. Registrar paciente");
            System.out.println("2. Atender emergencia");
            System.out.println("3. Atender consulta general");
            System.out.println("4. Mostrar pacientes registrados");
            System.out.println("5. Mostrar reporte final");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    centro.registrarPaciente(sc);
                    break;
                case 2:
                    centro.atenderEmergencia();
                    break;
                case 3:
                    centro.atenderConsulta();
                    break;
                case 4:
                    centro.mostrarPacientesRegistrados();
                    break;
                case 5:
                    centro.mostrarReporteFinal();
                    break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);

        sc.close();
    }
}
    

