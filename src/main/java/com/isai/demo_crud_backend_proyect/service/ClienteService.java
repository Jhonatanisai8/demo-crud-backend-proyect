package com.isai.demo_crud_backend_proyect.service;

import java.util.List;

import com.isai.demo_crud_backend_proyect.models.entitis.Cliente;

public interface ClienteService {

    Cliente guardarCliente(Cliente cliente);

    List<Cliente> obtenerClientes();

    Cliente obtenerClientePorId(Integer id);

    void eliminarPorId(Integer id);

    Cliente actualizarCliente(Cliente cliente);
}
