package co.com.falabella.pruebasistecredito.exceptions;

public class MensajeExceptions extends AssertionError {

    public MensajeExceptions(String mensajeError, Throwable cause) {
        super(mensajeError, cause);
    }
}
