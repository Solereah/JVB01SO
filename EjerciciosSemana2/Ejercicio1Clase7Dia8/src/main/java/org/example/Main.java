package org.example;
import org.example.logica.Estudiante;
import java.sql.*;


public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {


        //Establecer una conexión con la base de datos
        String url = "jdbc:mysql://localhost:3306/universidad";
        Connection c = DriverManager.getConnection(url, "root", "$Pechungo.2023");
        System.out.println("Conexión establecida!!");

        //Se crean los estudiantes a insertar
        Estudiante estudiante1 = new Estudiante(1, "Juan Perez", 20, 6.5);
        Estudiante estudiante2 = new Estudiante(2, "Alfredo Casero", 19, 8.0);
        Estudiante estudiante3 = new Estudiante(3, "Ada Lovelace", 18, 9.5);


        //Prepara la sentencia
        String insertSql = "INSERT INTO estudiantes(nombre, edad, calificacion) VALUES (?,?,?)";

        //Declara el statement
        PreparedStatement statement = c.prepareStatement(insertSql);

        //Setea los parametros para cada registro
        statement.setString(1, estudiante1.getNombre());
        statement.setInt(2, estudiante1.getEdad());
        statement.setDouble(3, estudiante1.getCalificacion());
        //Ejecuta la sentencia
        statement.executeUpdate();
        //Registro 2
        statement.setString(1, estudiante2.getNombre());
        statement.setInt(2, estudiante2.getEdad());
        statement.setDouble(3, estudiante2.getCalificacion());
        statement.executeUpdate();
        //Registro 3
        statement.setString(1, estudiante3.getNombre());
        statement.setInt(2, estudiante3.getEdad());
        statement.setDouble(3, estudiante3.getCalificacion());
        statement.executeUpdate();


        System.out.println("Registros insertados en la tabla: estudiantes!!");

        //Se obtienen los datos insertados
        String selectSql = "SELECT * FROM estudiantes";
        //Se crea una sentencia, apartir de la conexión establecida
        Statement s = c.createStatement();
        ResultSet rs = s.executeQuery(selectSql);

        //Se Recorre(iterar) el ResultSet devuelto para mostrar cada una de los registros
        while (rs.next()) {
            //Se imprimen los elementos de acuerdo a su tipo y posición
            System.out.println(rs.getInt(1) + " - " + rs.getString(2) + " - " + rs.getInt(3) + " - " + rs.getDouble(4));
            }

        String borradoSql = "DELETE FROM estudiantes WHERE id=2;";
        s.execute(borradoSql);
        //Se loguea cual fué el registro borrado
        System.out.println("Se borró el registro con ID=2!!");

        //Se consultan y muestran nuevamente los registros
        rs = s.executeQuery(selectSql);

        //Se Recorre(iterar) el ResultSet devuelto para mostrar cada una de los registros
        while (rs.next()) {
            //Se imprimen los elementos de acuerdo a su tipo y posición
            System.out.println(rs.getInt(1) + " - " + rs.getString(2) + " - " + rs.getInt(3) + " - " + rs.getDouble(4));
        }
    }

}

