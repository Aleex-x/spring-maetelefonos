package com.coppel.ecommerce.getinfomaetelefonos.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ResponseEntityExceptionHandler {

  @ExceptionHandler(BaseExceptionAbs.class)
  public final ResponseEntity<ResponseException> handleNotFoundException(BaseExceptionAbs ex) {
    return new ResponseEntity<ResponseException>(new ResponseException(ex),
        HttpStatus.INTERNAL_SERVER_ERROR);
  }

  /**
   * Clase POJO usada por @see
   * com.coppel.ecommerce.prototipo.exception.ResponseEntityExceptionHandler.handleNotFoundException(BaseExceptionAbs).
   * <br>
   * Anidada para no definirla en otro archivo ni hacerla pública. <br>
   * Privada para no ser usada fuera de esta clase. <br>
   * Los métodos getter y setter deben existir y ser públicos para que @ExceptionHandler funcione
   * correctamente.
   *
   */
  private class ResponseException {

    private String message;
    private String errorCode;
    private String stack;

    public ResponseException(BaseExceptionAbs cause) {
      this.message = cause.getMessage();
      this.errorCode = cause.getErrorCode() != null ? cause.getErrorCode().toString() : "";
      this.stack = cause.toString();
    }

    @SuppressWarnings("unused")
    public final String getMessage() {
      return message;
    }

    @SuppressWarnings("unused")
    public final void setMessage(String message) {
      this.message = message;
    }

    @SuppressWarnings("unused")
    public final String getErrorCode() {
      return errorCode;
    }

    @SuppressWarnings("unused")
    public final void setErrorCode(String errorCode) {
      this.errorCode = errorCode;
    }

    @SuppressWarnings("unused")
    public final String getStack() {
      return stack;
    }

    @SuppressWarnings("unused")
    public final void setStack(String stack) {
      this.stack = stack;
    }

  }
}
