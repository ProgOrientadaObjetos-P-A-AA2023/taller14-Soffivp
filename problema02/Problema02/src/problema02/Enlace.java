
package problema02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author sofiv
 */
public class Enlace {

    private Connection conn;
    ArrayList<Estudiantes> lista = new ArrayList<>();

    public void establecerConexion() {

        try {
            // db parameters  
            String url = "jdbc:sqlite:bd/base001.base";
            // create a connection to the database  
            conn = DriverManager.getConnection(url);
            // System.out.println(conn.isClosed());
            // System.out.println("Connection to SQLite has been established.");  

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public Connection obtenerConexion() {
        return conn;
    }

    public void establecerDataEstudiante() {
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from estudiante;";

            ResultSet rs = statement.executeQuery(data);
            while (rs.next()) {
                Estudiantes estudiante = new Estudiantes();
                estudiante.establecerNombre(rs.getString("nombre"));
                estudiante.establecerApellido(rs.getString("apellido"));
                estudiante.establecerCalificaciones1(rs.getDouble("calificacion1"));
                estudiante.establecerCalificaciones2(rs.getDouble("calificacion2"));
                estudiante.establecerCalificaciones3(rs.getDouble("calificacion3"));
                estudiante.establecerPromedio();
                
                lista.add(estudiante);
            }

            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception: insertar Estudiante");
            System.out.println(e.getMessage());

        }

    }

    public ArrayList<Estudiantes> obtenerDataEstudiante() {

        return lista;
    }

}
