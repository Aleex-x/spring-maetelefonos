package com.coppel.ecommerce.getinfomaetelefonos.exception.own;

import com.coppel.ecommerce.getinfomaetelefonos.exception.BaseExceptionAbs;

public class ControllerException extends BaseExceptionAbs {

  private static final long serialVersionUID = 4250399239423478234L;

  public ControllerException(String message, Throwable cause, int errorCode) {
    super(message, cause, errorCode);
  }

  public ControllerException(String message, Throwable cause) {
    super(message, cause);
  }

  public ControllerException(String message) {
    super(message);
  }

  public ControllerException(Throwable cause) {
    super(cause);
  }

}
