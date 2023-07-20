/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

/**
 *
 * @author sofiv
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Enlace c = new Enlace();
        c.establecerDataEstudiante();
        for (int i = 0; i < c.obtenerDataEstudiante().size(); i++) {
            System.out.printf("%s\n", c.obtenerDataEstudiante().get(i));
        }

    }

}
