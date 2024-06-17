/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beans;

import java.sql.SQLException;
import java.util.List;

public interface PersonaDAO {
    public void insert(Persona persona) throws SQLException;
    public void update(Persona persona) throws SQLException;
    public void delete(Integer id) throws SQLException;
    public Persona read(Integer id) throws SQLException;
    public List<Persona> readAll() throws SQLException;
}
