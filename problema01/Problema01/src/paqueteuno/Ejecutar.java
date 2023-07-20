/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paqueteuno;

import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author sofiv
 */
public class Ejecutar {

    /**
     * @param args the command line arguments
     */
    // TODO code application logic here
    /*Generar un programa que permita ingresar por teclado información que 
        corresponde a sueldos de trabajadores. Por cada trabajador ingresar: 
        cédula, nombres, correo, sueldo, mes del sueldo.
La información debe quedar registrada en un base de datos.

El proceso de ingreso es iterativo hasta que el usuario decida lo contrario.*/
    public static void main(String[] args) throws SQLException {
        Scanner entrada = new Scanner(System.in);
        Enlace c = new Enlace();
        int opc = 4;
        while (opc != 0) {
            System.out.println("Ingresar el cedula del trabajador");
            String cedula = entrada.nextLine();
            System.out.println("Ingresar el nombre del trabajador");
            String nombre = entrada.nextLine();
            System.out.println("Ingresar el correo del trabajador");
            String correo = entrada.nextLine();
            System.out.println("Ingresar el sueldo del trabajador");
            double sueldo = entrada.nextDouble();
            entrada.nextLine();
            System.out.println("Ingresar el mes del pago del trabajador");
            String mes = entrada.nextLine();

            Trabajador tra = new Trabajador();
            tra.establecerNombres(nombre);
            tra.establecerCedula(cedula);
            tra.establecerCorreo(correo);
            tra.establecerSueldo(sueldo);
            tra.establecerMes(mes);
            c.insertarTrabajador((tra));
            c.establecerDataTrabajador();
            
            System.out.println("Para salir presione 0");
            opc = entrada.nextInt();
            entrada.nextLine();
           
        }
        for (int i = 0; i < c.obtenerDataTrabajador().size(); i++) {
            System.out.printf("%s\n", c.obtenerDataTrabajador().get(i));
        }

    }
}
