/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beans;

import java.sql.SQLException;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PersonaDAOImp implements PersonaDAO{
    
    private String TABLE_NAME;
    private ConexionMySQL conMySQL;
    private Connection conn;
    
    public PersonaDAOImp(){
        TABLE_NAME = "persona";
        conMySQL = new ConexionMySQL();
    }

    @Override
    public void insert(Persona persona) throws SQLException {
        conn = conMySQL.getConnection();
        String insertQuery = "INSERT INTO "+TABLE_NAME+" (nif,nombre,apellido1,apellido2,ciudad,direccion,telefono,fecha_nacimiento,sexo,tipo) " 
                + "VAUES(?,?,?,?,?,?,?,?,?,?)";
        
        try (PreparedStatement ps = conn.prepareStatement(insertQuery)){
            ps.setInt(1, persona.getNifPersona());
            ps.setString(2,persona.getNombrePersona());
            ps.setString(3, persona.getApellido1Persona());
            ps.setString(4, persona.getApellido2Persona());
            ps.setString(5, persona.getCiudadPersona());
            ps.setString(6, persona.getDireccionPersona());
            ps.setString(7,persona.getTelefonoPersona());
            ps.setDate(8, persona.getFecha_NacimientoPersona());
            ps.setString(9, persona.getSexoPersona());
            ps.setString(10, persona.getTipoPersona());
            ps.executeUpdate();
        }
        conn.close();
    }

    @Override
    public void update(Persona persona) throws SQLException {
        conn = conMySQL.getConnection();
        String updateQuery = "UPDATE "+TABLE_NAME+" SET (nif,nombre,apellido1,apellido2,ciudad,direccion,telefono,fecha_nacimiento,sexo,tipo) = " + 
                "(?,?,?,?,?,?,?,?,?,?) WHERE id = ?";
        
        try (PreparedStatement ps = conn.prepareStatement(updateQuery)){
            ps.setInt(1, persona.getNifPersona());
            ps.setString(2,persona.getNombrePersona());
            ps.setString(3, persona.getApellido1Persona());
            ps.setString(4, persona.getApellido2Persona());
            ps.setString(5, persona.getCiudadPersona());
            ps.setString(6, persona.getDireccionPersona());
            ps.setString(7,persona.getTelefonoPersona());
            ps.setDate(8, persona.getFecha_NacimientoPersona());
            ps.setString(9, persona.getSexoPersona());
            ps.setString(10, persona.getTipoPersona());
            ps.setInt(11, persona.getIdPersona());
            ps.executeUpdate();
        }
        conn.close();
    }

    @Override
    public void delete(Integer id) throws SQLException {
         conn = conMySQL.getConnection();
        String deleteQuery = "DELETE FROM "+TABLE_NAME+" WHERE id = ?";
        
        try (PreparedStatement ps = conn.prepareStatement(deleteQuery)){
            ps.setInt(1, id);
            ps.executeUpdate();
        }
        conn.close();
    }

    @Override
    public Persona read(Integer id) throws SQLException {
        Persona persona = null;
        conn = conMySQL.getConnection();
        String Query = "SELECT id,nif,nombre,apellido1,apellido2,ciudad,direccion,telefono,fecha_nacimiento,sexo,tipo FROM "+
                TABLE_NAME+ " WHERE id = ?";
        try(PreparedStatement ps = conn.prepareStatement(Query)){
            ps.setInt(1, id);
            try(ResultSet rs = ps.executeQuery()){
                if(rs.next()){
                    persona = new Persona(
                            id, 
                            rs.getInt("nif"),
                            rs.getString("nombre"),
                            rs.getString("apellido1"),
                            rs.getString("apellido2"),
                            rs.getString("ciudad"),
                            rs.getString("direccion"),
                            rs.getString("telefono"),
                            rs.getDate("fecha_nacimiento"),
                            rs.getString("sexo"),
                            rs.getString("tipo")
                    );
                }
            }
        }
        return persona;
    }

    @Override
    public List<Persona> readAll() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
