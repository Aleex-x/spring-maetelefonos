package com.coppel.ecommerce.getinfomaetelefonos.services;

import com.coppel.ecommerce.getinfomaetelefonos.entity.Telefono;
import com.coppel.ecommerce.getinfomaetelefonos.repository.TelefonosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TelefonosServiceImpl implements TelefonosService {
    @Autowired
    private TelefonosRepository telefonosRepository;

    @Override
    public Optional<List<Telefono>> getByPhoneNumber(Long numero) {
        return telefonosRepository.findByNumTelefono(numero);
    }
}
