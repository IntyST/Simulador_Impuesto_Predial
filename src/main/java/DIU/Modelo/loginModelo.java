/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.Modelo;

/**
 *
 * @author pablo
 */
public class loginModelo {
    private String cedulaU;
    private String contrasenia;
    public loginModelo(){
        
    }
    public loginModelo(String cedulaU, String contrasenia){
        this.cedulaU = cedulaU;
        this.contrasenia=contrasenia;
    }

    /**
     * @return the cedulaU
     */
    public String getCedulaU() {
        return cedulaU;
    }

    /**
     * @param cedulaU the cedulaU to set
     */
    public void setCedulaU(String cedulaU) {
        this.cedulaU = cedulaU;
    }

    /**
     * @return the contrasenia
     */
    public String getContrasenia() {
        return contrasenia;
    }

    /**
     * @param contrasenia the contrasenia to set
     */
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
       
    
}
