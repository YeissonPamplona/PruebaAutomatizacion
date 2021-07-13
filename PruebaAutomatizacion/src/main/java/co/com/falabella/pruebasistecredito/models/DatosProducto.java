package co.com.falabella.pruebasistecredito.models;

public class DatosProducto {

    private String producto;
    private String tipoProducto;
    private String marca;
    private String nombreProducto;
    private String talla;

    public DatosProducto(String producto, String tipoProducto, String marca, String nombreProducto, String talla) {
        this.producto = producto;
        this.tipoProducto = tipoProducto;
        this.marca = marca;
        this.nombreProducto = nombreProducto;
        this.talla = talla;
    }

    public String getProducto() {
        return producto;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public String getMarca() {
        return marca;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public String getTalla() {
        return talla;
    }

}
