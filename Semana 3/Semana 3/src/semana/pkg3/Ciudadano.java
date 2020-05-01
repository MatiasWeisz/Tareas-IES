/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana.pkg3;

/**
 *
 * @author matia
 */
public class Ciudadano extends Persona {

    private String provincia;
    private long dni;

    public Ciudadano(String newNombre, String newApellido, String newProvincia, long newDni) {
        super(newNombre, newApellido);
        this.provincia = newProvincia;
        this.dni = newDni;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public long getDni() {
        return dni;
    }
}
