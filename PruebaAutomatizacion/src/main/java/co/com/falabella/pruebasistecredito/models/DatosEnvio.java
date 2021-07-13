package co.com.falabella.pruebasistecredito.models;

public class DatosEnvio {

    private String municipio;
    private String ciudad;
    private String barrio;
    private String direccion;
    private String numDepartamento;

    public DatosEnvio(String municipio, String ciudad, String barrio, String direccion, String numDepartamento) {
        this.municipio = municipio;
        this.ciudad = ciudad;
        this.barrio = barrio;
        this.direccion = direccion;
        this.numDepartamento = numDepartamento;
    }

    public String getMunicipio() {
        return municipio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getBarrio() {
        return barrio;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNumDepartamento() {
        return numDepartamento;
    }
}
