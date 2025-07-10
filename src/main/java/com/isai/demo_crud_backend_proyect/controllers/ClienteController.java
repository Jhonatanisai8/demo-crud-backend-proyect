package com.isai.demo_crud_backend_proyect.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.isai.demo_crud_backend_proyect.models.entitis.Cliente;
import com.isai.demo_crud_backend_proyect.service.ClienteService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/v1")
public class ClienteController {

    private final ClienteService clienteService;

    @RequestMapping(path = "/clientes", method = RequestMethod.POST)
    @ResponseStatus(code = HttpStatus.OK)
    public Cliente guardarCliente(@RequestBody Cliente cliente) {
        return clienteService.guardarCliente(cliente);
    }
}
