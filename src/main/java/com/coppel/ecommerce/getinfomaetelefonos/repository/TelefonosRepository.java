package com.coppel.ecommerce.getinfomaetelefonos.repository;

import com.coppel.ecommerce.getinfomaetelefonos.entity.Telefono;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface TelefonosRepository extends CrudRepository<Telefono, Long> {
    Optional<List<Telefono>> findByNumTelefono(Long numTelefono);
}
