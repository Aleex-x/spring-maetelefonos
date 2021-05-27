package com.coppel.ecommerce.getinfomaetelefonos.services;

import com.coppel.ecommerce.getinfomaetelefonos.entity.Telefono;

import java.util.List;
import java.util.Optional;

public interface TelefonosService {
    Optional<List<Telefono>> getByPhoneNumber(Long numero);
}
