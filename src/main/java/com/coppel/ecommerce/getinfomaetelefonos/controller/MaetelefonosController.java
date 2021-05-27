package com.coppel.ecommerce.getinfomaetelefonos.controller;

import com.coppel.ecommerce.getinfomaetelefonos.entity.Telefono;
import com.coppel.ecommerce.getinfomaetelefonos.services.TelefonosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/maetelefonos")
public class MaetelefonosController {
    @Autowired
    private TelefonosService telefonosService;

    @GetMapping("/telefono/{numero}")
    public ResponseEntity<List<Telefono>> getByTelefono(@PathVariable("numero") Long numero) {
        return telefonosService.getByPhoneNumber(numero)
                .map(datos -> new ResponseEntity<>(datos, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
