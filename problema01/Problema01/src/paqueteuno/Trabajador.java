/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteuno;

/**
 *
 * @author sofiv
 */
public class Trabajador {

    private String cedula;
    private String nombres;
    private String correo;
    private double sueldo;
    private String mes;

    public String obtenerCedula() {
        return cedula;
    }

    public String obtenerNombres() {
        return nombres;
    }

    public String obtenerCorreo() {
        return correo;
    }

    public double obtenerSueldo() {
        return sueldo;
    }

    public String obtenerMes() {
        return mes;
    }

    public void establecerCedula(String c) {
        cedula = c;
    }

    public void establecerNombres(String n) {
        nombres = n;
    }

    public void establecerCorreo(String c) {
        correo = c;
    }

    public void establecerSueldo(double ss) {
        sueldo = ss;
    }

    public void establecerMes(String ms) {
        mes = ms;
    }
    public String toString(){
    String cadena = String.format("Cedula: %s\n"
            + "Nombre %s\n"
            + "Correo %s\n"
            + "Sueldo %.2f\n"
            + "Mes %s\n", cedula,nombres,correo,sueldo,mes);
    
    return cadena;
    }
}
