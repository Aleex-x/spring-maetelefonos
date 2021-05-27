package com.coppel.ecommerce.getinfomaetelefonos.exception.own;

import com.coppel.ecommerce.getinfomaetelefonos.exception.BaseExceptionAbs;

public class ServiceException extends BaseExceptionAbs {

  private static final long serialVersionUID = 5867706271027285697L;

  public ServiceException(String message, Throwable cause, int errorCode) {
    super(message, cause, errorCode);
  }

  public ServiceException(String message, Throwable cause) {
    super(message, cause);
  }

  public ServiceException(String message) {
    super(message);
  }

  public ServiceException(Throwable cause) {
    super(cause);
  }

}
