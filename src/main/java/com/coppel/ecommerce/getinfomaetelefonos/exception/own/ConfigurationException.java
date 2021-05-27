package com.coppel.ecommerce.getinfomaetelefonos.exception.own;

import com.coppel.ecommerce.getinfomaetelefonos.exception.BaseExceptionAbs;

public class ConfigurationException extends BaseExceptionAbs {

  private static final long serialVersionUID = -6575942327530558048L;

  public ConfigurationException(String message, Throwable cause, int errorCode) {
    super(message, cause, errorCode);
  }

  public ConfigurationException(String message, Throwable cause) {
    super(message, cause);
  }

  public ConfigurationException(String message) {
    super(message);
  }

  public ConfigurationException(Throwable cause) {
    super(cause);
  }

}
