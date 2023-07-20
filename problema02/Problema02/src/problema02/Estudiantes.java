/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema02;

/**
 *
 * @author sofiv
 */
public class Estudiantes {

    String nombre;
    String apellido;
    double calificaciones1;
    double calificaciones2;
    double calificaciones3;
    double promedio;

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerApellido(String a) {
        apellido = a;
    }

    public void establecerCalificaciones1(double c1) {
        calificaciones1 = c1;
    }

    public void establecerCalificaciones2(double c2) {
        calificaciones2 = c2;
    }

    public void establecerCalificaciones3(double c3) {
        calificaciones3 = c3;
    }

    public void establecerPromedio() {
        promedio = (calificaciones1 + calificaciones2 + calificaciones3) / 3;
    }

    public String toString() {
        String cadena = String.format("%s %s\n"
                + "Calificaciones:\n"
                + "%.2f\n"
                + "%.2f\n"
                + "%.2f\n"
                + "Promedio: %.2f\n", nombre, apellido, calificaciones1,
                calificaciones2, calificaciones3, promedio);
        return cadena;
    }

}
