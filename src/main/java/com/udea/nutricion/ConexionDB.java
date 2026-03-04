package com.udea.nutricion;
import java.sql.Connection;
import java.sql.DriverManager;
import  java.sql.SQLException;
public class ConexionDB {
    private static final String URL= "jdbc:mysql://localhost:3306/interchanges_food";// conectamos el puerto
    private  static  final String USER="root";// creamos una constante del usuario
    private static final String PASS="ProyectoSistemas2026!";//constante de la contraseña
    public static Connection obtenerConexion(){//creamos clase validar conexion
        Connection conexion= null;// conexion sin definir valor
        try{// si la conexion es exitosa aparecera este mensaje
            conexion= DriverManager.getConnection(URL,USER,PASS);
            System.out.println("Conexion establecida a la base de datos");
        }catch (SQLException error){
            System.out.println("error no se establecio conexion"+ error.getMessage());

        }
        return conexion;
    }

}
