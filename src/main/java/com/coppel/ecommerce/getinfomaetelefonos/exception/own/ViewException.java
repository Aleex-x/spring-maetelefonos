package com.coppel.ecommerce.getinfomaetelefonos.exception.own;

import com.coppel.ecommerce.getinfomaetelefonos.exception.BaseExceptionAbs;

public class ViewException extends BaseExceptionAbs {

  private static final long serialVersionUID = 1604461614259148255L;

  public ViewException(String message, Throwable cause, int errorCode) {
    super(message, cause, errorCode);
  }

  public ViewException(String message, Throwable cause) {
    super(message, cause);
  }

  public ViewException(String message) {
    super(message);
  }

  public ViewException(Throwable cause) {
    super(cause);
  }

}
