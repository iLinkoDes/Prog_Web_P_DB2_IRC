/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beans;

public class Persona implements java.io.Serializable{
    private int idPersona;
    private int nifPersona;
    private String nombrePersona;
    private String apellido1Persona;
    private String apellido2Persona;
    private String ciudadPersona;
    private String direccionPersona;
    private String telefonoPersona;
    private String sexoPersona;
    private String tipoPersona;
    
    public Persona(int idPersona, int nifPersona, String nombrePersona, String apellido1Persona, String apellido2Persona, String ciudadPersona, 
            String direccionPersona, String telefonoPersona, String sexoPersona, String tipoPersona){
        
        this.idPersona = idPersona;
        this.nifPersona = nifPersona;
        this.apellido1Persona = apellido1Persona;
        this.apellido2Persona = apellido2Persona;
        this.ciudadPersona = ciudadPersona;
        this.direccionPersona = direccionPersona;
        this.telefonoPersona = telefonoPersona;
        this.sexoPersona = sexoPersona;
        this.tipoPersona = tipoPersona;
    }
    
    public int getIdPersona(){
        return idPersona;
    }
    
    public int getNifPersona(){
        return nifPersona;
    }
    
    public String getApellido1Persona(){
        return apellido1Persona;
    }
    
    public String getApellido2Persona(){
        return apellido2Persona;
    }
    
    public String getCiudadPersona(){
        return ciudadPersona;
    }
    
    public String getDireccionPersona(){
        return direccionPersona;
    }
    
    public String getTelefonoPersona(){
        return telefonoPersona;
    }
    
    public String getSexoPersona(){
        return sexoPersona;
    }
    
    public String getTipoPersona(){
        return tipoPersona;
    }
    
    public void setIdPersona(int idPersona){
        this.idPersona = idPersona;
    }
    
    public void setNifPersona(int nifPersona){
        this.nifPersona = nifPersona;
    }
    
    public void setApellido1Persona(String apellido1Persona){
        this.apellido1Persona = apellido1Persona;
    }
    
    public void setApellido2Persona(String apellido2Persona){
        this.apellido2Persona = apellido2Persona;
    }
    
    public void setCiudadpersona(String ciudadPersona){
        this.ciudadPersona = ciudadPersona;
    }
    
    public void setDireccionPersona(String direccionPersona){
        this.direccionPersona = direccionPersona;
    }
    
    public void setTelefonoPersona(String telefonoPersona){
        this.telefonoPersona = telefonoPersona;
    }
    
    public void setSexoPersona(String sexoPersona){
        this.sexoPersona = sexoPersona;
    }
    
    public void setTipoPersona(String tipoPersona){
        this.tipoPersona = tipoPersona;
    }
}
