/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteuno;

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
    ArrayList<Trabajador> lista = new ArrayList<>();

    public void establecerConexion() {

        try {
            // db parameters  
            String url = "jdbc:sqlite:bd/trabajadores.bd";
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

    public void insertarTrabajador(Trabajador trabajador) {

        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO trabajador (cedula,"
                    + "nombre,correo, sueldo, mes) "
                    + "values ('%s','%s','%s', %.2f, '%s')",
                    trabajador.obtenerCedula(),
                    trabajador.obtenerNombres(),
                    trabajador.obtenerCorreo(),
                    trabajador.obtenerSueldo(),
                    trabajador.obtenerMes());
            System.out.println(data);
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception:");
            System.out.println(e.getMessage());

        }
    }

    public void establecerDataTrabajador() {
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from trabajador;";

            ResultSet rs = statement.executeQuery(data);
            while (rs.next()) {
                Trabajador trabajador = new Trabajador();
                trabajador.establecerCedula(rs.getString("cedula"));
                trabajador.establecerNombres(rs.getString("nombre"));
                trabajador.establecerCorreo(rs.getString("correo"));
                trabajador.establecerSueldo(rs.getDouble("sueldo"));
                trabajador.establecerMes(rs.getString("mes"));

                lista.add(trabajador);
            }

            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception: insertarTrabajador");
            System.out.println(e.getMessage());

        }

    }

    public ArrayList<Trabajador> obtenerDataTrabajador() {

        return lista;
    }

}
