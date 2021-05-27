package com.coppel.ecommerce.getinfomaetelefonos.exception.own;

import com.coppel.ecommerce.getinfomaetelefonos.exception.BaseExceptionAbs;

public class ModelException extends BaseExceptionAbs {

  private static final long serialVersionUID = 1103009435797004716L;

  public ModelException(String message, Throwable cause, int errorCode) {
    super(message, cause, errorCode);
  }

  public ModelException(String message, Throwable cause) {
    super(message, cause);
  }

  public ModelException(String message) {
    super(message);
  }

  public ModelException(Throwable cause) {
    super(cause);
  }

}
