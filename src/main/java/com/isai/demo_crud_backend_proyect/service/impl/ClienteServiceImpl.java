package com.isai.demo_crud_backend_proyect.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.isai.demo_crud_backend_proyect.models.entitis.Cliente;
import com.isai.demo_crud_backend_proyect.repository.ClienteRepository;
import com.isai.demo_crud_backend_proyect.service.ClienteService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ClienteServiceImpl implements ClienteService {
    
    private final ClienteRepository clienteRepository;

    @Override
    public Cliente guardarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public List<Cliente> obtenerClientes() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente obtenerClientePorId(Integer id) {
        return clienteRepository.findById(id).orElseThrow();
    }

    @Override
    public void eliminarPorId(Integer id) {
        clienteRepository.deleteById(id);
    }

    @Override
    public Cliente actualizarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

}
