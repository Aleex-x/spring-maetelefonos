package com.coppel.ecommerce.getinfomaetelefonos.exception;

/**
 * Clase usada para todas las excepciones generadas.<br>
 * Abstracta para no ser instanciada directamente y para definir implementaciones de métodos que
 * serán comunes a todas las excepciones. <br>
 *
 */
public abstract class BaseExceptionAbs extends RuntimeException {

  private static final long serialVersionUID = -1302397205638799956L;
  private Integer errorCode = null;
  /*
   * No vuelva a definir las variables "message" o "cause", utilice las variables heredadas con
   * super()
   */

  /**
   * Evitar el uso del constructor predeterminado obliga a que se implemente uno de los otros
   * constructores.
   */
  @SuppressWarnings("unused")
  private BaseExceptionAbs() {}

  /**
   * Constructor base.
   * 
   * @param message Mensaje con la descripción del error.
   * @param cause Objeto que contiene la excepción.
   * @param errorCode Código del error.
   */
  public BaseExceptionAbs(String message, Throwable cause, int errorCode) {
    super(message, cause);
    this.errorCode = errorCode;
  }

  /**
   * Constructor base.
   * 
   * @param message Mensaje con la descripción del error.
   * @param cause Objeto que contiene la excepción.
   */
  public BaseExceptionAbs(String message, Throwable cause) {
    super(message, cause);
  }

  /**
   * Constructor base.
   * 
   * @param message Mensaje con la descripción del error.
   */
  public BaseExceptionAbs(String message) {
    super(message);
  }

  /**
   * Constructor base.
   * 
   * @param cause Objeto que contiene la excepción.
   */
  public BaseExceptionAbs(Throwable cause) {
    super(cause);
  }

  /**
   * Obtiene el código de error de la excepción.
   * 
   * @return El código de error de esta excepción. Default null.
   */
  public final Integer getErrorCode() {
    return errorCode;
  }

  @Override
  public String toString() {
    return new StringBuilder()
        .append(this.getClass().getSimpleName() /* Nombre correcto de la clase de objeto */)
        .append(" [errorCode=").append(errorCode).append(", message=").append(getMessage())
        .append(", cause=").append(getCause()).append("]").toString();
  }
}
